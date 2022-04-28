package oms;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import pacientes.Paciente;
import tiposPruebaCovid.PruebaPCR;
import tiposPruebaCovid.PruebaRapida;
//ABSTRACCION EN ESTA CLASE
public abstract class Oms {
	public Oms(List<Paciente> listaPacientes) {
		listaPacientes= new ArrayList<>();
	}
	protected abstract boolean isGamHospital();
	
	@SuppressWarnings("unused")
	private void diagnosticar() {
		String cond;  
		cond = JOptionPane.showInputDialog("Se encuentra en la GAM? (YES/NO)");
		if(cond =="YES" && cond =="yes") {
			//aplica prueba pcr
			
		}
		if(cond =="NO" && cond =="no") {
			//aplica prueba rapida
		}
	
	}
	
	public void imprimirReporte(List<Paciente> listaPacientes) {
		System.out.print(listaPacientes);
	}
}


