package com.example.dipto.dagger2practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InjectActivity extends AppCompatActivity {

    TextView salaryWithEidBonus ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inject);

        salaryWithEidBonus = findViewById(R.id.salary_with_eid_bonus) ;

        //EmployeeSalaryComponent component = EmployeeSalaryComponent
        //EmployeeSalaryComponent component = EmployeeSalaryComponent.Builder().
    }
}
