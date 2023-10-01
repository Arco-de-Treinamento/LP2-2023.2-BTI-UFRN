package br.ufrn.imd;

public class Funcionario {
    int chMensal;
    double hh;

    public Funcionario(int chMensal, double hh){
        this.chMensal = chMensal;
        this.hh = hh;
    }

    double calcularSalario(){
        return chMensal * hh;
    }
}