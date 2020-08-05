package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcela {
	Date dataP;
	double vlrTotalP;
	
	public Parcela(Date dataP, double vlrTotalP) {
		this.dataP = dataP;
		this.vlrTotalP = vlrTotalP;
	}

	public Date getDataP() {
		return dataP;
	}

	public void setDataP(Date dataP) {
		this.dataP = dataP;
	}

	public double getVlrTotalP() {
		return vlrTotalP;
	}

	public void setVlrTotalP(double vlrTotalP) {
		this.vlrTotalP = vlrTotalP;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Parcela [Vencimento = " + sdf.format(dataP) + " - Valor Total = " + vlrTotalP + "]";
	}
	
	
	
	
}
