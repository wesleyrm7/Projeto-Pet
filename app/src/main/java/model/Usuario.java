package model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;

import config.ConfiguracaoFireBase;

public class Usuario {

    private String nome,email,senha,numero,idUsuario;

    public Usuario() {
    }

    public void salvar(){
        DatabaseReference firebase= ConfiguracaoFireBase.getFireBaseDatabase();
        firebase.child("usuarios")
                .child( this.idUsuario )
                  .setValue( this );

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNumero() {
        return numero;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
