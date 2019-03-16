package com.roxyapps.roxana.cartadepresentacin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// Integrantes : 00507511, 00502211, 00013812

public class Clientes extends AppCompatActivity {

    private Button entran;
    private Button salen;
    private TextView num_entran;
    private TextView num_salen;


    private int cont_entran;
    private int cont_salen;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.entran:
                    incrementar();
                    break;
                case R.id.salen:
                    incrementar2();
                    break;

            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes);

        num_entran = (TextView) findViewById(R.id.num_entran);
        num_salen = (TextView) findViewById(R.id.num_salen);

        entran = (Button) findViewById(R.id.entran);
        entran.setOnClickListener(clickListener);

        salen = (Button) findViewById(R.id.salen);
        salen.setOnClickListener(clickListener);



        inicializar();
    }
    private void inicializar() {
        cont_entran = 0;
        cont_salen = 0;
        num_entran.setText(cont_entran + "");
        num_salen.setText(cont_salen + "");
    }


    private void incrementar() {
        cont_entran++;
        num_entran.setText(cont_entran + "");

    }

    private void incrementar2() {
        cont_salen++;
        num_salen.setText(cont_salen + "");

    }
}
