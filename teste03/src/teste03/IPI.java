package teste03;

public class IPI implements imposto{
	double valor;

	@Override
	public double calculaImposto() {
		if (valor <= 2500) {
			return valor += this.calculaImposto() * (5/100);
			} else {
			return valor += this.calculaImposto() * (10/100);
			}
	}
}
