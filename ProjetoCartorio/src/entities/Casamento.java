package entities;

import java.time.LocalDate;

public class Casamento {

	private String nomeConjuge1;
	private String nomeConjuge2;
	private LocalDate dataCasamento;
	private String localCasamento;

	public Casamento() {
	}

	public Casamento(String nomeConjuge1, String nomeConjuge2, LocalDate dataCasamento, String localCasamento) {
		super();
		this.nomeConjuge1 = nomeConjuge1;
		this.nomeConjuge2 = nomeConjuge2;
		this.dataCasamento = dataCasamento;
		this.localCasamento = localCasamento;
	}

	public String getNomeConjuge1() {
		return nomeConjuge1;
	}

	public void setNomeConjuge1(String nomeConjuge1) {
		this.nomeConjuge1 = nomeConjuge1;
	}

	public String getNomeConjuge2() {
		return nomeConjuge2;
	}

	public void setNomeConjuge2(String nomeConjuge2) {
		this.nomeConjuge2 = nomeConjuge2;
	}

	public LocalDate getDataCasamento() {
		return dataCasamento;
	}

	public void setDataCasamento(LocalDate dataCasamento) {
		this.dataCasamento = dataCasamento;
	}

	public String getLocalCasamento() {
		return localCasamento;
	}

	public void setLocalCasamento(String localCasamento) {
		this.localCasamento = localCasamento;
	}

}
