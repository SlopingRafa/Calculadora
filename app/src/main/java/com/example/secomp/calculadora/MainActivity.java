package com.example.secomp.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edText1;
    EditText edText2;
    Button btSoma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edText1 = (EditText) findViewById(R.id.edText1);
        edText2 = (EditText) findViewById(R.id.edtext2);
        btSoma = (Button) findViewById(R.id.btSoma);

        btSoma.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String str1 = edText1.getText().toString();
                        String str2 = edText2.getText().toString();
                        Double soma = Double.parseDouble(str1) + Double.parseDouble(str2);

                        //Toast.makeText(getBaseContext(),  "Resultado: " + soma.toString(), Toast.LENGTH_LONG).show();
                        Intent it = new Intent(getBaseContext(), ResultadoActivity.class);
                        if(soma > 50) {
                            it.putExtra(getString(R.string.resultado), soma);
                            startActivity(it);
                        }
                    }
                }
        );
    }

    @Override
    public void onClick(View view) {

    }
}
