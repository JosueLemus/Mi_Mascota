package com.example.lemus.mimascota;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PERROS extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ListView lvDatos;
    private Activity activity;
    private CustomAdapter adaptador;
    private ArrayList<menu> datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perros);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_perros);

        lvDatos =(ListView) findViewById(R.id.lvLista);
        activity=this;
        datos=new ArrayList<menu>();

        llenarLista();

        adaptador=new CustomAdapter(activity,datos);

        lvDatos.setAdapter(adaptador);
        lvDatos.setOnItemClickListener(this);
    }

    public void llenarLista(){
        Resources resources=getResources();
        String[] arrayNombres={"Primeros Auxilios","Cuidados y Educacion","Veterinarios","Adopcion"};
        String[] arrayDescripcion={"Todo lo que debes saber ",
                "Cada mascota tiene su propio cuidado y educacion...."
                ,"Te recomendamos los lugares mas cercanos de Veterinarios en tu ciudad"
                ,"Te recomendamos los lugares mas cercanos de adopcion en tu ciudad"};
        int [] img={R.drawable.primaux,R.drawable.cudiyedu,R.drawable.veteri,R.drawable.adop};
        for (int i=0;i<4;i++){

            datos.add(new menu(arrayNombres[i],
                    arrayDescripcion[i], img[i]));
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position==0){
            showChangeLangDialog();
             /*Intent i=new Intent(getBaseContext(),PrimAux.class);
            startActivity(i);*/
        }
        else
            if(position==1) {
               Intent i=new Intent(getBaseContext(),CuidadosPerro.class);
               startActivity(i);
            }
            else
            if(position==2) {
                Intent i=new Intent(getBaseContext(),veterinarios.class);
                startActivity(i);
            }
            else
            if(position==3) {
                Intent i=new Intent(getBaseContext(),Adopcion.class);
                startActivity(i);
            }
        }
    public void showChangeLangDialog() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.activity_prim_aux, null);
        dialogBuilder.setView(dialogView);
        //final EditText edt = (EditText) dialogView.findViewById(R.id.nomveter);
        //edt.setText("Que onda");
        //dialogBuilder.setTitle("Datos del Veterinario: ");
        dialogBuilder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                Intent i=new Intent(getApplicationContext(),PrimerosAuxiliosP.class);
                startActivity(i);

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

