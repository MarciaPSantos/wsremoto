package variaveis;

import javax.swing.JOptionPane;
// fazer swing: fazer telas

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		
	/* Regras para nome de identificadores (vari�veis, calsse):
	 *  - n�o utilizar palavras reservadas da linguagem
	 *  - n�o come�ar com n�mero
	 *  - n�o utilizar caracteres especiais (@, #, *, , .....) 
	 * 
	 * Padr�es para identificadores:
	 *  - use nomes significativos
	 *  - utilize de prefer�ncia o padr�o CamelCase
	 *  - vari�veis e m�todos come�am com letra mai�scula (m�todo vem seeguido de par�nteses)
	 *  	- Ex: xpto(): � um m�todo
	 *  		  xpto: � uma vari�vel
	 *  - classes come�am com letra min�scula
	 * 		- Exemplos: Xpto � uma classe 
	 */
					
		String time1 = JOptionPane.showInputDialog("Digite o Time 1"); //control + shift �: importa classes externas)
		String time2 = JOptionPane.showInputDialog("Digite o Time 2");
		float entrada = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da entrada"));
		int publico = Integer.parseInt(JOptionPane.showInputDialog("Digite o p�blico"));
	
	/*Classes Wrappers:	s�o classes que apoiam os tipos primitivos
	 * int = Integer
	 * double = Double
	 * 
	 * Tipos primitivos (todos do tipo num�rico - muda a capacidade de armazenamento entre eles):
	 * 	- boolean: true/false (perguntas l�gicas - N�O � quando tem 2 op��es , ex:fem/masc)
	 *  - char:armazena somente UM caracter. N�o armazena o caracter, mas sim o n�mero dele na tabela ASC
	 *  sempre entre aspas simples (ap�strofos). Ex: 'a'
	 *  =========================================
	 *  Armazenar n�meros inteiros
	 *  - byte:255 possibilidades -127/+128
	 *  - short: -32mil/+32mil
	 *  - int: -2trilhoes/+2trilhoes -> tipo padr�o para os n�meros inteiros
	 *  - long: quintilhoes
	 *  =========================================
	 *  Armazenar n�meros com caso decinal
	 *  - float: pouca precis�o nas casas decimais (5 casas)
	 *  - double: dobro de precis�o do float nas casas decimais - tipo padr�o para os n�meros reais
	 *  
	*/
		
		double total = (publico * entrada);
		
		
		System.out.printf("No jogo entre %s e %s a arrecada��o foi de %.2f", time1, time2, total);
	}
	
	

}
