package com.example.kouobs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sifremiunuttum extends AppCompatActivity {
    Button sifredegis,btn;
    EditText no,soru,sfr,sfr2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifremiunuttum);

        sifredegis=findViewById(R.id.sifredegis);
        no=findViewById(R.id.ogrno);
        soru=findViewById(R.id.güvenliksorusu);
        sfr=findViewById(R.id.yenisifre);
        sfr2=findViewById(R.id.sifretekrar);

        sifredegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(no.getText().toString().trim().equals("")||soru.getText().toString().trim().equals("")||sfr.getText().toString().trim().equals("")||sfr2.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Tüm alanları doldurmanız gerekmektedir.",Toast.LENGTH_LONG).show();

                }  else if(!(sfr.getText().toString().trim().equals(sfr2.getText().toString().trim()))){
                    Toast.makeText(sifremiunuttum.this, "Şifreler Eşleşmiyor", Toast.LENGTH_LONG).show();

                }else{
                    startActivity(new Intent(sifremiunuttum.this,ogrencigiris.class));
                    Toast.makeText(sifremiunuttum.this, "Şifreniz Değiştirildi", Toast.LENGTH_LONG).show(); }


            }
        });




    }
}