package com.ptp.phamtanphat.animation0208;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imgalpha,imgscale,imgrotate,imgtranslate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgalpha = (ImageView) findViewById(R.id.imageviewalpha);
        imgscale = (ImageView) findViewById(R.id.imageviewscale);
        imgrotate = (ImageView) findViewById(R.id.imageviewrotate);
        imgtranslate = (ImageView) findViewById(R.id.imageviewtranslate);

        imgalpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animationalpha = AnimationUtils.loadAnimation(MainActivity.this,R.anim.custom_imageview_alpha);
                view.startAnimation(animationalpha);
            }
        });
        imgscale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Truc x : qua trai la tang , qua phai la giam(Moc trung tam la 50%)
                //Truc y : len tren la tang , xuong duoi la giam(moc trung tam la 50%)
                Animation animationscale = AnimationUtils.loadAnimation(MainActivity.this,R.anim.custom_image_scale);
                view.startAnimation(animationscale);
            }
        });
        imgrotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Truc x : qua phai la giam , qua trai la tang (Moc trung tam 50%)
                //Truc y : xuong duoi la tang , len tren la giam (Moc trung tam 50%)

                Animation animationrotate = AnimationUtils.loadAnimation(MainActivity.this,R.anim.custom_imageview_rotate);
                view.startAnimation(animationrotate);
            }
        });
        imgtranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Truc x : qua phai la giam , qua trai la tang (Moc trung tam 50%)
                //Truc y : xuong duoi la tang , len tren la giam (Moc trung tam 50%)

                Animation animationrotate = AnimationUtils.loadAnimation(MainActivity.this,R.anim.custom_imageview_translate);
                view.startAnimation(animationrotate);
            }
        });
    }
}
