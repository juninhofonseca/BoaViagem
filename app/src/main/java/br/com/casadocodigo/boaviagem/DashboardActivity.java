package br.com.casadocodigo.boaviagem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by me864bza on 1/16/16.
 */
public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }


    public void selecionarOpcao(View view) {

        switch (view.getId() ){
            case (R.id.nova_viagem):
                startActivity(new Intent(this, ViagemActivity.class));
                break;
            case(R.id.novo_gasto):
                startActivity(new Intent(this, GastoActivity.class));
                break;
            case(R.id.minhas_viagens):
                startActivity(new Intent(this, ViagemListActivity.class));
                break;
            default:
                TextView textView = (TextView) view;
                String opcao = "Opção " + textView.getText().toString();
                Toast.makeText(DashboardActivity.this, opcao, Toast.LENGTH_SHORT).show();
                break;
        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.dashboard_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        finish();
        return true;
    }
}
