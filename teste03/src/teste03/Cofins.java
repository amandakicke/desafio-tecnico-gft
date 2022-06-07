package teste03;

public class Cofins implements imposto {
	
	double valor;

	@Override
	public double calculaImposto() {
		
		if (valor > 1700) {
		return valor += this.calculaImposto() * (8/100);
		} else {
		return valor;
		}
}
}