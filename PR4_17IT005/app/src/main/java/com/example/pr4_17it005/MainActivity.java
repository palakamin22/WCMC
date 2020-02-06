package com.example.pr4_17it005;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Temp;
    private RadioGroup radioGroup;
    private TextView text1,text2,text3,text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Temp = findViewById(R.id.Edit1);
        radioGroup=findViewById(R.id.radioGroup);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.C:
                        double K,F;
                        double intValue = Double.valueOf(Temp.getText().toString());
                        K = intValue + 273.15;
                        F = (intValue*9/5) + 32;
                        text1.setText("Fahrenheit:");
                        text3.setText("Kelvin:");
                        text4.setText(Double.toString(K) +" K" );
                        text2.setText(Double.toString(F) + " F");
                        break;
                    case R.id.F:
                        double C,K1;
                        double intValue1 = Double.valueOf(Temp.getText().toString());
                        C = (intValue1-32)*5/9;
                        K1 = C+273.15;
                        text1.setText("Celsius:");
                        text3.setText("Kelvin:");
                        text4.setText(Double.toString(K1) +" K" );
                        text2.setText(Double.toString(C) + " C");
                        break;
                    case R.id.K:
                        double C1,F1;
                        double intValue2 = Double.valueOf(Temp.getText().toString());
                        C1 = intValue2 - 273.15;
                        F1 = (C1*9/5) + 32;
                        text3.setText("Fahrenheit:");
                        text1.setText("Celsius:");
                        text2.setText(Double.toString(C1) +" C" );
                        text4.setText(Double.toString(F1) + " F");
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"Please select unit properly",Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
    }
}
