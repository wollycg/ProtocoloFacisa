package com.facisa.oliver.protocolofacisa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tela0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela0);
    }
    public void Login( View view){
        Intent intent8 = new Intent(getApplicationContext(),Tela1.class);
        startActivity(intent8);
    }
}
