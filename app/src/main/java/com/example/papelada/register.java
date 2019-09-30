package com.example.papelada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register extends AppCompatActivity {

    private Button Proximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Proximo = findViewById(R.id.btnProximo);
        Proximo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                proximo1();
            }
        });
    }

    public void proximo1 () {
        Intent telaProximo = new Intent(register.this,register_foto.class);
        startActivity(telaProximo);
        finish();
    }
}
