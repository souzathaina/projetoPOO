
package model;
import java.util.Date;

public class Usuario {
    private int pkid;
    private String nome;
    private String email;
    private String senha;
    private Date datanasc;
    private boolean ativo;

    //construtor
    public Usuario(){};
    /*oi*/
    /* to tentando salvar*/
    public Usuario(int pkid, String nome, String email, String senha, Date datanasc, boolean ativo) {
        this.pkid = pkid; //trocar para pkUsuario
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.datanasc = datanasc; //trocar para dataNasc
        this.ativo = ativo;
    }

    public int getPkid() {
        return pkid;
    }

    public void setPkid(int pkid) {
        this.pkid = pkid;
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

    public Date getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
}
