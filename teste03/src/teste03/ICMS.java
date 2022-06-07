package teste03;

public class ICMS implements imposto {
	
	double valor;

	@Override
	public double calculaImposto() {
		return valor += this.calculaImposto() * (30/100);
	}

	
}
