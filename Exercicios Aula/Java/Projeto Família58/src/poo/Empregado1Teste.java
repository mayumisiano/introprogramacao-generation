package poo;

public class Empregado1Teste {

	public static void main(String[] args) {
		
		Empregado1 emp = new Empregado1("Juliana Cruz","Rua da Marola, 99", "12345678901",
				984848480, 20, 122, 5000,30);
		
		emp.imprimirInfo();
		emp.calcularSalario();

	}

}
