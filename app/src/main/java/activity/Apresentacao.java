package activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.baseapp2.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;

import config.ConfiguracaoFireBase;

public class Apresentacao extends AppCompatActivity {


    private FirebaseAuth autenticacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apresentacao);

     }

    @Override
    protected void onStart() {
        super.onStart();
        verificarUsuarioLogado();
    }

    public void btEntrar(View view){ //Ao clicar vai ser redirecionado para as devidas Activitys
        startActivity(new Intent(this,LoginActivity.class));
    }
    public void btCadastrar(View view){
        startActivity(new Intent(this,CadastroActivity.class));

    }
    public void verificarUsuarioLogado(){
       autenticacao= ConfiguracaoFireBase.getFirebaseAutenticacao();
       autenticacao.signOut();//Deslogando Usuario

       if(autenticacao.getCurrentUser() != null){
            abrirTelaPrincipal();
        }
    }
    public void abrirTelaPrincipal(){
        startActivity(new Intent(this,HomeUsuarioActivity2.class));


    }
    public void btEntrarEmpresa(View view){
        startActivity(new Intent(this,EmpresaActivity.class));

    }


}
