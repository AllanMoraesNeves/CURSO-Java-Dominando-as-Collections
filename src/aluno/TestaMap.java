package aluno;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import Aula.Aula;
import Curso.Curso;

public class TestaMap {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adicionaAula(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adicionaAula(new Aula("Criando uma Aula", 20));
		javaColecoes.adicionaAula(new Aula("Modelando com colecoes", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 1);
		Aluno a2 = new Aluno("Diego", 2);
		Aluno a3 = new Aluno("Rayssa", 3);

		// javaColecoes.getAlunos().add(a1);
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		System.out.println(javaColecoes.buscaMatricula(2));

		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);

		for (String string : nomesParaIdade.keySet()) {
			System.out.println("mapa chave:" + string);
		}

		for (Integer string : nomesParaIdade.values()) {
			System.out.println("mapa valor:" + string);
		}
		
		for (Entry<String, Integer> string : nomesParaIdade.entrySet()) {
			System.out.println(string);
		}

	}
}
