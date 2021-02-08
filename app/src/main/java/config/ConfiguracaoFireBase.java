package config;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ConfiguracaoFireBase {

    //Static pois ao instanciar essa class nao quero que o valor mude
    private static FirebaseAuth autenticacao;
    private static DatabaseReference firebase;

    //Retorna a instancia do FireBaseDataBase , Permite Salvar os Dados no Banco de Dados
    public static DatabaseReference getFireBaseDataBase(){
        if(firebase == null){
            firebase= FirebaseDatabase.getInstance().getReference();
        }
        return firebase;
    }

    //Retorna a instancia do FirebaseAuth
    public static FirebaseAuth getFirebaseAutenticacao(){
        if(autenticacao==null) {
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;

        }
}
