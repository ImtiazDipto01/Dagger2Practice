package com.example.dipto.dagger2practice;

/**
 * Created by Dipto on 1/7/2018.
 */

public class EmployeeSalary {

    private EidBonus eidBonus ;

    public EmployeeSalary(EidBonus eidBonus){
        this.eidBonus = eidBonus ;
    }

    public void calculateSalaryWithEidBonus(int salary){
        eidBonus.setBonusWithSalary(salary);
    }

    public void normalBonus(){
        eidBonus.withoutEidBonus();
    }

    public int getEmployeeSalaryWithEidBonus(){
        return eidBonus.getSalaryWithEidBonus() ;
    }
}
