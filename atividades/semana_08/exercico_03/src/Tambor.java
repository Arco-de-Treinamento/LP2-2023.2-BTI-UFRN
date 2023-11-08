public class Tambor implements Carga{
    private final String produto;
    public Tambor(String p){
        this.produto = p;
    }
    @Override
    public String getProduto() {
        return produto;
    }
}
