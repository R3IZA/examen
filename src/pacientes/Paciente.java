package pacientes;

public final class Paciente {
	private final String nombre;
	private final int edad;
	private final int temperatura;
	private final boolean vomito;
	
	public Paciente(String nom, int eda, int temp, boolean vom) {
		this.nombre = nom;
		this.edad= eda;
		this.temperatura=temp;
		this.vomito = vom;
		
	}
	public String getNombre() { return nombre; }
	public int getEdad() { return edad; }
	public int getTemperatura() { return temperatura; }
	public boolean getVomito() { return vomito; }
	 
}
