package datos;

public class UsuarioBD {

	private String usuario;
	private String pass;
	private String nombre;
	private String apellido;
	private String  ciudad;
	
	public UsuarioBD(String usuario, String pass, String nombre, String apellido, String ciudad) {
		
		this.usuario = usuario;
		this.pass = pass;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciudad = ciudad;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
}
