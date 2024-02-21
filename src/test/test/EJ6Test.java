import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EJ6Test {

    @Test
    public void testContarVocales() {
        assertEquals(10, EJ6.contarVocales("Hello World"));
    }

    @Test
    public void testInvertirMensaje() {
        assertEquals("dlroW olleH", EJ6.invertirMensaje("Hello World"));
    }

    @Test
    public void testVerificarPalindromo() {
        assertTrue(EJ6.verificarPalindromo("A man a plan a canal Panama"));
        assertFalse(EJ6.verificarPalindromo("Hello World"));
    }
}