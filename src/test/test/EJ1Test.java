import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EJ1Test {

    @Test
    public void testCalcularTiempoPlaneta() {
        EJ1 cronometro = new EJ1(0.5); // Factor de conversión arbitrario
        double tiempoTierra = 3600; // 1 hora en la Tierra
        double tiempoEsperadoPlaneta = 1800; // 1 hora en el nuevo planeta según el factor de conversión

        double tiempoPlaneta = cronometro.calcularTiempoPlaneta(tiempoTierra);

        assertEquals(tiempoEsperadoPlaneta, tiempoPlaneta, 0.001); // Asegurar precisión de 3 decimales
    }

}