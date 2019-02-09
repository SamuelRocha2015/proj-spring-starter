package br.com.codenation.models;

import org.springframework.stereotype.Component;

@Component
public class Marca {

    private String nome;

    public Marca() {
        System.out.println("Construtor de Marca executado");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Marca{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
