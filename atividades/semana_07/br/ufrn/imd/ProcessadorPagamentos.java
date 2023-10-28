package br.ufrn.imd;

import java.util.Collection;
import java.util.ArrayList;

public class ProcessadorPagamentos {
      
    public boolean processarPagamento(Collection<MetodoPagamento> pagamentos) {
        Collection<MetodoPagamento> debitados = new ArrayList<>();

        for (MetodoPagamento pagamento : pagamentos) {
            if(!pagamento.debitar()){
                for (MetodoPagamento estorno : debitados) estorno.estornar();
                
                return false;
            }

            debitados.add(pagamento);
        }
        return true;
    }
}
