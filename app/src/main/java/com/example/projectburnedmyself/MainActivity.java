package com.example.projectburnedmyself;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtMeQueimei;
    ImageButton btnMeQueimei;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMeQueimei = (TextView) findViewById(R.id.txtMeQueimei);
        btnMeQueimei = (ImageButton) findViewById(R.id.btnMeQueimei);
    }

    public void onTapButton(View view) {
        String a = (String) txtMeQueimei.getText();
        Intent intent = new Intent(MainActivity.this, questoes1.class);

        Bundle params = new Bundle();
        params.putString("teste", a);

        intent.putExtras(params);
        startActivity(intent);
    }

    public void btnInfoOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, sobre.class);
        startActivity(intent);
    }
}