package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao {
	
	public static void main(String[] args) {
		
		/* Jogador 1 ir� digitar o n�mero
		 * Jogador 2 ira tentar adivinhar o numero
		 * 
		 * Miss�o 1:
		 * - d� dicas ao jogador 2, se ele est� chutando alto ou baixo
		 * 
		 * Miss�o2:
		 * - acrescentar na msgm de Parab�ns quantas tentativas foram utilizadas para acertar
		 * 
		 * Dica: utilizar vari�vel para contar 
		 *
		 *
		 *Miss�o1 - nesse c�digo o "jog2=0" n�o funciona! precisa de mais um parse.Int antes do while e dai da problema no cont
		
		 int jog1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1, digite um n�mero: "));
		 int jog2 = 0;
		 int cont=0;		
			
		  while (jog2 != jog1) {
			jog2 = Integer.parseInt(JOptionPane.showInputDialog("Acerte o n�mero do jogador 1: "));
			if (jog1>jog2) {
				System.out.println("Voc� est� chutando um valor baixo!");
				cont=cont+1;
			} else if (jog1<jog2) {
				System.out.println("Voc� est� chutando um valor alto!");
				cont=cont+1;
		    } else {
		    	System.out.println("Parab�ns! Voc� acertou!!");
		    	System.out.println("Tentativas: " + (cont+1));
		    }
		    	
	     }
	*/ 
		    
		// Outra forma:
		  
	  int num = Integer.parseInt(JOptionPane.showInputDialog("N�mero 1: "));
	  int chute = 0;
	  int cont = 0;	
		  
		  do{
		 	chute=Integer.parseInt(JOptionPane.showInputDialog("Acerte o n�mero: "));
		 	cont=cont+1;
		 	if (chute>num) {
		 		System.out.println("Est� chutando alto!");
		 	}else if (chute<num) {
		 		System.out.println("Voc� est� chutando um valor baixo!");
		 	} 
		    	
		 } while (chute != num);	
		 			
		 	System.out.println("Parab�ns! Voc� acertou com " + cont + " tentativa(s)");
				
		
		
	}
}
