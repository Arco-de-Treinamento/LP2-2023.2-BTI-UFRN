public class Main {
    public static void main(String[] args) {
        Container<Carga> container = new Container<>();

        container.adicionarCarga(new Caixa("Nintendo Switch 2"));
        container.adicionarCarga(new Palete("Playstation 6"));
        container.adicionarCarga(new Tambor("Coca-Cola - Canela"));

        container.listarCarga();
    }
}