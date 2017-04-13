package com.facisa.oliver.protocolofacisa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class Tela5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela5);
    }
    public void enviarFormulario(View view){
        FrameLayout f = (FrameLayout) findViewById(R.id.fr1);
        f.setVisibility(View.VISIBLE);
    }
}
