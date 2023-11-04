package bean;

public class Empleado {
	
	int id, idDomiciliado, idEstadoCivil, idNivelEducativo, idDepartamento, idProvincia, idDistrito;
	String dni, ruc, nombres, apellidoPaterno, apellidoMaterno, fechaNacimiento, direccion, correo, celular, passwordd;
	
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getPasswordd() {
		return passwordd;
	}
	public void setPasswordd(String password) {
		this.passwordd = password;
	}
	public int getIdDomiciliado() {
		return idDomiciliado;
	}
	public void setIdDomiciliado(int idDomiciliado) {
		this.idDomiciliado = idDomiciliado;
	}
	public int getIdEstadoCivil() {
		return idEstadoCivil;
	}
	public void setIdEstadoCivil(int idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}
	public int getIdNivelEducativo() {
		return idNivelEducativo;
	}
	public void setIdNivelEducativo(int idNivelEducativo) {
		this.idNivelEducativo = idNivelEducativo;
	}
	public int getIdDepartamento() {
		return idDepartamento;
	}
	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}
	public int getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}
	public int getIdDistrito() {
		return idDistrito;
	}
	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}
    
    public void setEmpleado(String[] aRegistro) {
    	if (aRegistro == null) return;
    	
    	id = Integer.parseInt(aRegistro[0]);
    	dni = aRegistro[1];
    	ruc = aRegistro[2];
    	nombres = aRegistro[3];
    	apellidoPaterno = aRegistro[4];
    	apellidoMaterno = aRegistro[5];
    	fechaNacimiento = aRegistro[6];
    	direccion = aRegistro[7];
    	correo = aRegistro[8];
    	celular = aRegistro[9];
    	passwordd = aRegistro[10];
    	idDomiciliado = Integer.parseInt(aRegistro[11]);
    	idEstadoCivil = Integer.parseInt(aRegistro[12]);
    	idNivelEducativo = Integer.parseInt(aRegistro[13]);
    	idDepartamento = Integer.parseInt(aRegistro[14]);
    	idProvincia = Integer.parseInt(aRegistro[15]);
    	idDistrito = Integer.parseInt(aRegistro[16]);
    	
    }
    
}
