package entities;

import java.text.SimpleDateFormat;

public class Nascimento {
	
	
	private String nome;
	private SimpleDateFormat dataNascimento;
	private String cidade;
	private String nomePai;
	private String nomeMae;
	private char sexo;

	public Nascimento() {
	}

	public Nascimento(String nome, SimpleDateFormat dataNascimento, String cidade, String nomePai, String nomeMae, char sexo) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cidade = cidade;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public SimpleDateFormat getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(SimpleDateFormat dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
