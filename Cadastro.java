package ProjetosProprios.JonBank;

import java.util.ArrayList;

public class Cadastro {

    private String nome;
    private int senha;

    public Cadastro(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
    }
    public Cadastro() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
