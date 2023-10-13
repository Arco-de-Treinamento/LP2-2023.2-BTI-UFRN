package br.ufrn.imd;

public class Main {
    public static void main(String[] args) {
        Product p = new Product(10, "Notebook");
        User u = new User("Joaquim");

        p.salvar();
        u.salvar();
    }
}
