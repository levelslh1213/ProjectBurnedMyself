package com.example.projectburnedmyself;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class questoes3 extends AppCompatActivity {

    String agente;
    Bundle params;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questoes3);

        Intent intent = getIntent();
        this.params = intent.getExtras();
    }

    public void nextPage(){
        Intent intent = new Intent(questoes3.this, confirmacao.class);
        this.params.putString("agente", this.agente);
        intent.putExtras(params);
        startActivity(intent);
    }

    public void btnAgentesFisicosOnClick(View view) {
        this.agente = "Físicos";
        nextPage();
    }

    public void btnAgentesQuimicosOnClick(View view) {
        this.agente = "Químicos";
        nextPage();
    }

    public void btnAgentesBiologicosOnClick(View view) {
        this.agente = "Biológicos";
        nextPage();
    }
}