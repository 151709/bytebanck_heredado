
public class Cliente implements Autenticar {
	
	String nombre;
	String documento;
	String telefono;
	
	private AutenticacionUtil util;
	
	public Cliente() {
		this.util = new AutenticacionUtil();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public boolean iniciarSecion(String clave) {
		return this.util.iniciarSecion(clave);
	}
	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		this.setClave(clave);
		
	}
	
	

}
