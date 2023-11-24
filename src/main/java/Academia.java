package main.java;

import java.util.Observable;

public class Academia extends Observable {

    private Integer peso;
    private String nome;
    private String endereco;

    public Academia(Integer peso, String nome, String endereco) {
        this.peso = peso;
        this.nome = nome;
        this.endereco = endereco;
    }

    public void cadastrarAluno() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Academia{" +
                ",peso="   + peso + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}