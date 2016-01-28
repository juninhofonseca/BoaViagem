package br.com.casadocodigo.boaviagem;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private EditText usuario;
    private EditText senha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_login);

        usuario = (EditText) findViewById(R.id.usuario);
        senha   = (EditText) findViewById(R.id.senha);


    }


    public void entrarOnClick(View v) {
        String usuarioInformado = usuario.getText().toString();
        String senhaInformada = senha.getText().toString();
        if("leitor".equals(usuarioInformado) &&
                "123".equals(senhaInformada)) {
            startActivity(new Intent(this, DashboardActivity.class));
        } else{

            String mensagem = getResources().getString(R.string.erro_autenticacao);
            Toast toast = Toast.makeText(this, mensagem, Toast.LENGTH_SHORT);
            toast.show();


        }

    }
}



