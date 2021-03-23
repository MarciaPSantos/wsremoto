package variaveis;

public class TipoString {

	public static void main(String[] args) {
		
		String email = "maRcia@gmAil.cOm";
		
		//padronização no formato:
			System.out.println("Original.: " + email);
			System.out.println("\nMinúscula: " + email.toLowerCase()); // todas minúsculas
			System.out.println("\nMaiúscula: " + email.toUpperCase()); // todas maiúsculas
		
		//quantidade de caracteres:
			System.out.println("\nCaracteres.: " + email.length());	
		
		//comparação 
			System.out.println("\nÉ igual.: " + email.equals("maRcia@gmAil.cOm")); //true = igualzinho
			System.out.println("\nÉ igual.: " + email.equals("marcia@gmail.com")); //false = este esta minusculo
			
			System.out.println("\nÉ igual.: " + email.equalsIgnoreCase("marcia@gmail.com")); //true = ignora caixa alta e baixa
		
		//validacao de caracter
			System.out.println("\nTem @?: " + email.contains("@"));
			
		//indexOff = retorna a posição que está a string que eu procuro. Se não encontrar retorna -1
			System.out.println("\nPosição do @: " + email.indexOf("@"));
			
		//retorna uma faixa do texto
			System.out.println("\nDo 3º até o 5º: " + email.substring(2,4)); //pega o terceiro e quarto
	
		//outra forma: if (email.indexOf("@")>-1
		//exibir a parte antes de algum caracter -> combinação de métodos	
			if (email.contains("@")==true){
				System.out.println("\nUsuário.: " + email.substring(0,email.indexOf("@")));	
			}		
			
			System.out.println("Até logo!");
			
			
	}
}
