package com.example.pr13_17it005;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.PictureInPictureParams;
import android.content.res.Configuration;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Rational;
import android.view.Display;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    ActionBar actionBar;
    VideoView videoView;
    MediaController mediaC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar = getSupportActionBar();

        Button button = (Button)findViewById(R.id.button);
        videoView = (VideoView)findViewById(R.id.videoView);
        mediaC = new MediaController(this);
        String videopath = "android.resource://com.example.PR13_17IT005/"+R.raw.cloud;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaC);
        mediaC.setAnchorView(videoView);
        videoView.start();
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    Display display = getWindowManager().getDefaultDisplay();
                    Point size = new Point();
                    display.getSize(size);
                    int width = size.x;
                    int height = size.y;
                    Rational aspectRatio = new Rational(width,height);
                    PictureInPictureParams.Builder mPictureInPictureParamsBuilder = new PictureInPictureParams.Builder();
                    mPictureInPictureParamsBuilder.setAspectRatio(aspectRatio).build();
                    enterPictureInPictureMode(mPictureInPictureParamsBuilder.build());
                }


            }
        });
    }
    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        if(isInPictureInPictureMode){
            actionBar.hide();
        }else{
            actionBar.show();
        }
    }
}
