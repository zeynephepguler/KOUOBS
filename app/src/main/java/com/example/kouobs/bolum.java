package com.example.kouobs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class bolum extends AppCompatActivity {
    Button dvm;
    Spinner spinnerbelge;
    String []  belgeler ={"Yaz okulu","Yatay Geçiş","DGS","ÇAP","Ders intibakı"};
    ArrayAdapter adp;
    int deger=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolum);

        spinnerbelge=findViewById(R.id.belge);
        adp=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,belgeler);
        spinnerbelge.setAdapter(adp);

        dvm=findViewById(R.id.devam);


        spinnerbelge.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String secim=spinnerbelge.getItemAtPosition(i).toString();
                if(secim=="Yaz okulu")
                    deger=1;
                else if (secim=="Yatay Geçiş")
                    deger=2;
                else if(secim=="ÇAP")
                    deger=3;
                else if(secim=="Ders intibakı")
                    deger=4;
                else
                    deger=5;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        dvm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(deger==1)
                    startActivity(new Intent(bolum.this,yzok.class));
                else if(deger==2)
                    startActivity(new Intent(bolum.this,yataygecis.class));
                else if(deger==3)
                    startActivity(new Intent(bolum.this,cap.class));
                else if(deger==4)
                    startActivity(new Intent(bolum.this,intibak.class));
            }
        });
    }

}