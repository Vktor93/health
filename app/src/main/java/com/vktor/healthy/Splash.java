package com.vktor.healthy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    //@BindView(R.id.txtLogo)
    private TextView logo;

    //@BindView(R.id.imgLogo)
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //ButterKnife.bind(this);

        logo = findViewById(R.id.txtLogo);
        image = findViewById(R.id.imgLogo);

        Animation animDown = AnimationUtils.loadAnimation( this, R.anim.uptodown);
        Animation animUp = AnimationUtils.loadAnimation( this,R.anim.downtoup);

        image.startAnimation(animDown);
        logo.startAnimation(animUp);
    }
}
