package com.facisa.oliver.protocolofacisa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
    }
    public void Voltar( View view){
        Intent intent2 = new Intent(getApplicationContext(),MainActivityTelaInicial.class);
        startActivity(intent2);
    }
    public void Academico( View view){
        Intent intent3 = new Intent(getApplicationContext(),Tela3.class);
        startActivity(intent3);
    }
    public void Cordenacao( View view){
        Intent intent4 = new Intent(getApplicationContext(),Tela4.class);
        startActivity(intent4);
    }
    public void Financeiro( View view){
        Intent intent5 = new Intent(getApplicationContext(),Tela5.class);
        startActivity(intent5);
    }
}
