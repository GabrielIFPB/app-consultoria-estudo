package com.example.consultoria;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity {

    private ImageView btnSobreEmpresa;
    private ImageView btnServico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        this.btnSobreEmpresa = findViewById(R.id.id_btn_empresa);
        this.btnServico = findViewById(R.id.id_btn_servico);

        this.btnSobreEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SobreEmpresaActivity.class));
            }
        });

        this.btnServico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ServicoActivity.class));
            }
        });
    }
}
