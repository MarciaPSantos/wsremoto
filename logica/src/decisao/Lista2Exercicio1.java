package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		
		/* Um hotel cobra R$ 80,00 a di�ria e mais uma taxa de servi�os. 
		 * A taxa de servi�os � de: 
		 * 	R$ 5,50 por di�ria, se o n�mero de di�rias for maior que 15; 
		 * 	R$ 6,00 por di�ria, se o n�mero de di�rias for igual a 15; 
		 * 	R$ 8,00 por di�ria, se o n�mero de di�rias for menor que 15.
		 * Monte uma aplica��o que apresente a conta do cliente.
		 */
		
		short fixo = 80;
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Di�rias: "));
		
		if (diarias>15) {
			System.out.println("Conta cliente: " + ((fixo+5.5)*diarias));
		}else if (diarias==15) {
			System.out.println("Conta cliente: " + ((fixo+6.0)*diarias));
		}else {
			System.out.println("Conta cliente: " + ((fixo+8.0)*diarias));
		}
			
		
		/*Outra forma:
		 * boolean -> char -> byte -> short -> int -> long -> float -> double
		 * 
		 * float taxa = 8;
		 * float valor = 80;
		 * short diarias = Short.parseShort(JOptionPane.showInputDialog("Di�rias: "));
		 * 
		 * if (diarias>15) {
		 * 	   taxa = (float) 5.5; -> aqui esta ocorrendo um CAST
		 * }else if (diarias==15) {
		 *	    taxa = (float) 6;  
		 * }
		 *	
		 * System.out.println("Conta cliente: " + ((valor + taxa)*diarias));
		 */
		
	}
}
