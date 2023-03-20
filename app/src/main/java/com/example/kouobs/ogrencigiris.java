package com.example.kouobs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ogrencigiris extends AppCompatActivity {
    Button ogrgiris,sifremiunuttum;
    EditText no,sfr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogrencigiris);
        ogrgiris=findViewById(R.id.ogrgiris);
        sifremiunuttum=findViewById(R.id.sfremiunuttum);
        no=findViewById(R.id.ogrno);
        sfr=findViewById(R.id.ogrencisifre);

        ogrgiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(no.getText().toString().trim().equals("")||sfr.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Öğrenci Numarası ve Şifre alanı boş geçilemez",Toast.LENGTH_LONG).show();
                }else{
                startActivity(new Intent(ogrencigiris.this,ogrencianasayfa.class));}
            }
        });

        sifremiunuttum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( ogrencigiris.this, com.example.kouobs.sifremiunuttum.class));
            }
        });
    }
}