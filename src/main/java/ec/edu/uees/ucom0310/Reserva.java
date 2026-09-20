package ec.edu.uees.ucom0310;

import java.util.Objects;

public class Reserva {
    private final String id;
    private final String estudianteEmail;
    private final String docenteEmail;
   // private final String inicio;
   // private final String fin;
   private final PeriodoReserva periodo;
    
    private EstadoReserva estado = EstadoReserva.PENDIENTE;

    public Reserva(String id, String estudianteEmail, String docenteEmail,
                   PeriodoReserva periodo) {
        this.id = id;
        this.estudianteEmail = estudianteEmail;
        this.docenteEmail = docenteEmail;
        this.periodo= Objects.requireNonNull(periodo);
    }

    public String getId() { return id; }
    public String getEstudianteEmail() { return estudianteEmail; }
    public String getDocenteEmail() { return docenteEmail; }

    public PeriodoReserva getPeriodo() {
		return periodo;
	}

	public EstadoReserva getEstado() { return estado; }

    public boolean isCancelada() {
        return estado == EstadoReserva.CANCELADA;
    }

    public void cancelar() {
        estado = EstadoReserva.CANCELADA;
    }
}
