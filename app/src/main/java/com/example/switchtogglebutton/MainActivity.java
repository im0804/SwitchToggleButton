package com.example.switchtogglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tb;
    Switch sw;
    LinearLayout hrzntl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = findViewById(R.id.tb);
        sw = findViewById(R.id.sw);
        hrzntl = findViewById(R.id.hrzntl);
    }

    public void clicking(View view) {
        if (tb.isChecked() && sw.isChecked()) {
            hrzntl.setBackgroundColor(Color.BLUE);
        }
        else {
            if (tb.isChecked() && sw.isChecked() == false) {
                hrzntl.setBackgroundColor(Color.GRAY);
            }
            else {
                if (tb.isChecked() == false && sw.isChecked()) {
                    hrzntl.setBackgroundColor(Color.RED);
                }
                else {
                    if (tb.isChecked() == false && sw.isChecked() == false) {
                        hrzntl.setBackgroundColor(Color.MAGENTA);
                    }
                }
            }
        }
    }
}

