package desafio;

public class QuestaoTres {
	/*
	
		Questão 3) Complete o código Java abaixo:


		public class Solution3 {
			public double calcPM(int m, double p) {
			
			}
		}
		
		de forma que o método public double calcPM(int m, double p), ao receber um inteiro m (sendo 1
		<= m <= 10^9) e um valor double p, retorne o valor de p elevado a m (ou p^m) sem utilizar bibliotecas
		matemáticas ou a operação de exponenciação nativa do Java e que seja computacionalmente eficiente. Por
		exemplo,
		• calcPM(m = 1000, p = 0.999999999999D): 0,99999999900
		• calcPM(m = 1000000, p = 0.999999999999D): 0,99999900002
		• calcPM(m = 1000000000, p = 0.999999999999D): 0,99900052193
	
	 */
	
	public static void main(String [] args) {
		
		System.out.println("Resultado:" + calculate(1000, 0.999999999999D));
	}
	 
	 public static double calculate(int m, double p)
	 {
	    double temp;
	    
        if (m == 0)
            return (double) 1;
        
        temp = calculate(m / 2, p);
  
        if (m % 2 == 0)
            return temp * temp;
        else {
            if (m > 0)
                return p * temp * temp;
            else
                return (temp * temp) / p;
        }
	}
}
