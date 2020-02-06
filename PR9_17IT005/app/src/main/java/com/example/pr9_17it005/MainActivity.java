package com.example.pr9_17it005;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

import net.openid.appauth.RedirectUriReceiverActivity;

public class MainActivity extends AppCompatActivity {
    WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("https://wrytin.com/palakamin/sleep-paralysis-jvnz1dq4");
    }
    public class HybridFlowRedirectUriReceiverActivity extends RedirectUriReceiverActivity{
        @Override
        public Intent getIntent(){
            return super.getIntent().setData(Uri.parse(super.getIntent().getDataString().replaceFirst("#","?")));
        }
    }
}
