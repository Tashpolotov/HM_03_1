package com.example.hm_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView textView;
    Button generat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText =  findViewById(R.id.kod);
        btn = findViewById(R.id.enter);
        generat = findViewById(R.id.generate);
        textView = findViewById(R.id.phone_number1);

        textView.setText(getIntent().getStringExtra("phone"));

        generat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int val = random.nextInt(999999-100000)+100000;
                generat.setText(Integer.toString(val));
            }
        });

        btn.setOnClickListener(view -> {
        if (editText.getText().toString().equals(generat.getText().toString())){
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);

            Intent intent1 = new Intent(MainActivity2.this, MainActivity3.class);
            intent1.putExtra("result2", textView.getText().toString());
            startActivity(intent1);
        } else {
            Toast.makeText(getApplicationContext(), "нет кода", Toast.LENGTH_LONG).show();
        }
        });


    }
}