package com.example.dipto.dagger2practice;

import javax.inject.Inject;

/**
 * Created by Dipto on 1/7/2018.
 */

public class EmployeeSalary {

    private EidBonus eidBonus ;

    @Inject
    public EmployeeSalary(EidBonus eidBonus){
        this.eidBonus = eidBonus ;
    }

    public void calculateSalaryWithEidBonus(){
        eidBonus.setBonusWithSalary(10000);
    }

    public void normalBonus(){
        eidBonus.withoutEidBonus();
    }

    public int getEmployeeSalaryWithEidBonus(){
        return eidBonus.getSalaryWithEidBonus() ;
    }
}
