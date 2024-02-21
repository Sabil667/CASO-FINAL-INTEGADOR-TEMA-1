public class EJ5 {

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
        int[][] construccion = {{2, 0, 1}, {1, 2, 3}, {0, 1, 2}};

        int[][] resultado = multiplicarMatrices(terreno, construccion);

        System.out.println("Matriz de Terreno:");
        visualizarMatriz(terreno);

        System.out.println("\nMatriz de Construcción:");
        visualizarMatriz(construccion);

        System.out.println("\nResultado de la Multiplicación (Planificación de Construcciones):");
        visualizarMatriz(resultado);
    }
}
