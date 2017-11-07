/*Cada residência é de propriedade de uma pessoa. A
residência tem as informações de metragem do
terreno, posição da frente (Norte, Sul, Leste, Oeste) e
se é de esquina.
Cada unidade pode estar alugada para no máximo
uma pessoa. */

public class Residencia{
	private String dono, direcao, locatario;
	private double largura, comprimento, metragem;
	private boolean esquina;
	
	Residencia(){
		this.dono = "";
		this.direcao = "";
		this.locatario = "";
		this.largura = 0.0;
		this.comprimento = 0.0;
		this.metragem = 0.0;
		this.esquina = false;
		System.out.println("Imovel criado mas sem dono.");
	}
	
	Residencia(String nome){
		this.dono = nome;
		System.out.println("Imovel criado. \n Proprietario: " + this.dono);
	}
	
	public double setMetragem(double largura, double comprimento){
		this.largura = largura;
		this.comprimento = comprimento;
		this.metragem = largura * comprimento;
		return this.metragem;
	}
	public String setDirecao(String direcao){
		return this.direcao = direcao;
	}
	public String setDono(String dono){
		if (this.dono == ""){
			return this.dono = dono;
		}else{
			System.out.println("Imovel ja possui dono");
			return this.dono;
		}
	}
	public boolean setEsquina(boolean esquina){
		return this.esquina = esquina;
	}
	public String setLocatario(String locatario){
		if (this.locatario == ""){
		return this.locatario = locatario;
		}else {
			System.out.println("Imovel ja possui inquilino");
			return this.locatario;
		}
	}
	public void mostraResidencia(){
		System.out.println("Dono: " + this.dono);
		System.out.println("Locatario: " + this.locatario);
		System.out.println("Direcao: " + this.direcao);
		System.out.println("Largura: " + this.largura + "Comprimento: " + this.comprimento + "Metragem: " + this.metragem);
		System.out.println("Esquina: " + this.esquina);
	}
}