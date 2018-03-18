package aluno;

public class Aluno {
	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	@Override
	public String toString() {
		return "Nome: " + this.nome + " Matricula: " + this.numeroMatricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outroaluno = (Aluno) obj;
		return this.nome.equals(outroaluno.nome);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
