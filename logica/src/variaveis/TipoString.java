package variaveis;

public class TipoString {

	public static void main(String[] args) {
		
		String email = "maRcia@gmAil.cOm";
		
		//padroniza��o no formato:
			System.out.println("Original.: " + email);
			System.out.println("\nMin�scula: " + email.toLowerCase()); // todas min�sculas
			System.out.println("\nMai�scula: " + email.toUpperCase()); // todas mai�sculas
		
		//quantidade de caracteres:
			System.out.println("\nCaracteres.: " + email.length());	
		
		//compara��o 
			System.out.println("\n� igual.: " + email.equals("maRcia@gmAil.cOm")); //true = igualzinho
			System.out.println("\n� igual.: " + email.equals("marcia@gmail.com")); //false = este esta minusculo
			
			System.out.println("\n� igual.: " + email.equalsIgnoreCase("marcia@gmail.com")); //true = ignora caixa alta e baixa
		
		//validacao de caracter
			System.out.println("\nTem @?: " + email.contains("@"));
			
		//indexOff = retorna a posi��o que est� a string que eu procuro. Se n�o encontrar retorna -1
			System.out.println("\nPosi��o do @: " + email.indexOf("@"));
			
		//retorna uma faixa do texto
			System.out.println("\nDo 3� at� o 5�: " + email.substring(2,4)); //pega o terceiro e quarto
	
		//outra forma: if (email.indexOf("@")>-1
		//exibir a parte antes de algum caracter -> combina��o de m�todos	
			if (email.contains("@")==true){
				System.out.println("\nUsu�rio.: " + email.substring(0,email.indexOf("@")));	
			}		
			
			System.out.println("At� logo!");
			
			
	}
}
