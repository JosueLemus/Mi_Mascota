package com.example.lemus.mimascota;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView ivLogo;
    SharedPreferences prefs;
    private Animation animacion;
    private TextView manda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        ivLogo = (ImageView) findViewById(R.id.ivLogotipo);

        prefs=  getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);
        manda=(TextView)findViewById(R.id.modifica);
        manda.setText(prefs.getString("v1","")+" y "+prefs.getString("v2",""));
        /*if(getIntent().getBooleanExtra("vsw",)){
            Toast.makeText(getApplicationContext(),"Activado",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(getApplicationContext(),"No Activado",Toast.LENGTH_LONG).show();
        }*/
        animacion= AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.splashscreen);
        ivLogo.startAnimation(animacion);
        animacion.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if (prefs.getString("v3","").toString().equals("")){

                    Intent i=new Intent(
                            getApplicationContext(),
                            Inicio.class
                    );
                    startActivity(i);
                    finish();
                }
                else{
                    Intent i=new Intent(
                            getApplicationContext(),
                            MiMascota.class
                    );
                    startActivity(i);
                    finish();
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}