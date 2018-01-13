package com.example.dipto.dagger2practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.dipto.dagger2practice.component.DaggerEmployeeSalaryComponent;
import com.example.dipto.dagger2practice.component.EmployeeSalaryComponent;
import com.example.dipto.dagger2practice.module.EmployeeSalaryModule;

public class InjectActivity extends AppCompatActivity {

    TextView salaryWithEidBonus ;
    EmployeeSalary employeeSalary ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inject);

        salaryWithEidBonus = (TextView) findViewById(R.id.employee_salary) ;

        EmployeeSalaryComponent component = DaggerEmployeeSalaryComponent.builder().employeeSalaryModule(new EmployeeSalaryModule()).build() ;
        employeeSalary = component.provideEmployeeSalary() ;
        employeeSalary.calculateSalaryWithEidBonus(15000);
        String value = String.valueOf(employeeSalary.getEmployeeSalaryWithEidBonus());
        salaryWithEidBonus.setText(value);
    }
}
