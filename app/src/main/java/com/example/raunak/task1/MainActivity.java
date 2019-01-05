package com.example.raunak.task1;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    private EditText ed1, ed2;
    private String s1, s2;
    private final int REQUEST_CODE = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageView2);
        ed1 = (EditText) findViewById(R.id.editText11);
        ed2 = (EditText) findViewById(R.id.editText12);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = ed1.getText().toString();
                s2 = ed2.getText().toString();
                String s3 = "abc123@gmail.com";
                String s4 = "abc123";

                if(s1.equals("") || s2.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Field cannot be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(s1.equals(s3) && s2.equals(s4))
                {
                    Intent intent = new Intent(MainActivity.this,ActivityA.class);
                    intent.putExtra("email",s1);
                    intent.putExtra("pwd", s2);
                    intent.putExtra("val",1);
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this, ActivityA.class);
                    //intent.putExtra("val",2);
                    startActivityForResult(intent,REQUEST_CODE);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String result;
        //if(requestCode==REQUEST_CODE && resultCode==RESULT_OK)
        //    ;//result = data.getStringExtra("return");
    }
}
