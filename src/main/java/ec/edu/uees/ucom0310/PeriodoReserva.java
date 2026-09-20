package ec.edu.uees.ucom0310;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public record PeriodoReserva(
		LocalDateTime inicio,
		LocalDateTime fin ) 
{

	public PeriodoReserva{
		
		Objects.requireNonNull(inicio, "inicio no puede ser null");
		Objects.requireNonNull(fin, "fin no puede ser null");
		
		if (!fin.isAfter(inicio)) {
			throw new IllegalArgumentException(
					"fin debe ser posterior a inicio");
			
		}
		
	}
	
	public Duration duracion() {
		return Duration.between(inicio, fin);
	}
	
	public long horasHastaInicio(LocalDateTime ahora) {
		return Duration.between(ahora, inicio).toHours();
	}
	
}
