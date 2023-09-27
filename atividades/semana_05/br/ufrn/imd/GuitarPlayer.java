package br.ufrn.imd;

public class GuitarPlayer extends Musician {
    int howManyYears;
    boolean playEletronicGuitar;
    boolean playAcousticGuitar;

    public GuitarPlayer(String name, String hometown, boolean playClassicalMusic, boolean canImprovise, boolean canCompose, int howManyYears, boolean playEletronicGuitar, boolean playAcousticGuitar) {
        super(name, hometown, playClassicalMusic, canImprovise, canCompose);
        this.howManyYears = howManyYears;
        this.playEletronicGuitar = playEletronicGuitar;
        this.playAcousticGuitar = playAcousticGuitar;
    }

    public void playGuitar(){
        //Conteudo do metodo playGuitar
    }
}
