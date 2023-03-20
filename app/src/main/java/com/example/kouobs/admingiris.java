package com.example.kouobs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class admingiris extends AppCompatActivity {
    EditText id,sifre;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admingiris);

        id=findViewById(R.id.admnıd);
        sifre=findViewById(R.id.admnsifre);
        btn=findViewById(R.id.admngir);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(id.getText().toString().trim().equals("")||sifre.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Id ve Şifre boş geçilemez",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}