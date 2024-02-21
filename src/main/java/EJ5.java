
public class EJ5 {

    public static int[][] representarTerreno(int[][] terreno) {
        // Aquí puedes implementar la lógica para representar el terreno
        return terreno;
    }

    public static int[][] planificarConstrucciones(int[][] construcciones) {
        // Aquí puedes implementar la lógica para planificar las construcciones
        return construcciones;
    }

    public static int[][] multiplicarMatrices(int[][] a, int[][] b) {
        int m = a.length, n = a[0].length, p = b[0].length;
        int[][] result = new int[m][p];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < p; j++)
                for (int k = 0; k < n; k++)
                    result[i][j] += a[i][k] * b[k][j];
        return result;
    }

    public static void visualizarMatriz(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row)
                System.out.print(value + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] terreno = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] construcciones = {{2, 0, 1}, {1, 2, 3}, {0, 1, 2}};

        int[][] terrenoRepresentado = representarTerreno(terreno);
        int[][] construccionesPlanificadas = planificarConstrucciones(construcciones);
        int[][] resultado = multiplicarMatrices(terrenoRepresentado, construccionesPlanificadas);

        System.out.println("Terreno Representado:");
        visualizarMatriz(terrenoRepresentado);

        System.out.println("\nConstrucciones Planificadas:");
        visualizarMatriz(construccionesPlanificadas);

        System.out.println("\nResultado de la Multiplicación (Planificación de Construcciones):");
        visualizarMatriz(resultado);
    }
}


