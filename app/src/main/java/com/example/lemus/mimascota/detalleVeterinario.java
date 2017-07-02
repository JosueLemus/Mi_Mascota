package com.example.lemus.mimascota;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class detalleVeterinario extends AppCompatActivity implements View.OnClickListener {
    ImageButton bl,bc;
    SharedPreferences prefs;
    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_veterinario);

        prefs=  getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);
        bc=(ImageButton) findViewById(R.id.Compartir);
        bl=(ImageButton) findViewById(R.id.llamada);
        //edt = (EditText)findViewById(R.id.nomveter);
        //edt.setText(prefs.getString("v1","Nel Prro"));
        bc.setOnClickListener(this);
        bl.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Compartir:
                Toast.makeText(getApplicationContext(),"Compartir",Toast.LENGTH_LONG).show();
                break;
            case R.id.llamada:
                Toast.makeText(getApplicationContext(),"LLamar",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
