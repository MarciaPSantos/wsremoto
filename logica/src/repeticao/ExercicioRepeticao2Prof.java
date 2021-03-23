package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao2Prof {
	
	public static void main(String[] args) {
		
		/* Programa que solicite o nome e idade das pessoas
		 * A aplica��o continuar� perguntando nome e idade enquanto o usu�rio afirmar que deseja continuar
		 * Ao terminar a aplica��o dever� exibir:
		 *  - Qtd de pessoas >= 18 anos - ok
		 *  - M�dia de idades registradas - ok
		 *  - Pessoa mais velha: nome e idade
		 *  - pessoa mais jovem: nome e idade
		 */
		
		//Miss�o2
		
		String nome="";
		short idade=0;
		short qtdeMaioresIdade=0;
		short totalIdades=0;
		short qtdPessoas=0;
		String nomeMaisExperiente="";
		short idadeMaisExperiente=0;
		String nomeMaisJovem="";
		short idadeMaisJovem=0;
		
		
		do {
			nome=JOptionPane.showInputDialog("Entre com o nome: ");
			idade=Short.parseShort(JOptionPane.showInputDialog("Digite a idade: "));
			
			if(idade<idadeMaisJovem || qtdPessoas==0) {
				idadeMaisJovem=idade;
				nomeMaisJovem=nome;				
			}
			
			
			if(idade>idadeMaisExperiente) {
				idadeMaisExperiente=idade;
				nomeMaisExperiente=nome;				
			}
			
			if (idade>=18) {
				qtdeMaioresIdade+=1;
			}
			
			qtdPessoas+=1;
			totalIdades+=idade;
			
		} while (JOptionPane.showConfirmDialog(null, "Continuar", "Exerc�cio2", JOptionPane.YES_NO_OPTION)==0);
			
	    JOptionPane.showMessageDialog(null, "Maiores de idade: " + qtdeMaioresIdade);
	    JOptionPane.showMessageDialog(null, "M�dia de idades: " + (totalIdades/qtdPessoas));
	    JOptionPane.showMessageDialog(null, "Nome da mais experiente: " + nomeMaisExperiente + "\nIdade mais experiente: " + idadeMaisExperiente);
	    JOptionPane.showMessageDialog(null, "Nome da mais jovem: " + nomeMaisJovem + "\nIdade mais jovem: " + idadeMaisJovem);
		
	}
}
