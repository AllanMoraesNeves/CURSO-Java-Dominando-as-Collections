package Aula;

import java.util.Comparator;

public class Aula implements Comparable<Aula> {

	private String titulo;
	private int tempo;

	public Aula() {
		// TODO Auto-generated constructor stub
	}

	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Aula " + this.titulo + " com duração de " + this.tempo + " minutos";
	}

	@Override
	public int compareTo(Aula outraAula) {

		return this.titulo.compareTo(outraAula.titulo);
	}

}
