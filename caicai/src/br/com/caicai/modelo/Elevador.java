package br.com.caicai.modelo;

public class Elevador {

	private String nome;
	private byte maximoPessoas;
	private byte andarMaximo;
	private byte andarMinimo;
	private byte andarAtual;
	private byte qtdePessoas;
	
	//inicializar todas as vari?veis
	public void inicializar(String nome, byte pMaxPessoas, byte pAndarMax, byte pAndarMin) {
		this.nome = nome;
		maximoPessoas = pMaxPessoas;
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
	}
	
	
	//retornar o conteudo de todos os atributos -> feito automaticamente pelo caminho: source Generate toString
	@Override
	public String toString() {
		return "Elevador [nome=" + nome + ", maximoPessoas=" + maximoPessoas + ", andarMaximo=" + andarMaximo
				+ ", andarMinimo=" + andarMinimo + ", andarAtual=" + andarAtual + ", qtdePessoas=" + qtdePessoas + "]";
	}
	
	
	//incrementar a qtd de pessoas recebida no atributo qtdePessoas, mas n?o deve exceder o maximo de pessoas
	public void entrar(byte qtdePessoas) {
		if ((this.qtdePessoas+qtdePessoas)<=maximoPessoas) {
			this.qtdePessoas += qtdePessoas;
		}
	}
	
	
	//decrementar a qtd de pessoas recebida no atributo qtdePessoas, mas n?o deve ser menor que zero
	public void sair(byte qtdePessoas) {
		if ((this.qtdePessoas-qtdePessoas)>=0) {
			this.qtdePessoas -= qtdePessoas;
		}
	}
	
	
	//sobe um andar, n?o deve exceder o andarMaximo - aqui como pede String, PRECISA ter uma sa?da STRING!! (se e else)
	public String subir() {
		if (andarAtual<andarMaximo) {
			andarAtual+=1;
			return "Subindo para " + andarAtual;
		}
		return "N?o foi poss?vel";
	}
	
	
	// desce um andar, n?o deve ser menor que o andarM?nimo
	public String descer() {
		if (andarAtual>andarMinimo) {
			andarAtual-=1;
			return "Descendo para " + andarAtual;
		}
		return "N?o foi poss?vel";
	}
	
	
	//incrementa um na qtde de pessoas, n?o pode exceder a quantidade maxima de pessoas
	public void entrar() {
		if (qtdePessoas<maximoPessoas) {
			qtdePessoas+=1;
		}
	}
	
		
}
