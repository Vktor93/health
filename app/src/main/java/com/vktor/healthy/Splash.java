package com.vktor.healthy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Splash extends AppCompatActivity {
    @BindView(R.id.txtLogo)
     TextView logo;

    @BindView(R.id.imgLogo)
     ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

        Animation animDown = AnimationUtils.loadAnimation( this, R.anim.uptodown);
        Animation animUp = AnimationUtils.loadAnimation( this,R.anim.downtoup);

        img.startAnimation(animDown);
        logo.startAnimation(animUp);
    }
}
