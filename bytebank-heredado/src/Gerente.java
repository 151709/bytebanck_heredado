
public class Gerente extends Funcionario implements Autenticar {
	
	@Override
	public double getBonificacion() {
		System.out.println("EJECUTANDO DESDE GERENTE");
		return 20000;
	}

	@Override
	public boolean iniciarSecion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}
	
}
