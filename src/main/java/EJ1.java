public class EJ1 {
    private final double factorConversion;

    public EJ1(double factorConversion) {
        this.factorConversion = factorConversion;
    }

    public double calcularTiempoPlaneta(double tiempoTierra) {
        return tiempoTierra * factorConversion;
    }

    public void mayoresValoresRepresentables() {
        System.out.println("Mayor valor representable para int: " + Integer.MAX_VALUE);
        System.out.println("Mayor valor representable para float: " + Float.MAX_VALUE);
        // Puedes agregar más tipos de datos y sus valores máximos aquí
    }

    public static void main(String[] args) {
        EJ1 cronometro = new EJ1(0.5); // Ejemplo de factor de conversión
        double tiempoTierra = 3600; // 1 hora en la Tierra

        // Calcular y mostrar tiempo en el nuevo planeta
        double tiempoPlaneta = cronometro.calcularTiempoPlaneta(tiempoTierra);
        System.out.println("Tiempo en el nuevo planeta: " + tiempoPlaneta + " unidades");

        // Mostrar los mayores valores representables
        cronometro.mayoresValoresRepresentables();
    }
}
