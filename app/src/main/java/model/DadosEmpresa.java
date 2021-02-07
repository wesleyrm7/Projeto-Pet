package model;

import android.util.Log;

public class DadosEmpresa {
    private final static String id="123";
    private final static String senha="666";


    public DadosEmpresa(){

    }
    public void ConfereDados(String idd,String senhaa) {
        if (idd.equals(id) && senhaa.equals(senha)) {
            Log.i("Informacao", "Valores Ok");
        } else {
            Log.i("Informacao", "Erro Valores Nao Sao Iguais !!!");
        }
    }

    public static String getId() {
        return id;
    }

    public static String getSenha() {
        return senha;
    }



    }

