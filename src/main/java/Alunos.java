package main.java;

import java.util.Observer;
import java.util.Observable;

public class Alunos implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Alunos (String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void cadastrar(Academia academia) {
        academia.addObserver(this);
    }

    public void update(Observable academia, Object arg1) {
        this.ultimaNotificacao = this.nome + ", aluno adicionado " + academia.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}