public class Palete implements Carga{
    private String produto;
    public Palete(String p){
        this.produto = p;
    }
    @Override
    public String getProduto() {
        return produto;
    }
}
