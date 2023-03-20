package com.example.kouobs;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;

public class ogrkayit extends AppCompatActivity {
    Button resimsec,kaytbuton;
    ImageView ogrresmi;
    static final int ResimSec=12;
    Uri resimUri;
    FileOutputStream outputStream;
    EditText ogrenciadi,ogrencikimlikno,tekrarsifre,sinifi,bolumu,fakülte,universitesi,EmailAddress,ogrencisifre,ogrencino,telno,ogrencidogum,ogrencisoyadi,adres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogrkayit);
        ogrresmi=findViewById(R.id.ogrresmi);
        kaytbuton=findViewById(R.id.kaytbuton);
        ogrencikimlikno=(EditText) findViewById(R.id.ogrencikimlikno);
        tekrarsifre=(EditText) findViewById(R.id.tekrarsifre);
        sinifi=(EditText) findViewById(R.id.sinifi);
        bolumu=(EditText) findViewById(R.id.bolumu);
        fakülte=(EditText) findViewById(R.id.fakülte);
        universitesi=(EditText) findViewById(R.id.universitesi);
        EmailAddress=(EditText) findViewById(R.id.EmailAddress);
        ogrencisifre=(EditText) findViewById(R.id.ogrencisifre);
        ogrencino=(EditText) findViewById(R.id.ogrencino);
        telno=(EditText) findViewById(R.id.telno);
        ogrencidogum=(EditText) findViewById(R.id.ogrencidogum);
        ogrencisoyadi=(EditText) findViewById(R.id.ogrencisoyadi);
        ogrenciadi=(EditText) findViewById(R.id.ogrenciadi);
        adres=(EditText) findViewById(R.id.adres);





    resimsec=findViewById(R.id.resimsec);
    resimsec.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent (Intent.ACTION_GET_CONTENT);
            intent.setType("image/*");
            startActivityForResult(intent,ResimSec);

        }


    }

    );





        try {
       outputStream= openFileOutput("bilgiler.txt", Context.MODE_APPEND);
    }
    catch (Exception e){
        System.out.println(e);
    }


    kaytbuton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(ogrenciadi.getText().toString().trim().equals("")||ogrencisoyadi.getText().toString().trim().equals("")||ogrencisifre.getText().toString().trim().equals("")
                    ||ogrencino.getText().toString().trim().equals("")||ogrencikimlikno.getText().toString().trim().equals("")
                    ||tekrarsifre.getText().toString().trim().equals("")||telno.getText().toString().trim().equals("")||fakülte.getText().toString().trim().equals("")
                    ||sinifi.getText().toString().trim().equals("")||universitesi.getText().toString().trim().equals("")
                    ||adres.getText().toString().trim().equals("")|| bolumu.getText().toString().trim().equals("") ||EmailAddress.getText().toString().trim().equals("")
                    ||ogrencidogum.getText().toString().trim().equals("")){
                Toast.makeText(getApplicationContext(),"Tüm alanları doldurmanız gerekmektedir.",Toast.LENGTH_LONG).show();


            }else if(!(ogrencisifre.getText().toString().trim().equals(tekrarsifre.getText().toString().trim()))){
                Toast.makeText(ogrkayit.this, "Şifreler Eşleşmiyor", Toast.LENGTH_LONG).show();

            }else {

                startActivity(new Intent(ogrkayit.this,ogrencianasayfa.class));
                Toast.makeText(getApplicationContext(),"Kayıt Başarılı",Toast.LENGTH_LONG).show();


            }
        }


    });

    }

    @CallSuper
    protected void superonActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==ResimSec&& resultCode==RESULT_OK) {
            resimUri = data.getData();
            ogrresmi.setImageURI(resimUri);
        }else if (resultCode==RESULT_CANCELED)
            {
            Toast.makeText(this, "Resim Seçiniz", Toast.LENGTH_LONG).show();
            }
    }
}