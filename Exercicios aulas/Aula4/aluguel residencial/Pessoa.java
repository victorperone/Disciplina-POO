/*Uma pessoa pode possuir até quatro unidades. Uma
pessoa possui um nome, idade, CPF e salário mensal*/

public class Pessoa{
	private String nome, cpf;
	private int idade, quantidade;
	private double salario;
	Residencia[] minhasResidencias;
	minhasResidencias = new Residencia[4];
	
	Pessoa(){
		System.out.println("Cadastro criado.");
		nome = "Indefinido";
		cpf = "000.000.000-00";
		idade = 18;
		quantidade = 0;
		salario = 976.0;
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
	}
	
	Pessoa(String nome, String cpf){
		System.out.println("Cadastro criado.");
		this.nome = nome;
		this.cpf = cpf;
		idade = 18;
		quantidade = 0;
		salario = 976.0;
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public void setImoveis(int quantidade){
		this.quantidade = quantidade;
		for (int i = 0; i < quantidade; i++){
			minhasResidencias[i] = new Residencia("Jose");
		}
		
		/*
		Residencia[] minhasResidencias;
		minhasResidencias = new Residencia[quantidade];
		for (int i = 0; i < quantidade; i++){
			minhasResidencias[i] = new Residencia(this.nome);
		}
		*/
	
	}
	public void mostraDados(){
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Idade: " + this.idade);
		System.out.println("Quantidade de imoveis: " + this.quantidade);
		System.out.println("Salario: " + this.salario);
	}
}