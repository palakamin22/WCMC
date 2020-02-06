package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText1 = findViewById(R.id.editText);
        final EditText editText2 = findViewById(R.id.editText2);
        Button add = findViewById(R.id.button);
        Button substract = findViewById(R.id.button2);
        Button divide = findViewById(R.id.button3);
        Button multiply = findViewById(R.id.button4);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Addition: " + Integer.toString(Integer.parseInt(editText1.getText().toString())+Integer.parseInt(editText2.getText().toString())),Toast.LENGTH_SHORT).show();
            }
        });
        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Subtraction: " + Integer.toString(Integer.parseInt(editText1.getText().toString())-Integer.parseInt(editText2.getText().toString())),Toast.LENGTH_SHORT).show();
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Division: " + Integer.toString(Integer.parseInt(editText1.getText().toString())/Integer.parseInt(editText2.getText().toString())),Toast.LENGTH_SHORT).show();
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Multiplication: " + Integer.toString(Integer.parseInt(editText1.getText().toString())*Integer.parseInt(editText2.getText().toString())),Toast.LENGTH_SHORT).show();
            }
        });
    }

}
