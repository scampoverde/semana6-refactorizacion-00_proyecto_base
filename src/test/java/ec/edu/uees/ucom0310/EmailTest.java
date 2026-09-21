package ec.edu.uees.ucom0310;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void debeCrearEmailValido() {

        Email email =
                new Email("juan@uees.edu.ec");

        assertEquals(
                "juan@uees.edu.ec",
                email.valor());
    }

    @Test
    void debeLanzarErrorSiEmailEsInvalido() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Email("abc"));
    }
}