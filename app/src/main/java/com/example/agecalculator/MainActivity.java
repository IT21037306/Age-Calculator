package com.example.agecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //create instance variables
    TextView tvSh , tvSh2 ;
    Button btnCalc;
    EditText etYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding the variables with views
        tvSh = findViewById(R.id.tvShow);
        btnCalc = findViewById(R.id.btnCalculate);
        etYear = findViewById(R.id.etYear);


        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //extract input from layout

                //input year
                String year = etYear.getText().toString();
                int IYear = Integer.parseInt(year);

                //get current year
                int CYear = Calendar.getInstance().get(Calendar.YEAR);

                //calculation
                int result = CYear - IYear;

                //display the age
                tvSh.setText("Your Age is " + result + "Years");

            }
        });

    }


}
