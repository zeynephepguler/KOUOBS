package com.example.kouobs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button ogrgiris,ogrkayit,admngiris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        ogrgiris=findViewById(R.id.ogrgiris);

        ogrgiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ogrencigiris.class));

            }

        });

        admngiris=findViewById(R.id.admngiris);

        admngiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,admingiris.class));

            }
        }
        );

        ogrkayit=findViewById(R.id.ogrkayit);

        ogrkayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ogrkayit.class));
            }
        });

    }


}