package servicos;

import java.util.Date;

public interface ServicoPagamento {
	public void geraParcelas(int numParcelas,double valorTotal,Date date);
}
