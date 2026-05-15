package com.example.hmspay;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView.getSettings();

        // Enable JS
        webSettings.setJavaScriptEnabled(true);

        // Enable storage
        webSettings.setDomStorageEnabled(true);

        // Disable caching
        webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);

        // Clear old cache
        webView.clearCache(true);
        webView.clearHistory();

        // Load website
        webView.loadUrl("http://www.itrproject.free.nf/app.html?v=2");

    }

    // Back button navigation
    @Override
    public void onBackPressed() {

        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }

    }
}