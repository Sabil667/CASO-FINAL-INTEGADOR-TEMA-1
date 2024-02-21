import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EJ5Test {

    @Test
    public void testRepresentarTerreno() {
        int filas = 3;
        int columnas = 3;
        int[][] terreno = EJ5.representarTerreno(filas, columnas);

        // Verificar que el terreno tiene el tamaño correcto
        assertEquals(filas, terreno.length);
        assertEquals(columnas, terreno[0].length);
    }

    @Test
    public void testPlanificarConstrucciones() {
        int filas = 3;
        int columnas = 3;
        int[][] construcciones = EJ5.planificarConstrucciones(filas, columnas);

        // Verificar que las construcciones tienen el tamaño correcto
        assertEquals(filas, construcciones.length);
        assertEquals(columnas, construcciones[0].length);
    }

    @Test
    public void testMultiplicarMatrices() {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{2, 0, 1}, {1, 2, 3}, {0, 1, 2}};

        int[][] resultado = EJ5.multiplicarMatrices(a, b);

    }
}