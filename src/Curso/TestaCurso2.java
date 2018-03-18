package Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import Aula.Aula;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adicionaAula(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adicionaAula(new Aula("Criando uma Aula", 20));
		javaColecoes.adicionaAula(new Aula("Modelando com colecoes", 24));
		
		System.out.println(javaColecoes);
		
		List<Aula> aulasimutaveis = javaColecoes.getAula();
		List<Aula> aulas = new ArrayList<>(aulasimutaveis);
		
		
		Collections.sort(aulas);
		System.out.println(aulas);

	}
}
