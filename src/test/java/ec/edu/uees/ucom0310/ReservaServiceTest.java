package ec.edu.uees.ucom0310;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class ReservaServiceTest {

    private Reserva reserva(LocalDateTime inicio) {
        return new Reserva(
                "R-001",
                "estudiante@uees.edu.ec",
                "docente@uees.edu.ec",
               new PeriodoReserva(inicio, inicio.plusHours(1))
        );
    }

    @Test
    void reservaConSuficienteAnticipacionPuedeCancelarse() {
        // Arrange
        LocalDateTime ahora =
                LocalDateTime.of(2026, 9, 20, 8, 0);

        Reserva r = reserva(
                LocalDateTime.of(2026, 9, 20, 12, 0));

        ReservaService service = new ReservaService();

        // Act
        boolean resultado = service.puedeCancelar(r, ahora);

        // Assert
        assertTrue(resultado);
    }
    
    @Test
    void reservaConMenosDeDosHorasNoPuedeCancelarse() {
    	
    	//arrange
    	  // Arrange

        LocalDateTime ahora =
                LocalDateTime.of(2026, 9,20,10, 30);

        Reserva r =
                reserva(
                        LocalDateTime.of( 2026,  9, 20,12, 0));


        // Act

        boolean resultado =
                new ReservaService()
                        .puedeCancelar(
                                r,
                                ahora);


        // Assert

        assertFalse(resultado);
    	
    }
    
    @Test
    void reservaCanceladaNoPuedeCancelarse() {

        // Arrange

        LocalDateTime ahora =
                LocalDateTime.of(   2026,   9,  20,  8,  0);

        Reserva r =
                reserva(
                        LocalDateTime.of( 2026,
                                9,    20,   12,     0));

        r.cancelar();

        // Act

        boolean resultado =
                new ReservaService()
                        .puedeCancelar(
                                r,
                                ahora);


        // Assert

        assertFalse(resultado);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


}
