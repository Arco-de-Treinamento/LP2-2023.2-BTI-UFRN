package br.ufrn.imd;

public class Pix implements MetodoPagamento {
    @Override
    public boolean debitar() {
        return true;
    }

    @Override
    public void estornar() {
        System.out.println("VALOR DO PIX ESTORNADO");
    }
    
}
