package activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.baseapp2.R;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;

public class Apresentacao extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_apresentacao);


        }
    public void btEntrar(View view){ //Ao clicar vai ser redirecionado para as devidas Activitys
        startActivity(new Intent(this,LoginActivity.class));
    }
    public void btCadastrar(View view){
        startActivity(new Intent(this,CadastroActivity.class));

    }
    public void brEntrarEmpresa(View view){
        startActivity(new Intent(this,EmpresaActivity.class));
    }

}
