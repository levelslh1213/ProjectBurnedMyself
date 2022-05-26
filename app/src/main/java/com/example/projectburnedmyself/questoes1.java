package com.example.projectburnedmyself;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class questoes1 extends AppCompatActivity {

    //TextView lblTexto;
    String aparencia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questoes1);
        /*
        Intent intent = getIntent();
        Bundle params = intent.getExtras();
        this.nome = params.getString("teste");
        lblTexto = (TextView) findViewById(R.id.lblTexto);
        lblTexto.setText(this.nome);
         */

    }

    public void nextPage(){
        Intent intent = new Intent(questoes1.this, questoes2.class);
        Bundle params = new Bundle();
        params.putString("aparencia", this.aparencia);
        intent.putExtras(params);
        startActivity(intent);
    }

    public void btnBrancaOnClick(View view) {
        this.aparencia = "Preta";
        nextPage();

    }

    public void btnBolhasOnClick(View view) {
        this.aparencia = "Bolhas";
        nextPage();
    }

    public void btnAvermelhadoOnClick(View view) {
        this.aparencia = "Avermelhada";
        nextPage();
    }
}