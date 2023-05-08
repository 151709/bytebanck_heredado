
public class Administrador extends Funcionario implements Autenticar {
	
	private AutenticacionUtil util;
	
	public Administrador() {
		this.util = new AutenticacionUtil();
	}

	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public boolean iniciarSecion(String clave) {
		return this.util.iniciarSecion(clave);
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
	}

}
