package ec.edu.uees.ucom0310;

public record Email(String valor) {

    public Email {

        if (valor == null ||
            !valor.contains("@")) {

            throw new IllegalArgumentException(
                    "Correo inválido");
        }
    }
}