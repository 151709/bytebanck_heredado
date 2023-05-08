
public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void retirar(double valor) {
		double comision = valor + 0.2;
		try {
			super.retirar(comision);
		} catch (SaldoInsuficienteExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}
	

}
