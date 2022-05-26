package com.example.projectburnedmyself;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class confirmacao extends AppCompatActivity {

    Bundle params;

    TextView txtAparencia;
    TextView txtLocal;
    TextView txtAgente;

    String aparencia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao);

        Intent intent = getIntent();
        this.params = intent.getExtras();

        this.txtAparencia = findViewById(R.id.txtAparencia);
        this.aparencia = this.params.getString("aparencia");
        if(this.aparencia.equals("Preta")){
            this.txtAparencia.setText("Esbranquiçada ou Preta");
        }
        else{
            this.txtAparencia.setText(this.params.getString("aparencia"));
        }
        this.txtLocal = findViewById(R.id.txtLocal);
        this.txtLocal.setText(params.getString("local"));
        this.txtAgente = findViewById(R.id.txtAgente);
        this.txtAgente.setText(params.getString("agente"));
    }

    public void nextPage(){
        Intent intent = new Intent(confirmacao.this, relatorio_final.class);
        intent.putExtras(this.params);
        startActivity(intent);
    }

    public void btnConfirmaOnClick(View view) {
        nextPage();
    }
}