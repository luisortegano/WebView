package com.luisorteganoandroid.webview;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView viewer = (WebView) findViewById(R.id.webview);
        WebSettings viewerSettings = viewer.getSettings();
        viewerSettings.setJavaScriptEnabled(true);
        viewerSettings.setLoadWithOverviewMode(true);
        viewerSettings.setUseWideViewPort(true);


        viewer.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return false;
            }
        });


        String url = "file:///storage/emulated/0/Android/data/com.luisortegano.datavi/files/testEmbebed.html";
        //String url = "file://" +getExternalFilesDir(null).getAbsolutePath() + "/testEmbebed.html" ;

        Log.w("SHARER", url);
        viewer.loadUrl(url);

    }
}
