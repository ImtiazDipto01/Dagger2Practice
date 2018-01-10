package com.example.dipto.dagger2practice.module;

import com.example.dipto.dagger2practice.EidBonus;
import com.example.dipto.dagger2practice.EmployeeSalary;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Dipto on 1/7/2018.
 */

@Module
public class EmployeeSalaryModule {

    @Provides
    @Singleton
    EidBonus provideEidBonus(){
        return new EidBonus() ;
    }

    @Provides
    @Singleton
    EmployeeSalary provideEmployeeSalary(){
        return new EmployeeSalary(new EidBonus());
    }
}
