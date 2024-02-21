import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EJ2 {
    private final List<Double> recursos;

    public EJ2() {
        recursos = new ArrayList<>();
    }

    public void agregarRecurso(double recurso) {
        recursos.add(recurso);
    }

    public double calcularPromedio() {
        return recursos.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    public double calcularMinimo() {
        return recursos.isEmpty() ? 0 : Collections.min(recursos);
    }

    public double calcularMaximo() {
        return recursos.isEmpty() ? 0 : Collections.max(recursos);
    }

    public static void main(String[] args) {
        EJ2 ej2 = new EJ2();

        // Ejemplo de uso
        ej2.agregarRecurso(10);
        ej2.agregarRecurso(15);
        ej2.agregarRecurso(20);

        System.out.println("Promedio: " + ej2.calcularPromedio());
        System.out.println("Mínimo: " + ej2.calcularMinimo());
        System.out.println("Máximo: " + ej2.calcularMaximo());
    }
}
