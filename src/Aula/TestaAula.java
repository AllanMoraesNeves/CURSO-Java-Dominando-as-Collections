package Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaAula {

	public static void main(String[] args) {
		Aula aula = new Aula("Curso", 21);

		List<Aula> aulas = new ArrayList<>();
		aulas.add(new Aula("curso4", 12));
		aulas.add(new Aula("curso9", 11));
		aulas.add(new Aula("curso6", 14));
		aulas.add(new Aula("curso5", 13));
		aulas.add(new Aula("curso2", 10));
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
	//	for (Aula aula2 : aulas) {
	//		System.out.println(aula2);
	//	}
	}

}
