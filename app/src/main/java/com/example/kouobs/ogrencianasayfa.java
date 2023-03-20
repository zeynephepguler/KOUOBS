package com.example.kouobs;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ogrencianasayfa extends AppCompatActivity {
    ImageView kayıtlıogrres;
    static final int ResimSec=12;
    Uri resimUri;
    Button basvuruyap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogrencianasayfa);
        kayıtlıogrres=findViewById(R.id.ogrresmi);

        basvuruyap=(Button) findViewById(R.id.basvuruyap);
        basvuruyap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ogrencianasayfa.this,basvurularim.class));
            }
        });


    }


            @CallSuper
            protected void superonActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

                    resimUri = data.getData();
                    kayıtlıogrres.setImageURI(resimUri);}
}
