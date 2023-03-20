package com.example.kouobs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intibak extends AppCompatActivity {

    DownloadManager downloadManager;
    Button indir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intibak);

        indir= findViewById(R.id.indir);
        indir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManager=(DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri =Uri.parse("https://docs.google.com/document/d/1UBUAMkJYFT2VxCfgsQinHVKjqNFhTEnO/edit");
                DownloadManager.Request request= new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long ref=downloadManager.enqueue(request);
            }
        });
    }
}