package poo;

public class Animal {

	private String nome;
	private int idade;	
	
	public Animal(String nome, int idade) {
		
		this.setNome(nome); //this.nome=nome;
		this.setIdade(idade); //this.setIdade=idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}	
	
	public void emitirSom(){
		
	}
	
	public void correr() {
		
	}
	
	public void subirArvore() {
		
	}
	
	public void imprimirInfo() {
		
	}
	
}
