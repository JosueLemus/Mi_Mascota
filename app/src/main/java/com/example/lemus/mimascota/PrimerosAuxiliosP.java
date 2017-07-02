package com.example.lemus.mimascota;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrimerosAuxiliosP extends AppCompatActivity implements View.OnClickListener{

    private Button btnAnteUnAccidente, btn2,btn4,btn5,btn6,btn7,btn3,btn8,btn9,btn10,btn11,btn12,btn13,btn14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeros_auxilios_p);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.action_bar_primaux);

        btnAnteUnAccidente = (Button) findViewById(R.id.anteunacc);
        btn2 = (Button) findViewById(R.id.ahogo);
        btn3 = (Button) findViewById(R.id.asfixia);
        btn4 = (Button) findViewById(R.id.convul);
        btn5 = (Button) findViewById(R.id.shock);
        btn6 = (Button) findViewById(R.id.golpecalor);
        btn7 = (Button) findViewById(R.id.hemo);
        btn8 = (Button) findViewById(R.id.quemadu);
        btn9 = (Button) findViewById(R.id.envenena);
        btn10 = (Button) findViewById(R.id.picaduinsect);
        btn11 = (Button) findViewById(R.id.bicheras);
        btn12 = (Button) findViewById(R.id.alumbram);
        btn13 = (Button) findViewById(R.id.torcionestomago);
        btn14 = (Button) findViewById(R.id.botiemer);

        btnAnteUnAccidente.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);

    }

   @Override
    public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(), DetalleCuidados.class);
        switch (v.getId()) {
            case R.id.anteunacc:
                i.putExtra("Cuidado",24);
                break;
            case R.id.ahogo:
                i.putExtra("Cuidado",25);
                break;
            case R.id.asfixia:
                i.putExtra("Cuidado",26);
                break;
            case R.id.convul:
                i.putExtra("Cuidado",27);
                break;
            case R.id.shock:
                i.putExtra("Cuidado",28);
                break;
            case R.id.golpecalor:
                i.putExtra("Cuidado",29);
                break;
            case R.id.hemo:
                i.putExtra("Cuidado",30);
                break;
            case R.id.quemadu:
                i.putExtra("Cuidado",31);
                break;
            case R.id.envenena:
                i.putExtra("Cuidado",32);
                break;
            case R.id.picaduinsect:
                i.putExtra("Cuidado",33);
                break;
            case R.id.bicheras:
                i.putExtra("Cuidado",34);
                break;
            case R.id.alumbram:
                i.putExtra("Cuidado",35);
                break;
            case R.id.torcionestomago:
                i.putExtra("Cuidado",36);
                break;
            case R.id.botiemer:
                i.putExtra("Cuidado",37);
                break;

        }
        startActivity(i);

    }

}
