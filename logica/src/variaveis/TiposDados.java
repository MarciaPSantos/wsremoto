package variaveis;
/* 
 * Tipos de Dados:
 * Alfanum�ricos:dado que N�O SER� Utilizado em c�lculo matem�tico.
 * EX: (contexto departamento pessoal do itau) CEP => 00010-009 = 00010-009
 * Java: 
 * 	- String (letra maiuscula indica que � uma classe)
 * 
 *  * Num�ricos:dado que PODE ser utilizado em c�lculo matem�tico e/ou 
 * for considerado um dado cr�tico para o sistema.
 * EX: (contexto site dos correios) CEP => 00010-009 = 1
 * num�rico � processado mais r�pido que o alfa
 * Java: tipos primitivos, n�o � classe, j� esta incorporado
 * 	- com casas decimais: double
 * 	- sem casas decimais: int	
 * 
 * Vari�vel: espa�o tempor�rio em mem�ria para armazenar um dado
 * 	- Sintaxe:
 * 	<tipo do dado> <nome da vari�vel> = <valor/dado>
 * Ex: String marca = "SAMSUNG" 
 * OBS: persistir o dado � tirar da mem�ria e gravar fisicamente (ex: em banco de dados) 
 */
public class TiposDados {	
	//main() � o Start Point da App. M�todo main esta dentro da classe TipoDados
	// main + (control+espa�o) + enter
	public static void main(String[] args) { // [] podem ser depois de string ou depois de args
		String nome = "Marcia Santos";
		int idade = 30;
		double altura = 1.62; //utiliza-se ponto
		double peso = 59.5;
		double imc = peso / (altura*altura);
		
		System.out.println("Nome..: " + nome); //ln precisa do +
		System.out.println("Idade.: " + idade); //sysout + (control+espa�o)
		System.out.println("\nAltura: " + altura); // \n -> pula uma linha antes
		System.out.println(); // -> pula linha
		System.out.printf("IMC...: %.2f\n" , imc ); //f usa virgula e n�o + / %.Xf: n�mero de decimal)
		System.out.printf("Ol� %s seu IMC � %.2f", nome, imc);
	
		
		/*N�vel da linguagem:
		 * 	- Alto n�vel: simples para o aprendizado, pq est� mais pr�ximo da linguagem humana
		 * 	- Baixo n�vel: mais complexo e mais pr�ximo da linguagem de m�quina
		 * 
		 * Siglas do Java
		 * JDK Java Development Kit -> ferramentas para o desenvolvedor (as abaixo vc � apenas um usu�rio)
		 * 		JRE Java Runtime Environment -> respons�vel por executar toda a aplica��o
		 * 			JVM Java Virtual Machine -> respons�vel pela portabilidade. A aplica��o roda em qualquer  plataforma (est� dentro da JRE)
		 */
		
						
	}
	

}
