package com.example.raunak.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityA extends AppCompatActivity {

    private TextView txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        txt1 = findViewById(R.id.TextView22);
        txt2 = findViewById(R.id.TextView24);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String s1 = bundle.getString("email");
        String s2 = bundle.getString("pwd");

        txt1.setText(s1);
        txt2.setText(s2);
    }
}
