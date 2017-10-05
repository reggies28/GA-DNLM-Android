package com.parma.ga_dnlm_android;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.main);

        WebView myWebView = (WebView) this.findViewById(R.id.webView);
        myWebView.loadUrl("https://google.com/");

    }

}