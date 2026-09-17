package ec.edu.uees.ucom0310;

public class Reserva {
    private final String id;
    private final String estudianteEmail;
    private final String docenteEmail;
    private final String inicio;
    private final String fin;
    private EstadoReserva estado = EstadoReserva.PENDIENTE;

    public Reserva(String id, String estudianteEmail, String docenteEmail,
                   String inicio, String fin) {
        this.id = id;
        this.estudianteEmail = estudianteEmail;
        this.docenteEmail = docenteEmail;
        this.inicio = inicio;
        this.fin = fin;
    }

    public String getId() { return id; }
    public String getEstudianteEmail() { return estudianteEmail; }
    public String getDocenteEmail() { return docenteEmail; }
    public String getInicio() { return inicio; }
    public String getFin() { return fin; }
    public EstadoReserva getEstado() { return estado; }

    public boolean isCancelada() {
        return estado == EstadoReserva.CANCELADA;
    }

    public void cancelar() {
        estado = EstadoReserva.CANCELADA;
    }
}
