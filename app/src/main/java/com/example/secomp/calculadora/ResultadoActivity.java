package com.example.secomp.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView tvResultado;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvResultado = (TextView) findViewById(R.id.tvResultado);

        Intent it = getIntent();
        if(it.hasExtra(getString(R.string.resultado))) {
            Double soma = it.getDoubleExtra(getString(R.string.resultado), 0.0);
            tvResultado.setText(soma.toString());
        } else {
            tvResultado.setText("GG");
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean r = super.onOptionsItemSelected(item);

        if(item.getItemId() == android.R.id.home) {
            finish();
        }

        return r;
    }
}
