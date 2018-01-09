package com.example.dipto.dagger2practice;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Dipto on 1/7/2018.
 */

@Singleton
@Component(modules = {EmployeeSalaryModule.class})
public interface EmployeeSalaryComponent {

    EmployeeSalary provideEmployeeSalary() ;

    @Component.Builder
    interface Builder {
        EmployeeSalaryComponent build();
        Builder appModule(EmployeeSalaryModule appModule);
    }
}
