package hospitales;

public enum Hospital {
MEXICO("Hospital de Mexico"), NICOYA("Hospital de Nicoya");
	
	private String nombre;
	
	private Hospital(String nombre) {
		this.nombre = nombre;
	}
	
	public Enum<?> getNombreHospital() {
		return Hospital.valueOf(null, nombre);
	}

}
