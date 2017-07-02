package com.example.lemus.mimascota;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MiMascota extends AppCompatActivity {
    private ImageButton ivPerr;
    private ImageButton ivGat;
    private Animation animP;
    private Animation animG;
    SharedPreferences prefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_mascota);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_mascota);

        prefs=  getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);

        ivPerr = (ImageButton) findViewById(R.id.ivPerro);
        ivGat = (ImageButton) findViewById(R.id.ivGato);
        animP = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.zoom_in);
        animG = AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.zoom_in);
        ivPerr.startAnimation(animP);
        ivGat.startAnimation(animG);

        ivPerr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActiPerros();
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menuabout,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.Sugerencias:
                Toast.makeText(getApplicationContext(),"Seleccionado About",Toast.LENGTH_LONG).show();
                return true;
            case R.id.About:
                Toast.makeText(getApplicationContext(),"Seleccionado About",Toast.LENGTH_LONG).show();
                return true;
            case R.id.Compartir:
                Toast.makeText(getApplicationContext(),"Seleccionado About",Toast.LENGTH_LONG).show();
                return true;
            case R.id.Contacto:
                Toast.makeText(getApplicationContext(),"Seleccionado About",Toast.LENGTH_LONG).show();
                return true;
            case R.id.Bibliografia:
                showChangeLangDialog();
                return true;
            case R.id.Cambiar:
                SharedPreferences.Editor sp=prefs.edit();
                sp.putString("v3","");
                sp.commit();
                Intent i=new Intent(this,Inicio.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(),"Ya puede cambiar los nombres",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


    public void showChangeLangDialog() {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.activity_bibliografia, null);
        dialogBuilder.setView(dialogView);
        dialogBuilder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {

            }
        });
        AlertDialog b = dialogBuilder.create();
        b.show();
    }
        public void abrirActiPerros(){
            Intent i=new Intent(
                    getApplicationContext(),
                    PERROS.class);
            startActivity(i);
        }
    }

