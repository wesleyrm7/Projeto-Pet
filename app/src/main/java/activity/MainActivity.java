package activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.baseapp2.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

import java.lang.ref.Reference;

public class MainActivity extends IntroActivity {


    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            abrir();

            }
        },4000 );

      }


    public void cadastro(){
        Intent intent=new Intent(MainActivity.this,LoginActivity.class);
        startActivity(intent);
        finish();

    }
    public void abrir(){
        Intent intent = new Intent(getApplicationContext(),Apresentacao.class);
        startActivity(intent);
        finish();
    }

}