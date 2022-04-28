package tiposPruebaCovid;
import pacientes.Paciente;

public final class PruebaPCR implements PruebaCovid19  {
	private Paciente paciente;
	public PruebaPCR(Paciente paciente) {
		this.paciente = paciente; //composicion
	}

	@Override
	public boolean isPositiveCase() {
		
		if(paciente.getTemperatura()>= 39 && paciente.getVomito()== true) {
			return true;
		}
		return false;
	}
	@Override
	public String getNombrePaciente() {
		return null;
	}

}
