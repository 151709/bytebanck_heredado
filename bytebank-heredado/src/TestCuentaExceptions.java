
public class TestCuentaExceptions {

	public static void main(String[] args) throws SaldoInsuficienteExeption {
		Cuenta cuenta = new CuentaAhorros(123, 456);
		cuenta.depositar(200);
		cuenta.retirar(210);
	}
	
}
