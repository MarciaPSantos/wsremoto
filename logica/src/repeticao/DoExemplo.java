package repeticao;

import javax.swing.JOptionPane;

public class DoExemplo {

	public static void main(String[] args) {
	
	//Exercicio 3 - Lista 2	
		
	int numero1=0;
	int numero2=0;
	String operacao="";
	String resp="";
	
	do {
			numero1 = Integer.parseInt(JOptionPane.showInputDialog("N�mero 1: "));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("N�mero 2: "));
			operacao=JOptionPane.showInputDialog("Digite o operador: ");
			
			// n�o precisa colocar o ==true nesse caso
			if (operacao.equals("+")==true) {
				System.out.println("Resultado: " + (numero1+numero2));
			} else if (operacao.equals("-")) {
				System.out.println("Resultado: " + (numero1-numero2));
			} else if (operacao.equals("*")) {
				System.out.println("Resultado: " + (numero1*numero2));
			} else if (operacao.equals("/")) {
				System.out.println("Resultado: " + (numero1/numero2));
			} else {
				System.out.println("Voc� n�o digitou um operador v�lido");
			}	
	
	resp=JOptionPane.showInputDialog("Digite S para continuar: ").toUpperCase();
	
	}while (resp.equals("S"));
		
		
			

		
		
		
	
				
		
		
		
		
		
	}
}
