package com.example.supercenter_alimentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.supercenter_alimentos.ui.login.LoginActivity;

public class NewUser extends AppCompatActivity {

    public EditText senha;
    public EditText confirmsenha;
    public Button voltar;
    public Button salvar;

    public void init(){
        voltar = (Button)findViewById(R.id.voltar);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(NewUser.this, LoginActivity.class);

                startActivity(toy);
            }
        });
    }
    public void ini(){
        salvar = (Button)findViewById(R.id.salvar);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(NewUser.this, LoginActivity.class);

                if (senha == confirmsenha){
                    Toast.makeText(getApplicationContext(), "Usuário criado", Toast.LENGTH_SHORT).show();
                    startActivity(toy);
                }
                else{
                    Toast.makeText(getApplicationContext(), "testando validação", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

        init();
        ini();
    }
}
