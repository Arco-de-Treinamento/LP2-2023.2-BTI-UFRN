import java.util.ArrayList;
import java.util.List;

public class Container<C extends Carga>{
    private List<C> conteudo = new ArrayList<C>();

    public void adicionarCarga(C carga){
        conteudo.add(carga);
    }

    public void listarCarga(){
        for(C carga : conteudo){
            System.out.println("Carga: " + carga.getProduto() + " Tipo: " + carga.getClass());
        }
    }
}
