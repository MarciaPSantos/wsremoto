package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {
	
	public static void main(String[] args) {
		
		/*Capturar
		 * - nome da disciplina
		 * - nota1
		 * - nota2
		 * - faltas
		 * Aprovado: media for maior ou igual a 6 e faltas menor que 20
		 * Exibir m?dia
		 * Exibir nota menor que 4 = reprovado
		 */
	
		String disciplina = JOptionPane.showInputDialog("Digite o nome da mat?ria: ").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
		int faltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o n?mero de faltas: "));
		float media = ((nota1 + nota2)/2);
				
		System.out.println("M?dia: " + media);
		
		if ((media>=6) && (faltas<20)) {
			System.out.println("Parab?ns!! Voc? foi aprovado na disciplina: " + disciplina);
		} else if ((media<4) || (faltas>=20)) {
			System.out.println("Voc? est? reprovado na disciplina: " + disciplina);
		} else {
			System.out.println("Voc? est? de exame na disciplina: " + disciplina);
		}

		/*Outra maneira: se estourou em faltas, n?o precisa nem calcular a m?dia
		 *
		 * String disciplina = JOptionPane.showInputDialog("Digite o nome da mat?ria: ").toUpperCase();
		 * short faltas = short.parseShort(JOptionPane.showInputDialog("Digite o n?mero de faltas: "));
		 * 
		 * if (faltas>20){
		 *     System.out.println("Voc? est? reprovado por faltas");
		 * } else {
		 *       float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
		 *       float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
		 *		 float media = ((nota1 + nota2)/2);
		 *		 
		 *       System.out.println("M?dia: " + media);
		 *		
		 *		 if (media>=6)  {
		 *			System.out.println("Parab?ns!! Voc? foi aprovado na disciplina: " + disciplina);
		 * 		 } else if (media<4) {
		 *			System.out.println("Voc? est? reprovado na disciplina: " + disciplina);
		 *		 } else {
		 *			System.out.println("Voc? est? de exame na disciplina: " + disciplina);
		 *		 }
		*/
		
		
	}

}
