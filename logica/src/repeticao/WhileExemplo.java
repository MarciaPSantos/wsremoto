package repeticao;

import javax.swing.JOptionPane;

public class WhileExemplo {

	public static void main(String[] args) {
		
		String email = JOptionPane.showInputDialog("Email").toLowerCase();
		
		while (email.contains("@")==false) {
			email=JOptionPane.showInputDialog("Email com @").toLowerCase();
		}
		
		System.out.println("Usu?rio: " + email.substring(0, email.indexOf("@")));
		
		/*Pe?a o nome da pessoa e exiba no final
		 * Garanta que o nome tenha mais que 3 caracteres e menos que 15 caracteres		 * 
		 */
		
		String nome = JOptionPane.showInputDialog("Nome: ").toUpperCase();
			
		while (nome.length()<3 || nome.length()>15) {		
			nome=JOptionPane.showInputDialog("Nome deve contar mais que 3 menos que 15 caracteres");
		}		
		System.out.println("Nome: " + nome);
				
	}
}
