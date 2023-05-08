
public class SistemaInterno {
	
	private String clave = "AluraCursosOnline";
	
	public boolean autentica(Autenticar gerente) {
		boolean puedeIniciarSecion = gerente.iniciarSecion(clave); 
		if(puedeIniciarSecion) {
			System.out.println("Login exitoso");
			return true;
		}else {
			System.out.println("Error de login");
			return false;
		}
		
	}

}
