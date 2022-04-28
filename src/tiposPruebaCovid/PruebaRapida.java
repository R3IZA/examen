package tiposPruebaCovid;
import pacientes.Paciente;

public final class PruebaRapida implements PruebaCovid19 {
	
	private Paciente paciente;
	public PruebaRapida(Paciente paciente) {
		this.paciente = paciente; //composicion
	}
	@Override
	public boolean isPositiveCase() {
		if(paciente.getTemperatura()>= 37 && paciente.getEdad() >= 60) {
			return true;
		}
		return false;
	}

	@Override
	public String getNombrePaciente() {
		return null;
	}

}
