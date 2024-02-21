import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EJ3Test {

    @Test
    public void testActualizarFactoresYListarEventosPrimos() {
        EJ3 sistema = new EJ3();

        // Actualizar factores
        sistema.actualizarFactores(90.0, 55.0, 130.0);

        // Listar los primeros 5 eventos raros o críticos (números primos)
        sistema.listarEventosPrimos(5);
    }
}
