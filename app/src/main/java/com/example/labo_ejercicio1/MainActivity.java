package com.example.labo_ejercicio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_click;
    TextView text_usuario;
    EditText etext, econtra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            btn_click = findViewById(R.id.btn_click);
            text_usuario  = findViewById(R.id.text_usuario);
            etext = findViewById(R.id.ete);
            econtra = findViewById(R.id.econtra);
        btn_click.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
            text_usuario.setText(etext.getText());

            }
        });

        btn_click.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                text_usuario.setText(econtra.getText());
                return false;
            }
        });

        ;
    }
}
