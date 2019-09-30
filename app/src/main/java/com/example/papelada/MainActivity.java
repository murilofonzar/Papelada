package com.example.papelada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private TextView btnRegistro;
    private TextInputEditText txtUsuario;
    private TextInputEditText txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUsuario = findViewById(R.id.edEmail);
        txtSenha = findViewById(R.id.edSenha);
        btnRegistro = findViewById(R.id.edRegistro);
        btnRegistro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                registro();
            }
        });

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    public void login () {
        Intent telaPrincipal = new Intent(MainActivity.this,PapeladaMenu.class);
        startActivity(telaPrincipal);
        finish();
    }

    public void registro () {
        Intent telaRegistro = new Intent(MainActivity.this,register.class);
        startActivity(telaRegistro);
        finish();
    }
}
