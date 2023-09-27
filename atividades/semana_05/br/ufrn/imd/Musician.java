package br.ufrn.imd;

public class Musician extends Person {
    boolean playClassicalMusic;
    boolean canImprovise;
    boolean canCompose;

    public Musician(String name, String hometown, boolean playClassicalMusic, boolean canImprovise, boolean canCompose) {
        super(name, hometown);
        this.playClassicalMusic = playClassicalMusic;
        this.canImprovise = canImprovise;
        this.canCompose = canCompose;

        //Conteudo do construtor
    }

    public void play(){
        //Conteudo do metodo play
    }
}
