package com.vktor.healthy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    private TextView tv;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        tv = findViewById(R.id.txtLogo);
        iv = findViewById(R.id.imgLogo);

        Animation animDown = AnimationUtils.loadAnimation( this, R.anim.uptodown);
        Animation animUp = AnimationUtils.loadAnimation( this,R.anim.downtoup);

        iv.startAnimation(animDown);
        tv.startAnimation(animUp);

    }
}
