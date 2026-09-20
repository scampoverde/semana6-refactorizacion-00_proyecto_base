package ec.edu.uees.ucom0310;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.Duration;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class PeriodoReservaTest {
	
	 @Test
	    void periodoValidoPuedeCrearse() {
		// Arrange
	        LocalDateTime inicio =
	                LocalDateTime.of(2026, 9, 20, 10, 0);

	        LocalDateTime fin =
	                LocalDateTime.of(2026, 9, 20, 11, 0);
	        
	        
	    //act
	       PeriodoReserva periodo = new PeriodoReserva(inicio, fin); 
	        
	        
	   //assert
	       assertEquals(inicio, periodo.inicio()); 
	       assertEquals(fin, periodo.fin());
	       assertEquals(
	    		   Duration.ofHours(1),periodo.duracion());
	       
	       
	       
	 }
	 
	 @Test
	    void periodoConFinAnteriorLanzaExcepcion() {
	        LocalDateTime inicio =
	                LocalDateTime.of(2026, 9, 20, 11, 0);

	        LocalDateTime fin =
	                LocalDateTime.of(2026, 9, 20, 10, 0);

	        assertThrows(
	                IllegalArgumentException.class,
	                () -> new PeriodoReserva(inicio, fin)
	        );
	    }

	 
	 @Test
	    void periodoConMismaHoraLanzaExcepcion() {
	        LocalDateTime instante =
	                LocalDateTime.of(2026, 9, 20, 10, 0);

	        assertThrows(
	                IllegalArgumentException.class,
	                () -> new PeriodoReserva(
	                        instante, instante)
	        );
	    }
}
