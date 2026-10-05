package com.mycompany.atividade_locadora.entidades;

public abstract class Veiculo implements Alugavel {
    private String placa;
    private String modelo;
    private int ano;
    private boolean disponivel = true;
    
    public Veiculo(String placa, String modelo, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public boolean isDisponivel() {
        return this.disponivel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa.length() > 7) {
            this.placa = placa;
        }
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
        if (ano >= 1886) {
            this.ano = ano;
        }
    }

    @Override
    public boolean alugar() {
        if (disponivel) {
            disponivel = false;
            return true;
        }
        return false;
    }

    @Override
    public void devolver() {
        disponivel = true;
    }

    @Override
    public String toString() {
        return "Placa: " + placa +
                "\nModelo: " + modelo +
                "\nAno: " + ano;
    }
}