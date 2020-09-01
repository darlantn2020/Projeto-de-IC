package com.example.myapplication;//Como foi assinado seu projeto


//Blibliotecas
//----------------------------------------------------------------
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
//----------------------------------------------------------------

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tBotao = (Button) findViewById((R.id.tBotao));
        tBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tLogin = (TextView) findViewById((R.id.tLogin));
                TextView tSenha = (TextView) findViewById((R.id.tSenha));
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();
                if (login.equals("d")&&senha.equals("1")) {
                } else {
                    alert("E-mail ou senha incorreta");
                }
            }
        });

    }

    private void alert(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
}