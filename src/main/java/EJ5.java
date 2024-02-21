import java.util.Random;

public class EJ5 {

    public static int[][] representarTerreno(int filas, int columnas) {
        int[][] terreno = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                terreno[i][j] = random.nextInt(10); // Generar valores aleatorios entre 0 y 9
            }
        }

        return terreno;
    }

    public static int[][] planificarConstrucciones(int filas, int columnas) {
        int[][] construcciones = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                construcciones[i][j] = random.nextInt(5); // Generar valores aleatorios entre 0 y 4
            }
        }

        return construcciones;
    }

    public static int[][] multiplicarMatrices(int[][] a, int[][] b) {
        int m = a.length, n = a[0].length, p = b[0].length;
        int[][] resultado = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    resultado[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return resultado;
    }

    public static void visualizarMatriz(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;

        int[][] terreno = representarTerreno(filas, columnas);
        int[][] construcciones = planificarConstrucciones(filas, columnas);

        System.out.println("Terreno:");
        visualizarMatriz(terreno);

        System.out.println("\nConstrucciones:");
        visualizarMatriz(construcciones);

        int[][] resultado = multiplicarMatrices(terreno, construcciones);

        System.out.println("\nResultado de la Multiplicación (Optimización de Rutas y Recursos):");
        visualizarMatriz(resultado);
    }
}
