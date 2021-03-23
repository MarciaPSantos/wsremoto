package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		/* while e do while � mais para o usu�rio final (front end)
		 * backend � mais utilizado o for -> trabalha entre o front e o banco de dados
		 */
		
		/* Sintaxe for:
		 * - contador e o valor inicial;
		 * - condi��o (at� quando?);
		 * - como vai ocorrer o incremento (a contagem)
		 */
		
	// for(tipo vari�vel valor inicial; condi��o;incremento)
	//for(int contador=0; contador<50;contador+=1) {
	//	System.out.println("contador: " + contador);
	//	}
		
		
		short tabuada = Short.parseShort(JOptionPane.showInputDialog("Tabuada: "));
		for(int cont=1;cont<11;cont+=1) {
			System.out.println(tabuada + " x " + cont + " = " + (tabuada*cont));
		}	
			
		
		
		
		
		
		
	}
}
