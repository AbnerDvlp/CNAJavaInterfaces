package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import servicos.ServicoPagamento;

public class Contrato implements ServicoPagamento {
	private int numero;
	private Date data;
	private Double valorTotal;

	public Contrato() {

	}

	public Contrato(int numero, Date data, Double valorTotal) {
		super();
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public int getNome() {
		return numero;
	}

	public void setNome(int numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	private Date addMes(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}

	@Override
	public void geraParcelas(int numParcelas, double valorTotal, Date data) {

		List<Parcela> np = new ArrayList<>();
		

		for (int i = 1; i <= numParcelas; i++) {

			double vlrParcela = (valorTotal / numParcelas);
			vlrParcela = vlrParcela + (vlrParcela * (i / 100.00));
			vlrParcela = vlrParcela + (vlrParcela * 0.02);
			
			Date dataP = addMes(data, i);

			np.add(new Parcela(dataP, vlrParcela));

		}

		for (Parcela parcela : np) {
			System.out.println(parcela.toString());
		}
	}

}
