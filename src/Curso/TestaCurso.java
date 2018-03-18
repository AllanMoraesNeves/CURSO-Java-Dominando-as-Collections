package Curso;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Aula.Aula;

public class TestaCurso {

	public static void main(String[] args) {

		Curso curso = new Curso("curso java", "allan");

		List<Aula> aula = curso.getAula();

		curso.getAula().add(new Aula("aula1", 10));
		
		curso.adicionaAula(new Aula("adiciona aula", 20));

		System.out.println(aula);
		System.out.println(curso.getAula());
	}
}
