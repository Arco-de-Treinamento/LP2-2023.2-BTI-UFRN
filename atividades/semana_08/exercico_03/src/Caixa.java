public class Caixa implements Carga{
    private final String produto;
    public Caixa(String p){
        this.produto = p;
    }
    @Override
    public String getProduto() {
        return produto;
    }
}
