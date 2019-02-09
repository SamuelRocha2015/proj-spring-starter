package br.com.codenation.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Carro {

    private String modelo;
    private int ano;

    @Autowired
    private Marca marca;

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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }


    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", marca=" + marca +
                '}';
    }
}
