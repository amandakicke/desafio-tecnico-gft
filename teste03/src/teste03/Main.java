package teste03;

public class Main {

	public static void main(String[] args) {
		
		IPI ipi = new IPI();
		
		ipi.valor(5000);
		ipi.calculaImposto(500);
		
		Cofins cof = new Cofins();
		
		cof.calculaImposto();
	}

}
