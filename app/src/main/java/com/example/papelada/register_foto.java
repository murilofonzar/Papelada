package com.example.papelada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register_foto extends AppCompatActivity {

    private Button Proximo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_foto);
        Proximo2 = findViewById(R.id.btnProximo2);
        Proximo2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                proximo2();
            }
        });
    }

    public void proximo2 () {
        Intent telaProximo2 = new Intent(register_foto.this,register_foto_documento.class);
        startActivity(telaProximo2);
        finish();
    }
}
