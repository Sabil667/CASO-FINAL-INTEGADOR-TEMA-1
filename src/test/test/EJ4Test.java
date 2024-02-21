import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EJ4Test {

    @Test
    public void testAsignarTarea() {
        EJ4 planificador = new EJ4();

        // Asignar tareas diarias
        planificador.asignarTarea("Miembro1", 3);
        planificador.asignarTarea("Miembro2", 5);
        planificador.asignarTarea("Miembro3", 4);

        // Verificar la asignación de tareas
        assertEquals(3, planificador.obtenerTarea("Miembro1"));
        assertEquals(5, planificador.obtenerTarea("Miembro2"));
        assertEquals(4, planificador.obtenerTarea("Miembro3"));
    }

    @Test
    public void testCalcularCargaTrabajoOptima() {
        EJ4 planificador = new EJ4();

        // Asignar tareas diarias
        planificador.asignarTarea("Miembro1", 3);
        planificador.asignarTarea("Miembro2", 5);
        planificador.asignarTarea("Miembro3", 4);

        // Calcular carga de trabajo óptima y verificar
        int cargaOptima = planificador.calcularCargaTrabajoOptima();
        assertEquals(12, cargaOptima);
    }

    // Otros tests según sea necesario...
}
