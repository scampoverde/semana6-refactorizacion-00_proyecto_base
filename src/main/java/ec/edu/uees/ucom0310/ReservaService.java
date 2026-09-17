package ec.edu.uees.ucom0310;

import java.time.Duration;
import java.time.LocalDateTime;

public class ReservaService {

    // Código deliberadamente anidado para la primera refactorización.
    public boolean puedeCancelar(Reserva r, LocalDateTime ahora) {
        if (r != null) {
            if (r.getEstudianteEmail() != null) {
                if (r.getDocenteEmail() != null) {
                    if (!r.isCancelada()) {
                        LocalDateTime inicio =
                                LocalDateTime.parse(r.getInicio());

                        long horas =
                                Duration.between(ahora, inicio).toHours();

                        if (horas >= 2) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
