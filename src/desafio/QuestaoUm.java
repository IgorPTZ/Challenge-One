package desafio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QuestaoUm {
	
	/*
	 Questão 1) Complete o código Java abaixo:

	public class Solution1 {
	 public int solution(int[] A) {
		
	 }
	}
	
	de forma que, ao receber um array A com N inteiros, o método public int solution(int[] A) retorne
	o menor número inteiro positivo (maior que 0) que não esteja presente em A. Por exemplo,
	• dado A = [1, 3, 6, 4, 1, 2], a função deve retornar 5;
	• dado A = [1, 2, 3], a função deve retornar 4;
	• dado A = [-1, -3], a função deve retornar 1.
	
	Escreva um algoritmo eficiente para o problema descrito acima respeitando as seguintes premissas:
	• N é um inteiro dentro do intervalo [1, 100.000];
	• cada elemento do array A é um inteiro dentro do intervalo [-1.000.000, 1.000.000].
	  
	 */
	public static void main(String[] args) {
		
		//int [] A = new int[]{-1, -3};
		
		//int [] A = new int[]{1, 2, 3};
				
		int [] A =  new int[]{1, 3, 6, 4, 1, 2};
		
	
		
		System.out.println("Valor: " + encontrarValorDesaparecido(A));
	}
	
	public static int encontrarValorDesaparecido(int[] array) {
		try {
			
			List<Integer> valoresQueNaoEstaoNoArray = new ArrayList<Integer>();
			
			Arrays.sort(array);
			
			for(int i = 1; i <= 1000000; i++) {
				
				int valorNaoEncontrado = Arrays.binarySearch(array, i);
				
				if(valorNaoEncontrado < 0 && i > 0) {
					
					valoresQueNaoEstaoNoArray.add(i);
				}
			}
			
			// Ordena a lista 
			valoresQueNaoEstaoNoArray.sort(Comparator.naturalOrder());
			
			// Retorna o menor valor dos valores nao encontrados
			return valoresQueNaoEstaoNoArray.get(0);
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return 0;
	}
}
