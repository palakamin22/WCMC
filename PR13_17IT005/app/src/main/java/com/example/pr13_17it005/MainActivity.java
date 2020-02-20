package com.example.pr13_17it005;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.PictureInPictureParams;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.Rational;
import android.view.Display;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView myWebView =(WebView)findViewById(R.id.webview);
        myWebView.loadUrl("https://wrytin.com/palakamin/terrorism-jvpcgf2n");
        actionBar = getSupportActionBar();
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
                    Display display = getWindowManager().getDefaultDisplay();
                    Point size = new Point();
                    display.getSize(size);
                    int width = size.x;
                    int height = size.y;
                    Rational aspectRatio = new Rational(width,height);
                    PictureInPictureParams.Builder mPictureInPictureParamsBuilder =new PictureInPictureParams.Builder();
                    mPictureInPictureParamsBuilder.setAspectRatio(aspectRatio).build();
                    enterPictureInPictureMode(mPictureInPictureParamsBuilder.build());
                }
            }
        });
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
        if (isInPictureInPictureMode)
            actionBar.hide();
        else actionBar.show();
    }

}
