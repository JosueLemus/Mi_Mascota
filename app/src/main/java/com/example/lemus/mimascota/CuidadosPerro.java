package com.example.lemus.mimascota;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CuidadosPerro extends AppCompatActivity implements OnItemClickListener {
     ListView lv;
    String[] descLista={"El collar","Eliminacion inadecuada","La cama","La correa","La cucha",
            "Los accidentes","Marcaje territorial con orina", "Un perro bien cuidado",
            "Vacaciones: el perro y el automovil","Vitaminas y minerales",
            "¿Cada cuanto tiempo debo bañar a mi perro?","Cronograma de vacunacion canina",
            "¿Con que frecuencia se debe desparacitar un perro?","¿A q edad se le pone el collar?"
            ,"¿Como le enseño al cachorro a hacer sus necesidades en el lugar adecuado?",
            "¿Como enseño a mi cachorro a venir?","¿Cuando debo sacar al cachorro a hacer sus necesidades fisiologicas?"
            ,"¿Los perros sufren ataques de panico?","¿Por que a los perros les gusta tener una cucha?"
            ,"¿Por que cuando acaricio a mi cachorro se orina?","¿Por que el perro levanta la pata al orinar ?"
            ,"¿Por que los cachorros cuando juegan muerden todo?","¿Por que los perros entierran huesos?"

    };
    private ArrayList<String> datos;
    private Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuidados_perro);




        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_cuidados);


        lv=(ListView) findViewById(R.id.lvListaCuidados);
        activity=this;
        ArrayAdapter<String>  adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, descLista);

        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);

    }
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent i=new Intent(getBaseContext(),DetalleCuidados.class);
        if (position==0){
            i.putExtra("Cuidado",1);
        }
        else
        if(position==1) {
            i.putExtra("Cuidado",2);
        }
        else
        if(position==2) {
            i.putExtra("Cuidado",3);
        }
        else
        if(position==3) {
            i.putExtra("Cuidado",4);
        }
        else
        if(position==4) {
            i.putExtra("Cuidado",5);
        }
        else
        if(position==5) {
            i.putExtra("Cuidado",6);
        }
        else
        if(position==6) {
            i.putExtra("Cuidado",7);
        }
        else
        if(position==7) {
            i.putExtra("Cuidado",8);
        }
        else
        if(position==8) {
            i.putExtra("Cuidado",9);
        }
        else
        if(position==9) {
            i.putExtra("Cuidado",10);
        }
        else
        if(position==10) {
            i.putExtra("Cuidado",11);
        }
        else
        if(position==11) {
            i.putExtra("Cuidado",12);
        }
        else
        if(position==12) {
            i.putExtra("Cuidado",13);
        }
        else
        if(position==13) {
            i.putExtra("Cuidado",14);
        }
        else
        if(position==14) {
            i.putExtra("Cuidado",15);
        }
        else
        if(position==15) {
            i.putExtra("Cuidado",16);
        }
        else
        if(position==16) {
            i.putExtra("Cuidado",17);
        }
        else
        if(position==17) {
            i.putExtra("Cuidado",18);
        }
        else
        if(position==18) {
            i.putExtra("Cuidado",19);
        }
        else
        if(position==19) {
            i.putExtra("Cuidado",20);
        }
        else
        if(position==20) {
            i.putExtra("Cuidado",21);
        }
        else
        if(position==21) {
            i.putExtra("Cuidado",22);
        }
        else
        if(position==22) {
            i.putExtra("Cuidado",23);
        }
        startActivity(i);
    }
}

