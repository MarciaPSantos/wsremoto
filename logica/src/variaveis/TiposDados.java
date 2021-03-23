package variaveis;
/* 
 * Tipos de Dados:
 * Alfanuméricos:dado que NÃO SERÁ Utilizado em cálculo matemático.
 * EX: (contexto departamento pessoal do itau) CEP => 00010-009 = 00010-009
 * Java: 
 * 	- String (letra maiuscula indica que é uma classe)
 * 
 *  * Numéricos:dado que PODE ser utilizado em cálculo matemático e/ou 
 * for considerado um dado crítico para o sistema.
 * EX: (contexto site dos correios) CEP => 00010-009 = 1
 * numérico é processado mais rápido que o alfa
 * Java: tipos primitivos, não é classe, já esta incorporado
 * 	- com casas decimais: double
 * 	- sem casas decimais: int	
 * 
 * Variável: espaço temporário em memória para armazenar um dado
 * 	- Sintaxe:
 * 	<tipo do dado> <nome da variável> = <valor/dado>
 * Ex: String marca = "SAMSUNG" 
 * OBS: persistir o dado é tirar da memória e gravar fisicamente (ex: em banco de dados) 
 */
public class TiposDados {	
	//main() é o Start Point da App. Método main esta dentro da classe TipoDados
	// main + (control+espaço) + enter
	public static void main(String[] args) { // [] podem ser depois de string ou depois de args
		String nome = "Marcia Santos";
		int idade = 30;
		double altura = 1.62; //utiliza-se ponto
		double peso = 59.5;
		double imc = peso / (altura*altura);
		
		System.out.println("Nome..: " + nome); //ln precisa do +
		System.out.println("Idade.: " + idade); //sysout + (control+espaço)
		System.out.println("\nAltura: " + altura); // \n -> pula uma linha antes
		System.out.println(); // -> pula linha
		System.out.printf("IMC...: %.2f\n" , imc ); //f usa virgula e não + / %.Xf: número de decimal)
		System.out.printf("Olá %s seu IMC é %.2f", nome, imc);
	
		
		/*Nível da linguagem:
		 * 	- Alto nível: simples para o aprendizado, pq está mais próximo da linguagem humana
		 * 	- Baixo nível: mais complexo e mais próximo da linguagem de máquina
		 * 
		 * Siglas do Java
		 * JDK Java Development Kit -> ferramentas para o desenvolvedor (as abaixo vc é apenas um usuário)
		 * 		JRE Java Runtime Environment -> responsável por executar toda a aplicação
		 * 			JVM Java Virtual Machine -> responsável pela portabilidade. A aplicação roda em qualquer  plataforma (está dentro da JRE)
		 */
		
						
	}
	

}
