package Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Aula.Aula;
import aluno.Aluno;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aula = new ArrayList<>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> mapa = new HashMap<>();

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Curso(String string, String string2) {
		this.nome = string;
		this.instrutor = string2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	@Override
	public String toString() {
		return "Curso " + this.nome + " com o instrutor " + this.instrutor + "e com as aulas" + this.aula;
	}

	public List<Aula> getAula() {
		return Collections.unmodifiableList(aula);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula tempo : aula) {
			tempoTotal += tempo.getTempo();
		}
		return tempoTotal;
	}

	public void setAula(List<Aula> aula) {
		this.aula = aula;
	}

	public void adicionaAula(Aula aula) {
		this.aula.add(aula);
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.mapa.put(aluno.getNumeroMatricula(), aluno);
	}

	public boolean estaMatriculado(Aluno a1) {
		return this.alunos.contains(a1);
	}

	public Aluno buscaMatricula(int matricula) {
		return this.mapa.get(matricula);
	}

}
