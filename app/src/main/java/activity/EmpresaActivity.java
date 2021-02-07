package activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.baseapp2.R;

import model.DadosEmpresa;

public class EmpresaActivity extends AppCompatActivity {

    private Button acessar;
    private TextView id, senha;
    private DadosEmpresa empresa;
    boolean correto=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa);


        id = findViewById(R.id.idUsuario);
        senha = findViewById(R.id.senhaId);
        acessar = findViewById(R.id.buttonAcesar);

        acessar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                //Recuperar os Valores



                //Verificacao
                if(!confereDadosEmpresa(correto)){
                    startActivity(new Intent(getApplicationContext(),Apresentacao.class));

                }else {
                    startActivity(new Intent(getApplicationContext(),HomeEmpresaActivity.class));

                }

            }
        });

    }
    public boolean confereDadosEmpresa(boolean a){
        String textoId = id.getText().toString();
        String textoSenha = senha.getText().toString();

        empresa=new DadosEmpresa();
        empresa.ConfereDados(textoId,textoSenha);

        if(textoSenha.equals(empresa.getSenha()) && textoId.equals(empresa.getId())){
            a=true;
        }else{
            a=false;
            Toast.makeText(EmpresaActivity.this,
                    "Erro Dados Nao conferem",
                    Toast.LENGTH_SHORT).show();
        }
        return a;
    }

}
/*
*
* DadosEmpresa*/