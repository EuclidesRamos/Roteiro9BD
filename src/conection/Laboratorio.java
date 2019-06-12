package conection;

public class Laboratorio {
	
	private String nome;
	private String descricao;
	
	public Laboratorio(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return this.nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

}
