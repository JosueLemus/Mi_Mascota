package com.example.lemus.mimascota;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class veterinarios extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ListView lvDatos;
    private Activity activity;
    private CustomAdapterVeterinarios adaptador;
    private ArrayList<menuV> datos;
    //TextView veter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veterinarios);


        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_veterinario);

        //getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        //getSupportActionBar().setCustomView(R.layout.action_bar_perros);

        lvDatos =(ListView) findViewById(R.id.lvVeteri);

      //  veter=(TextView) findViewById(R.id.nomveter);
        //veter.setText("Puto el q lo lea");


        activity=this;
        datos=new ArrayList<menuV>();

        llenarLista();

        adaptador=new CustomAdapterVeterinarios(activity,datos);

        lvDatos.setAdapter(adaptador);
        lvDatos.setOnItemClickListener(this);
    }

    public void llenarLista(){
        Resources resources=getResources();
        String[] arrayNombres={"Canis & Felis","Clinica de Carol Aguilar Romero","CENVET","Zoos Agrodiario"};
        String[] arrayDescripcion={"Samuel Málaga Arteaga",
                "Carol Aguilar Romero"
                ,"Augusto Daniel Vera Berrino"
                ,"Félix Chambi Cari"};
        String[] arrayDireccion={"Av. Bush, Miraflores",
                "Av. Civica, El Alto"
                ,"Villegas & calle 8, Calacoto"
                ,"Calle Bolivia #432"};
        int img2=R.drawable.veterico;
        for (int i=0;i<4;i++){

            datos.add(new menuV(arrayNombres[i],
                    arrayDescripcion[i], img2,arrayDireccion[i]));
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position==0){
            //EditText edt = (EditText)findViewById(R.id.nomveter);
            //edt.setText("Que onda");
         // showChangeLangDialog();
        }
        else
        if(position==1) {
           // showChangeLangDialog();
        }
    }
    public void showChangeLangDialog() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.activity_detalle_veterinario, null);
        dialogBuilder.setView(dialogView);
        //final EditText edt = (EditText) dialogView.findViewById(R.id.nomveter);
        //edt.setText("Que onda");
        dialogBuilder.setTitle("Datos del Veterinario: ");
        dialogBuilder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //do something with edt.getText().toString();
                /// guardarDatos(edt.getText().toString(),edt.getText().toString());
                /*Intent i=new Intent(
                        getApplicationContext(),
                        MiMascota.class
                );
                startActivity(i);
                finish();*/
            }
        });
        dialogBuilder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //pass
                //leerDatos();
               /* Intent i=new Intent(
                        getApplicationContext(),
                        MiMascota.class
                );
                startActivity(i);
                finish();*/
            }
        });
        AlertDialog b = dialogBuilder.create();
        b.show();
    }
}

