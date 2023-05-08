
public class AutenticacionUtil {
	
	private String clave;
	
	public boolean iniciarSecion(String clave) {
		return this.clave == clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}

}
