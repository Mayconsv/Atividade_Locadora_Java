package com.mycompany.atividade_locadora.entidades;

public class Carro extends Veiculo {
    private int qntPortas;

    public Carro(String placa, String modelo, int ano, int qntPortas) {
        super(placa, modelo, ano);
        this.qntPortas = qntPortas;
    }

    public int getQntPortas() {
        return qntPortas;
    }

    public void setQntPortas(int qntPortas) {
        if (qntPortas >= 1 && qntPortas <= 10) {
            this.qntPortas = qntPortas;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nQuantidade de Portas: " + qntPortas;
    }
    
    
}
