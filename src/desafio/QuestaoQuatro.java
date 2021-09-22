package desafio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
		Questão 4) Reescreva o trecho de código destacado em amarelo abaixo para fazer com que o método
	public void printIntersection(int[] setA, int[] setB) tenha um processamento mais
	eficiente:
	
	import java.util.ArrayList;
	
	import java.util.Arrays;
	
	public class Solution4 {
		public void printIntersection(int[] setA, int[] setB) {
			if (setA != null && setB != null) {
				
					Arrays.sort(setA);
					
					Arrays.sort(setB);
					
					ArrayList<Integer> commonSet = new ArrayList<Integer>();
					
					for (int i = 0; i < setA.length; i++) {
					
						for (int j = 0; j < setB.length; j++) {
						
							if (setA[i] == setB[j] && !commonSet.contains(setA[i])) {
								commonSet.add(setA[i]);
							}
						}
					}
				
				for (int k = 0; k < commonSet.size(); k++) {
					System.out.print(commonSet.get(k) + " ");
				}
			
			}
		}
	}

 */
public class QuestaoQuatro {

	public static void main(String[] args) {

		int[] array1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int[] array2 = new int[] { 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		
		printIntersection(array1, array2);
	}


	// Obtem dois arrays e cria uma lista onde existem apenas elementos que os dois array possuem em comum
	public static void printIntersection(int[] setA, int[] setB) {
		
		if (setA != null && setB != null) {
			
			Arrays.sort(setA);
			
			Arrays.sort(setB);
			
			ArrayList<Integer> commonSet = (ArrayList<Integer>) Arrays.stream(setA).boxed().collect(Collectors.toList());
			
			commonSet.retainAll((ArrayList<Integer>) Arrays.stream(setB).boxed().collect(Collectors.toList())); 
			
			for (int k = 0; k < commonSet.size(); k++) {
				
				System.out.print(commonSet.get(k) + " ");
			}
		}
	}
	
}
