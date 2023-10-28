package br.ufrn.imd;

public class Cartao implements MetodoPagamento {
    @Override
    public boolean debitar() {
        return false;
    }

    @Override
    public void estornar() {
        System.out.println("VALOR DO CARTAO ESTORNADO");
    }
}