
import java.util.HashMap;
import java.util.Map;

public class EJ4 {

    private Map<String, Integer> tareasDiarias;

    public EJ4() {
        tareasDiarias = new HashMap<>();
    }

    public void asignarTarea(String miembro, int tarea) {
        tareasDiarias.put(miembro, tarea);
    }

    public void mostrarTablaTareas() {
        System.out.println("Tabla de Tareas Diarias:");
        System.out.println("----------------------------");
        System.out.printf("%-15s%-15s%n", "Miembro", "Tarea Diaria");
        System.out.println("----------------------------");
        for (Map.Entry<String, Integer> entry : tareasDiarias.entrySet()) {
            System.out.printf("%-15s%-15s%n", entry.getKey(), entry.getValue());
        }
        System.out.println("----------------------------");
    }

    public int calcularCargaTrabajoOptima() {
        int cargaTotal = 0;
        for (int tareaDiaria : tareasDiarias.values()) {
            cargaTotal += tareaDiaria;
        }
        return cargaTotal;
    }

    public static void main(String[] args) {
        EJ4 planificador = new EJ4();

        // Asignar tareas diarias
        planificador.asignarTarea("Miembro1", 3);
        planificador.asignarTarea("Miembro2", 5);
        planificador.asignarTarea("Miembro3", 4);

        // Mostrar tabla de tareas
        planificador.mostrarTablaTareas();

        // Calcular carga de trabajo óptima
        int cargaOptima = planificador.calcularCargaTrabajoOptima();
        System.out.println("Carga de trabajo óptima: " + cargaOptima);
    }
    public int obtenerTarea(String miembro) {
        return tareasDiarias.get(miembro);
    }

}
