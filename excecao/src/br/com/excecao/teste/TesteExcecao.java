package br.com.excecao.teste;

public class TesteExcecao {

	// Exception � a super classe de exce��es
	public static void main(String[] args) {
		try {
			int numero = Integer.parseInt("7");
			//if (numero<0) {
			//	throw new RuntimeException("eu derrubei voc�");
			//}
			System.out.println("N�mero: " + numero);
		
			String palavra ="";
			System.out.println("Qtde Letras: " + palavra.length());
		
			int[] numeros = new int[2];
			numeros[0]=502;
			numeros[1]=187;
			numeros[2]=235;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Vetor estourado");
			
		}catch(NullPointerException e) {
			System.out.println("Objeto nulo");
			
		}catch(NumberFormatException e) {
			System.out.println("N�mero inv�lido");
			
		}catch(Exception e) {
			System.out.println("Deu ruim");
			// mostra qual excecao que aconteceu
			e.printStackTrace();
		}finally { //comando executado de qualquer forma
			System.out.println("Tenha um bom dia");
			//fechar comunicacao com banco de dados
		}
		
		
		
	}
}
