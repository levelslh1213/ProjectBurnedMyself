package com.example.projectburnedmyself;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class questoes2 extends AppCompatActivity {

   Bundle params;
   String local;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questoes2);

        Intent intent = getIntent();
        this.params = intent.getExtras();
    }

    public void nextPage(){
        Intent intent = new Intent(questoes2.this, questoes3.class);
        this.params.putString("local", this.local);
        intent.putExtras(params);
        startActivity(intent);
    }

    public void btnCabecaOnClick(View view) {
        this.local = "Cabeça";
        nextPage();
    }

    public void btnTroncoFrenteOnClick(View view) {
        this.local = "Tronco Frente";
        nextPage();
    }

    public void btnTroncoCostasOnClick(View view) {
        this.local = "Tronco Costas";
        nextPage();
    }

    public void btnMembrosSuperioresOnClick(View view) {
        this.local = "Membros Superiores";
        nextPage();
    }

    public void btnMembrosInferioresOnClick(View view) {
        this.local = "Membros Inferiores";
        nextPage();
    }

    public void btnGenitaisOnClick(View view) {
        this.local = "Genitais";
        nextPage();
    }
}