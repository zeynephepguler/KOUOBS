package com.example.kouobs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;

import com.google.android.material.navigation.NavigationBarView;

public class basvurularim extends AppCompatActivity {
    //Spinner spinner_okul,spinner_belge,spinner_sinif,spinner_fak;


    Spinner spinnerbolumf;
    String []  bolumf ={"Fizik B.","Matematik B.","Kimya B.","Felsefe B.","Tarih B."};
    String []  bolume ={"Fen Bilgisi ÖĞretmenliği","Sınıf Öğretmenliği","İngilizce Öğretmenliği","Türkçe Öğretmenliği","Rehberlik ve Psikolojik Danışmanlık"};
    String []  bolumM ={"Bilgisayar Mühendisliği","Elektronik-Haberleşme M.","Endüstiri M.","İnşaat M.","Makina M.","Mekanik M."};
    String []  bolumI ={"İşletme","İktisat","Çalışma Ekonomisi ve Endüstiri İlişkileri","Uluslarası İlişkiler","Siyaset Bilimi ve Kamu Yönetimi"};
    String []  bolumG ={"Fotoğraf","Grafik Tasarım","Resim","Seramik","Oyunculuk","Sahne Sanatları","Müzikoloji"};
    ArrayAdapter adp3;
    ArrayAdapter adp4;
    ArrayAdapter adp5;
    ArrayAdapter adp6;
    ArrayAdapter adp7;
    Button dvm;
    Spinner spinnerbelge;
    String []  belgeler ={"Seçiniz","Yaz okulu","Yatay Geçiş","DGS","ÇAP","Ders intibakı"};
    ArrayAdapter adp;
    int deger=0;


    Spinner spinnerfak;
    String []  fak ={"Seçiniz","Fen-Edebiyat Fakültesi","Egitim Fakültesi","Mühendislik FAkültesi","İktisadi ve İdari Bİlimler Fakültesi","Güzel Sanatlar Fakültesi"};
    ArrayAdapter adp2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basvurularim);
        spinnerbelge=findViewById(R.id.belge);
        adp=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,belgeler);
        spinnerbelge.setAdapter(adp);

        dvm=findViewById(R.id.devam);



        spinnerfak=findViewById(R.id.fak);
        adp2=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,fak);
        spinnerfak.setAdapter(adp2);

        spinnerbolumf=findViewById(R.id.bolum);
        adp3=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,bolumf);
        adp4=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,bolume);
        adp5=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,bolumM);
        adp6=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,bolumI);
        adp7=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,bolumG);

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
                    startActivity(new Intent(basvurularim.this,yzok.class));
                else if(deger==2)
                    startActivity(new Intent(basvurularim.this,yataygecis.class));
                else if(deger==3)
                    startActivity(new Intent(basvurularim.this,cap.class));
                else if(deger==4)
                    startActivity(new Intent(basvurularim.this,intibak.class));



            }
        });


        spinnerfak.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String secim = spinnerfak.getItemAtPosition(i).toString();


                if (secim == "Fen-Edebiyat Fakültesi") {
                    spinnerbolumf.setAdapter(adp3);

                }else if (secim == "Egitim Fakültesi") {
                    spinnerbolumf.setAdapter(adp4);

                }else if (secim == "Mühendislik FAkültesi") {
                    spinnerbolumf.setAdapter(adp5);

                }else if (secim == "İktisadi ve İdari Bİlimler Fakültesi") {
                    spinnerbolumf.setAdapter(adp6);

                }else if (secim == "Güzel Sanatlar Fakültesi") {
                    spinnerbolumf.setAdapter(adp7);

                }


            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });






    }

}