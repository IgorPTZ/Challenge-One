package desafio;
import java.util.HashMap;

public class QuestaoDois {
	
	public static void main(String[] args) {
		
		int[] array = new int[] {-2, -1, 0, 2, 4, 7, 8, 9, 9};
		
		getPairs(array, 8);
	}
	
	public static void getPairs(int [] array, int x) {
		
		// Armazena os pares
		HashMap<String, int[]> pairs = new HashMap<String, int[]>();
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 1; j < array.length; j++) {
				
				
				if(array[i] + array[j] == x) {
					
					int[] pair = {array[i] , array[j]};
					
					boolean paresSemelhantesNaoExistem = !pairs.containsKey("(" + array[i] + ", " + array[j] + ")") 
						                              && !pairs.containsKey("(" + array[j] + ", " + array[i] + ")");
					
					// Evita que os pares se repitam dentro do hashmap
					if(paresSemelhantesNaoExistem) {
						 
						pairs.put("(" + array[i] + ", " + array[j] + ")", pair);	
					}
				}
			}
		}
		
		System.out.print("[");
		
		pairs.forEach((key, value) -> System.out.print("[" + value[0] + "," + value[1] + "] "));
		
		System.out.println("]");
	}
}
