package variaveis;

import javax.swing.JOptionPane;
// fazer swing: fazer telas

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
	/* Regras para nome de identificadores (variáveis, calsse):
	 *  - não utilizar palavras reservadas da linguagem
	 *  - não começar com número
	 *  - não utilizar caracteres especiais (@, #, *, , .....) 
	 * 
	 * Padrões para identificadores:
	 *  - use nomes significativos
	 *  - utilize de preferência o padrão CamelCase
	 *  - variáveis e métodos começam com letra maiúscula (método vem seeguido de parênteses)
	 *  	- Ex: xpto(): é um método
	 *  		  xpto: é uma variável
	 *  - classes começam com letra minúscula
	 * 		- Exemplos: Xpto é uma classe 
	 */
					
		String time1 = JOptionPane.showInputDialog("Digite o Time 1"); //control + shift ó: importa classes externas)
		String time2 = JOptionPane.showInputDialog("Digite o Time 2");
		float entrada = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da entrada"));
		int publico = Integer.parseInt(JOptionPane.showInputDialog("Digite o público"));
	
	/*Classes Wrappers:	são classes que apoiam os tipos primitivos
	 * int = Integer
	 * double = Double
	 * 
	 * Tipos primitivos (todos do tipo numérico - muda a capacidade de armazenamento entre eles):
	 * 	- boolean: true/false (perguntas lógicas - NÃO é quando tem 2 opções , ex:fem/masc)
	 *  - char:armazena somente UM caracter. Não armazena o caracter, mas sim o número dele na tabela ASC
	 *  sempre entre aspas simples (apóstrofos). Ex: 'a'
	 *  =========================================
	 *  Armazenar números inteiros
	 *  - byte:255 possibilidades -127/+128
	 *  - short: -32mil/+32mil
	 *  - int: -2trilhoes/+2trilhoes -> tipo padrão para os números inteiros
	 *  - long: quintilhoes
	 *  =========================================
	 *  Armazenar números com caso decinal
	 *  - float: pouca precisão nas casas decimais (5 casas)
	 *  - double: dobro de precisão do float nas casas decimais - tipo padrão para os números reais
	 *  
	*/
		
		double total = (publico * entrada);
		
		
		System.out.printf("No jogo entre %s e %s a arrecadação foi de %.2f", time1, time2, total);
	}
	
	

}
