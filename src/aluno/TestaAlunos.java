package aluno;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Allan");
		alunos.add("Diego");
		alunos.add("Rayssa");
		alunos.add("Rayssa");
		alunos.add("Lea");

		boolean allanEstaMatriculaod = alunos.contains("Allan");
		System.out.println(allanEstaMatriculaod);

		alunos.remove("Allan");

		for (String string : alunos) {
			System.out.println(string);
		}

		System.out.println(alunos);

		boolean adicionou = alunos.add("Diego");
		System.out.println("diego foi adicionado? " + adicionou);

		
		
		long inicio = System.currentTimeMillis();
		Set<Integer> performace = new HashSet<>();
		for (int i = 0; i < 50000; i++) {
			performace.add(i);
		}
		
		for (Integer integer : performace) {
			performace.contains(integer);
		}
		long fim = System.currentTimeMillis();
		long tempoDeExecucao = fim - inicio;
        System.out.println("Tempo gasto: " + tempoDeExecucao);

	}
}
