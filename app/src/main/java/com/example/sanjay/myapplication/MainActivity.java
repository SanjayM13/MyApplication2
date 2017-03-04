package com.example.sanjay.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView firstTextView = (TextView) findViewById(R.id.textView);
        Button Inc = (Button) findViewById(R.id.inc_button);
        Inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                firstTextView.setText(" " + count);
            }
        });

        Button Dec = (Button) findViewById(R.id.dec_button);
        Dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                firstTextView.setText(" " + count);
            }
        });
    }
}
