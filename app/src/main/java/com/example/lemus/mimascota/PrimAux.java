package com.example.lemus.mimascota;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PrimAux extends AppCompatActivity {
    private ImageButton botoncito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prim_aux);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_primaux);
       // botoncito=(ImageButton) findViewById(R.id.iniactprimaux);
        botoncito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 startActiprimAux();
            }
        });

    }
    public void startActiprimAux(){
        Intent intent=new Intent(getApplicationContext(),PrimerosAuxiliosP.class);
        startActivity(intent);
    }
}
