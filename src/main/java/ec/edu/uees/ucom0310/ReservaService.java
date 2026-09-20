package ec.edu.uees.ucom0310;

import java.time.Duration;
import java.time.LocalDateTime;

public class ReservaService {

    // Código deliberadamente anidado para la primera refactorización.
    public boolean puedeCancelar(Reserva r, LocalDateTime ahora) {
		/*
		 1 * if (r != null) { if (r.getEstudianteEmail() != null) { if
		 * (r.getDocenteEmail() != null) { if (!r.isCancelada()) { LocalDateTime inicio
		 * = LocalDateTime.parse(r.getInicio());
		 * 
		 * long horas = Duration.between(ahora, inicio).toHours();
		 * 
		 * if (horas >= 2) { return true; } } } } }
		 */
    
    
    	if (r == null) return false;
    	if (r.getEstudianteEmail() == null) return false;
    	if (r.getDocenteEmail() == null) return false;
    	if (r.isCancelada()) return false;

    	return r.getPeriodo()
            	.horasHastaInicio(ahora) >= 2;
	}
	
	    //LocalDateTime inicio = LocalDateTime.parse(r.getInicio());
    	//long horas =
    		//	Duration.between(ahora, inicio).toHours();
    	
    	
    //return r.getPeriodo().horasHastaInicio(ahora) >=2;
    }

