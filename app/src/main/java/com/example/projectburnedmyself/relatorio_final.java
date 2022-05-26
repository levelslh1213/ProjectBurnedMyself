package com.example.projectburnedmyself;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class relatorio_final extends AppCompatActivity {

    Bundle params;

    String aparencia;
    String local;
    String agente;

    TextView txtGrau;
    TextView txtTratamento;
    TextView txtAcao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio_final);

        Intent intent = getIntent();
        this.params = intent.getExtras();
        this.aparencia = params.getString("aparencia");
        this.local = params.getString("local");
        this.agente = params.getString("agente");

        this.txtGrau = findViewById(R.id.txtGrau);
        this.txtAcao = findViewById(R.id.txtAcao);
        this.txtTratamento = findViewById(R.id.txtTratamento);

        validaRegistros();
    }

    public void nextPage(){
        Intent intent = new Intent(relatorio_final.this, MainActivity.class);
        startActivity(intent);
    }

    public void btnInicioOnClick(View view) {
        nextPage();
    }

    public void validaRegistros(){
        switch (this.aparencia){
            case "Avermelhada":
                this.txtGrau.setText("1º grau: atinge a epiderme (camada superficial da pele). Apresentação com vermelhidão sem bolhas e discreto inchaço local. A dor está presente;");
                break;
            case "Bolhas":
                this.txtGrau.setText("2º grau: atinge a epiderme e parte da derme (2ª camada da pele). Há presença de bolhas e a dor é acentuada;");
                break;
            case "Preta":
                this.txtGrau.setText("3º grau: atinge todas as camadas da pele, músculos e ossos. Ocorre necrose da pele (morte do tecido), que se apresenta com cor esbranquiçada ou escura. Dor é ausente. Urgência!!!");
                break;
        }

        switch(this.local){
            case "Cabeça":
                this.txtAcao.setText("Independente do Grau, tamanho ou Agente, procure atendimento médico urgente!");
                break;
            case "Tronco Frente":
                this.txtAcao.setText("Se a queimadura for maior que a plama da sua mão, busque atendimento médico!");
                break;
            case "Tronco Costas":
                this.txtAcao.setText("Se a queimadura for maior que a plama da sua mão, busque atendimento médico!");
                break;
            case "Membros Superiores":
                this.txtAcao.setText("Caso a queimadura atingir mais um membro, ou ser maior que sua palma da mão, busque atendimento!");
                break;
            case "Membros Inferiores":
                this.txtAcao.setText("Se a queimadura for maior que a plama da sua mão, busque atendimento médico!");
                break;
            case "Genitais":
                this.txtAcao.setText("Independente do Grau ou Agente, procure atendimento médico urgente!");
                break;
        }

        switch(this.agente){
            case "Físicos":
                this.txtTratamento.setText("Esfrie a área queimada com água fria! Cubra a área com um pano limpo! Retire acessórios!");
                break;
            case "Químicos":
                this.txtTratamento.setText("Enxágue o local por, pelo menos, 20 minutos em água corrente! Remova resíduo de roupa contaminada pelo produto! Busque Atendimento!");
                break;
            case "Biológicos":
                this.txtTratamento.setText("Em caso de estado de choque, mantenha a vítima acordada. Busque atendimento especializado urgente!");
                break;
        }
    }
}