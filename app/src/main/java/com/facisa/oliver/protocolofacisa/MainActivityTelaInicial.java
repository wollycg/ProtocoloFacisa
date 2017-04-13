package com.facisa.oliver.protocolofacisa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityTelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tela_inicial);
    }
    public void Grid( View view){
        Intent intent2 = new Intent(getApplicationContext(),Tela1.class);
        startActivity(intent2);
    }
    public void Linear( View view){
        Intent intent3 = new Intent(getApplicationContext(),Tela2.class);
        startActivity(intent3);
    }
    public void Frame( View view){
        Intent intent4 = new Intent(getApplicationContext(),Tela3.class);
        startActivity(intent4);
    }
    public void Table( View view){
        Intent intent5 = new Intent(getApplicationContext(),MainActivityTelaInicial.class);
        startActivity(intent5);
    }
    public void Relative( View view){
        Intent intent6 = new Intent(getApplicationContext(),Tela0.class);
        startActivity(intent6);
    }
}
