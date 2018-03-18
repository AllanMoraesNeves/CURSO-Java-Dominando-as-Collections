package aluno;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import Aula.Aula;
import Curso.Curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adicionaAula(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adicionaAula(new Aula("Criando uma Aula", 20));
		javaColecoes.adicionaAula(new Aula("Modelando com colecoes", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 65456);
		Aluno a2 = new Aluno("Diego", 23132);
		Aluno a3 = new Aluno("Rayssa", 4214343);

		// javaColecoes.getAlunos().add(a1);
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();

		while (iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println("iterador " + proximo);
		}

		for (Aluno string : alunos) {
			// System.out.println(string);
		}

		// System.out.println(javaColecoes.getAlunos());

		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
		// System.out.println(alunosSincronizados);

		System.out.println("O aluno " + a1.getNome() + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));

		String alunoProcurado = "Rodrigo Turini";
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));

		System.out.println("O a1 é equals ao Turini?");
		System.out.println(a1.equals(turini));

	}
}
