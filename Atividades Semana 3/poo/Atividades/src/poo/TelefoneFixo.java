package poo;

public class TelefoneFixo extends Telefone{
	
	public TelefoneFixo() {
		super("Fixo");
	}
	
	@Override
	public void toca(int numToques) {
		
		for(int i=0; i<numToques;i++) {
			System.out.println("\nTrimmmmmmm...");
		}		
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nDicando..."+numero);
	}
}
