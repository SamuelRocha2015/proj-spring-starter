package br.com.codenation.models;

import org.springframework.stereotype.Component;

@Component
public class Carro {

    private String modelo;
    private int ano;

    public Carro() {
        System.out.println("Construtor de Carro executado");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
