package conection;

import java.util.Date;

public class Aluno {

	private String matricula;
	private String nome;
	private double cra;
	private Date dtNasc;
	private int idProjeto;

	public Aluno(String matricula, String nome, double cra, Date dtNasc, int idProjeto) {
		this.matricula = matricula;
		this.nome = nome;
		this.cra = cra;
		this.dtNasc = dtNasc;
		this.idProjeto = idProjeto;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public double getCra() {
		return cra;
	}

	public Date getDtNasc() {
		return dtNasc;
	}

	public int getIdProjeto() {
		return idProjeto;
	}
}
