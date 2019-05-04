package com.example.odev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Anasayfa extends Activity {

    Button calculator, sensor;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anasayfa);
        calculator=findViewById(R.id.btncalculator);
        sensor=findViewById(R.id.btnsensor);

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calc=new Intent(Anasayfa.this, Calculator.class);
                startActivity(calc);
            }
        });

        sensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sens=new Intent(Anasayfa.this, Sensor.class);
                startActivity(sens);
            }
        });
    }
}