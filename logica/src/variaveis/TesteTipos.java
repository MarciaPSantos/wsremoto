package variaveis;

import javax.swing.JOptionPane;

public class TesteTipos {
	
	public static void main(String[] args) {
		
		/*Dados a serem capturados:
		 * Nome do produto (notebook's)
		 * Quantidade
		 * Taxa de Imposto
		 * Valor
		 * No final devera exibir
		 * 	- o valor acrescido do imposto
		 *  - o valor do imposto isolado
		 *  - o total com imposto
		 *  - o total sem imposto
		 */
		
		String produto = JOptionPane.showInputDialog("Digite o Nome do Notebook"); 
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));	
		float taxa = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de imposto"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor unitário"));
		float imposto = (taxa/100) * valor;
		float valor_imposto = valor + imposto;
		double total1 = valor * quantidade;
		double total2 = total1 + imposto;
		
		
		System.out.println("Nome......................: " + produto);
		System.out.printf("Valor acrescido do imposto.: %.2f\n" , valor_imposto );
		System.out.printf("Valor do imposto isolado...: %.2f\n" , imposto ); 
		System.out.printf("Valor total sem imposto....: %.2f\n" , total1 );
		System.out.printf("Valor total com imposto....: %.2f\n" , total2 );
	
		
		
	}
	
	

}
