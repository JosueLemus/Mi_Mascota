package com.example.lemus.mimascota;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetalleCuidados extends AppCompatActivity {
    ImageView ivimagen;
    TextView ivTitulo;
    TextView ivDescripcion;
    int dato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_cuidados);

        Intent i = getIntent();
        Bundle extra = i.getExtras();
        dato = extra.getInt("Cuidado")+0;

        ivimagen=(ImageView) findViewById(R.id.imgcuidados);
        ivTitulo=(TextView) findViewById(R.id.titulocuidados);
        ivDescripcion=(TextView) findViewById(R.id.desccuidados);
        if (dato>=23){
            getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            getSupportActionBar().setCustomView(R.layout.action_bar_primaux);
        }
        else {
            getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            getSupportActionBar().setCustomView(R.layout.action_bar_cuidados);
        }
        switch(dato){
            case 1:{
                ivTitulo.setText("El collar");
                ivimagen.setImageResource(R.drawable.collar);
                ivDescripcion.setText(R.string.collar);
                break;
            }case 2:{
                ivTitulo.setText("Eliminacion inadecuada");
                ivimagen.setImageResource(R.drawable.eliminadec);
                ivDescripcion.setText(R.string.eliminadecuada);
                break;
            }
            case 3:{
                ivTitulo.setText("La cama");
                ivimagen.setImageResource(R.drawable.lacama);
                ivDescripcion.setText(R.string.cama);
                break;
            }
            case 4:{
                ivTitulo.setText("La correa");
                ivimagen.setImageResource(R.drawable.correa);
                ivDescripcion.setText(R.string.correa);
                break;
            }
            case 5:{
                ivTitulo.setText("La cucha");
                ivimagen.setImageResource(R.drawable.cucha);
                ivDescripcion.setText(R.string.cucha);
                break;
            }
            case 6:{
                ivTitulo.setText("Los accidentes");
                ivimagen.setImageResource(R.drawable.lacama);
                ivDescripcion.setText(R.string.accidentes);
                break;
            }
            case 7:{
                ivTitulo.setText("Marcaje territorial con orina");
                ivimagen.setImageResource(R.drawable.marcaje);
                ivDescripcion.setText(R.string.marcaje);
                break;
            }
            case 8:{
                ivTitulo.setText("Un perro bien cuidado");
                ivimagen.setImageResource(R.drawable.percuidado);
                ivDescripcion.setText(R.string.unperrobiencuidado);
                break;
            }
            case 9:{
                ivTitulo.setText("Vacaciones: el perro y el automovil");
                ivimagen.setImageResource(R.drawable.lacama);
                ivDescripcion.setText(R.string.vacaciones);
                break;
            }
            case 10:{
                ivTitulo.setText("Vitaminas y minerales");
                ivimagen.setImageResource(R.drawable.lacama);
                ivDescripcion.setText(R.string.vitaminas);
                break;
            }
            case 11:{
                ivTitulo.setText("¿Cada cuanto tiempo debo bañar a mi perro?");
                ivimagen.setImageResource(R.drawable.lacama);
                ivDescripcion.setText(R.string.bañar);
                break;
            }
            case 12:{
                ivTitulo.setText("Cronograma de vacunacion canina");
                ivimagen.setImageResource(R.drawable.lacama);
                ivDescripcion.setText(R.string.vacunacion);
                break;
            }
            case 13:{
                ivTitulo.setText("¿Con que frecuencia se debe desparacitar un perro?");
                ivimagen.setImageResource(R.drawable.jugueton);
                ivDescripcion.setText(R.string.desparacitar);
                break;
            }
            case 14:{
                ivTitulo.setText("¿A que edad se le pone collar?");
                ivimagen.setImageResource(R.drawable.collar);
                ivDescripcion.setText(R.string.edadcollar);
                break;
            }
            case 15:{
                ivTitulo.setText("¿Como le enseño al cachorro a hacer sus necesidades en el lugar adecuado?");
                ivimagen.setImageResource(R.drawable.marcaje);
                ivDescripcion.setText(R.string.hacernecesidades);
                break;
            }
            case 16:{
                ivTitulo.setText("¿Como le enseño a mi cachorro a venir?");
                ivimagen.setImageResource(R.drawable.jugueton);
                ivDescripcion.setText(R.string.ensenarvenir);
                break;
            }
            case 17:{
                ivTitulo.setText("¿Cuando debo sacar al cachorro a hacer sus necesidades fisiologicas?");
                ivimagen.setImageResource(R.drawable.marcaje);
                ivDescripcion.setText(R.string.cuandodebosacarelcachorro);
                break;
            }
            case 18:{
                ivTitulo.setText("¿Los perros sufren ataques de panico?");
                ivimagen.setImageResource(R.drawable.lacama);
                ivDescripcion.setText(R.string.panico);
                break;
            }
            case 19:{
                ivTitulo.setText("¿Por que a los perros les gusta tener una cucha?");
                ivimagen.setImageResource(R.drawable.cucha);
                ivDescripcion.setText(R.string.porquecucha);
                break;
            }
            case 20:{
                ivTitulo.setText("¿Por que cuando acaricio a mi perro se orina?");
                ivimagen.setImageResource(R.drawable.lacama);
                ivDescripcion.setText(R.string.acaricioorina);
                break;
            }
            case 21:{
                ivTitulo.setText("¿Por que el perro levanta la pata al orinar?");
                ivimagen.setImageResource(R.drawable.marcaje);
                ivDescripcion.setText(R.string.levantapataorinar);
                break;
            }
            case 22:{
                ivTitulo.setText("¿Por que los cachorros cuando juegan muerden todo?");
                ivimagen.setImageResource(R.drawable.jugueton);
                ivDescripcion.setText(R.string.muerdetodo);
                break;
            }
            case 23:{
                ivTitulo.setText("¿Por que los perros entierran huesos?");
                ivimagen.setImageResource(R.drawable.enterrandohuesos);
                ivDescripcion.setText(R.string.entierranhueso);
                break;
            }


            //------------------------Detalles de Primeros auxilios ;D

            case 24:{
                ivTitulo.setText("Ante un accidente");
                ivimagen.setImageResource(R.drawable.anteacc);
                ivDescripcion.setText(R.string.anteunacc);
                break;
            }
            case 25:{
                ivTitulo.setText("Ahogo");
                //ivimagen.setImageResource(R.drawable.anteacc);
                ivDescripcion.setText(R.string.ahogo);
                break;
            }
            case 26:{
                ivTitulo.setText("Asfixia");
                ivimagen.setImageResource(R.drawable.asfixia);
                ivDescripcion.setText(R.string.asfixia);
                break;
            }
            case 27:{
                ivTitulo.setText("Convulsiones");
                //ivimagen.setImageResource(R.drawable.anteacc);
                ivDescripcion.setText(R.string.convulciones);
                break;
            }
            case 28:{
                ivTitulo.setText("Shock");
                //ivimagen.setImageResource(R.drawable.anteacc);
                ivDescripcion.setText(R.string.shock);
                break;
            }
            case 29:{
                ivTitulo.setText("Golpe de calor");
                ivimagen.setImageResource(R.drawable.golpecalor);
                ivDescripcion.setText(R.string.golpecalor);
                break;
            }
            case 30:{
                ivTitulo.setText("Hemorragia");
                //ivimagen.setImageResource(R.drawable.anteacc);
                ivDescripcion.setText(R.string.hemorragias);
                break;
            }
            case 31:{
                ivTitulo.setText("Quemaduras");
                ivimagen.setImageResource(R.drawable.quemaduras);
                ivDescripcion.setText(R.string.quemaduras);
                break;
            }
            case 32:{
                ivTitulo.setText("Envenenamiento");
                //ivimagen.setImageResource(R.drawable.anteacc);
                ivDescripcion.setText(R.string.envenenamiento);
                break;
            }
            case 33:{
                ivTitulo.setText("Picaduras de insectos");
                ivimagen.setImageResource(R.drawable.picaduras);
                ivDescripcion.setText(R.string.picaduras);
                break;
            }
            case 34:{
                ivTitulo.setText("Bicheras o miasis");
                //ivimagen.setImageResource(R.drawable.anteacc);
                ivDescripcion.setText(R.string.bicheras);
                break;
            }
            case 35:{
                ivTitulo.setText("Alumbrabiento");
                ivimagen.setImageResource(R.drawable.alumbra);
                ivDescripcion.setText(R.string.alumbramiento);
                break;
            }
            case 36:{
                ivTitulo.setText("Torcion de estomago");
                ivimagen.setImageResource(R.drawable.torsion);
                ivDescripcion.setText(R.string.torcion);
                break;
            }
            case 37:{
                ivTitulo.setText("Botiquin de emergencia");
                ivimagen.setImageResource(R.drawable.boti);
                ivDescripcion.setText(R.string.botiquin);
                break;
            }

        }


    }
}
