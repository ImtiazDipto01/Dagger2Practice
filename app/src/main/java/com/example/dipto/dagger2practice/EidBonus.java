package com.example.dipto.dagger2practice;

/**
 * Created by Dipto on 1/4/2018.
 */

public class EidBonus {

    private int bonusAmount ;

    public EidBonus(){
        this.bonusAmount = 5000 ;
    }

    public int getSalaryWithEidBonus() {
        return bonusAmount;
    }

    public void setBonusWithSalary(int salaryAmount) {
        this.bonusAmount = this.bonusAmount + salaryAmount ;
    }

    public void withoutEidBonus(){
        this.bonusAmount = 0 ;
    }

}
