package br.ufrn.imd;

// Serialização de objetos
import java.io.Serializable;

public class Product extends Entity implements Serializable {
    private double price;
    private String name;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String fileName() {
        return name + "_product.txt";
    }

    @Override
    public boolean validar() {
        return (price >= 0) ? true : false;
    }
}
