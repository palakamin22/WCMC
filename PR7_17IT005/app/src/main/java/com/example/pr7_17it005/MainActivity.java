package com.example.pr7_17it005;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout constraintlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintlayout = findViewById(R.id.constraint_layout);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.red:
                this.constraintlayout.setBackgroundColor(Color.rgb(235, 104, 87));
                Toast.makeText(getApplicationContext(),"RED colour selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.green:
                this.constraintlayout.setBackgroundColor(Color.rgb(131, 242, 157));
                Toast.makeText(getApplicationContext(),"GREEN colour selected",Toast.LENGTH_LONG).show();
                return true;
            case R.id.blue:
                this.constraintlayout.setBackgroundColor(Color.rgb(132, 205, 245));
                Toast.makeText(getApplicationContext(),"BLUE colour selected",Toast.LENGTH_LONG).show();
                return true;
            default: return false;
        }
    }
}
