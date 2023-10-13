package br.ufrn.imd;

// Serialização de objetos
import java.io.Serializable;

public class User extends Entity implements Serializable {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String fileName() {
        return name + "_user.txt";
    }

    @Override
    public boolean validar() {
        return (name.length() > 5) ? true : false;
    }
}
