package conection;

import java.util.Date;

public class Projeto {
	
	private String titulo;
	private String descricao;
	private Date dataInicio;
	private Date dataFim;
	private int idLaboratorio;

	public Projeto(String titulo, String descricao, Date dataInicio, Date dataFim, int idLaboratorio) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.idLaboratorio = idLaboratorio;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public int getIdLaboratorio() {
		return idLaboratorio;
	}
	
	

}
