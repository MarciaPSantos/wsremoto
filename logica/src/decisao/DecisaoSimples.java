package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
	
	public static void main(String[] args) {
		
		/*Capturar:
		 * - nome da disciplina
		 * - nota1
		 * - nota2
		 * Exibir m�dia
		 * Exibir parab�ns somente se a m�dia for maior ou igual a 6
		 * Exibir nota menor que 4 = reprovado
		 */
	
		String disciplina = JOptionPane.showInputDialog("Digite o nome da mat�ria: ").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
		
		System.out.println("M�dia: " + ((nota1 + nota2)/2));
		
		if (((nota1 + nota2)/2)>=6) {
			System.out.println("Parab�ns!! Voc� foi aprovado na disciplina: " + disciplina);
		}
				
		if (((nota1 + nota2)/2)<4) {
			System.out.println("Infelizmente voc� foi reprovado na disciplina: " + disciplina);
		}
	
		/* && : and
		 * || : or
		 * != : diferente
		 * == : igual
		 */
		if ((((nota1 + nota2)/2)>=4) && (((nota1 + nota2)/2)<6)){
			System.out.println("Voc� est� de exame na disciplina: " + disciplina);
		}
		
		
		
		
		
	}

}
