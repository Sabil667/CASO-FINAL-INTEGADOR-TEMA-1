import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import static org.junit.jupiter.api.Assertions.*;

public class EJ6Test {

    @Test
    public void testContarVocales() {
        String input = "Hello World";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(3, EJ6.contarVocales(EJ6.solicitarMensaje()), "Conteo de vocales incorrecto");

        System.setIn(System.in);  // Restaurar la entrada estándar
    }

    @Test
    public void testInvertirMensaje() {
        String input = "Hello World";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("dlroW olleH", EJ6.invertirMensaje(EJ6.solicitarMensaje()), "Mensaje invertido incorrecto");

        System.setIn(System.in);  // Restaurar la entrada estándar
    }

    @Test
    public void testVerificarPalindromo() {
        String input = "A man a plan a canal Panama";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertTrue(EJ6.verificarPalindromo(EJ6.solicitarMensaje()), "Fallo en la verificación de palíndromo");

        System.setIn(System.in);  // Restaurar la entrada estándar
    }
}
