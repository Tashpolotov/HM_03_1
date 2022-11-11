package com.example.hm_3_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView numbershow;
    TextView show1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        numbershow = findViewById(R.id.numbershow);
        show1 = findViewById(R.id.show1);

       show1.setText(getIntent().getStringExtra("result2"));




    }
}