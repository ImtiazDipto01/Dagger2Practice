package com.example.dipto.dagger2practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.dipto.dagger2practice.component.DaggerEmployeeSalaryComponent;
import com.example.dipto.dagger2practice.component.EmployeeSalaryComponent;
import com.example.dipto.dagger2practice.module.EmployeeSalaryModule;

public class InjectActivity extends AppCompatActivity {

    TextView salaryWithEidBonus ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inject);

        salaryWithEidBonus = findViewById(R.id.salary_with_eid_bonus) ;

        //EmployeeSalaryComponent component = EmployeeSalaryComponent
        //EmployeeSalaryComponent component = EmployeeSalaryComponent.Builder().

        EmployeeSalaryComponent component = DaggerEmployeeSalaryComponent.builder().employeeSalaryModule(new EmployeeSalaryModule()).build() ;

    }
}
