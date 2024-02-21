import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class EJ5Test {

    @Test
    public void testMultiplicarMatrices() {
        int[][] terreno = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] construccion = {{2, 0, 1}, {1, 2, 3}, {0, 1, 2}};
        int[][] resultadoEsperado = {{4, 8, 10}, {13, 20, 28}, {22, 32, 46}};

        int[][] resultado = EJ5.multiplicarMatrices(terreno, construccion);

        // Verificar si las matrices son iguales
        try {
            assertArrayEquals(resultadoEsperado, resultado, "Las matrices no son iguales");
        } catch (AssertionError e) {
            // Imprimir los valores específicos en caso de error
            System.out.println("Valor en [0][1] de la matriz esperada: " + resultadoEsperado[0][1]);
            System.out.println("Valor en [0][1] de la matriz obtenida: " + resultado[0][1]);
            throw e; // Lanzar la excepción nuevamente para indicar la falla en el test
        }
    }
}