package com.example.lemus.mimascota;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class Inicio extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences prefs;
    EditText e1,e2;
    Button bg,bl,bm;
    Switch s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        prefs=  getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);

        e1 = (EditText) findViewById(R.id.edit1);
        e2 = (EditText) findViewById(R.id.edit2);
        bg = (Button) findViewById(R.id.guardar);
        bl = (Button) findViewById(R.id.leer);
        bm=(Button) findViewById(R.id.mandar);
        bg.setOnClickListener(this);
        bl.setOnClickListener(this);
        bm.setOnClickListener(this);
        s=(Switch) findViewById(R.id.swi);
            String x=prefs.getString("v1","");

        boolean swpro=prefs.getBoolean("sw",false);
            if(!x.toString().equals(null)&swpro){
                SharedPreferences.Editor sp=prefs.edit();
                sp.putString("v3","Hola mundo que onda");
                sp.commit();
                mandar();
            }




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.guardar:
                guardarPreferences();
                break;
            case R.id.leer:
                leerPreferences();
                break;
            case R.id.mandar:
                mandar();
        }
    }

    private void mandar() {
        Intent i=new Intent(this,MiMascota.class);
        i.putExtra("per",prefs.getString("v1","Nel Prro"));
        i.putExtra("mas",prefs.getString("v2","Nel Prro"));
        SharedPreferences.Editor sp=prefs.edit();

        sp.putBoolean("sw",s.isChecked());
        sp.commit();


        startActivity(i);

    }

    public void guardarPreferences() {
        String valor1=e1.getText().toString();
        String valor2=e2.getText().toString();

        SharedPreferences.Editor sp=prefs.edit();

        sp.putString("v1",valor1);
        sp.putString("v2",valor2);
        sp.commit();
        Toast.makeText(getApplicationContext(),"Datos Guardados!",Toast.LENGTH_LONG).show();
        e1.setText("");
        e2.setText("");
    }

    public void leerPreferences() {
        String valor1=prefs.getString("v1","Nel Prro");
        String valor2=prefs.getString("v2","Nel Prro");
        e1.setText(valor1);
        e2.setText(valor2);
    }
}
