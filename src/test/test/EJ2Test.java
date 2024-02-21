import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EJ2Test {

    private EJ2 ej2;

    @BeforeEach
    public void setUp() {
        ej2 = new EJ2();
        ej2.agregarRecurso(10);
        ej2.agregarRecurso(15);
        ej2.agregarRecurso(20);
    }

    @Test
    public void testAgregarRecurso() {
        List<Double> recursos = obtenerRecursos(ej2);
        assertEquals(3, recursos.size());
        assertEquals(10, recursos.get(0), 0.001);
        assertEquals(15, recursos.get(1), 0.001);
        assertEquals(20, recursos.get(2), 0.001);
    }

    @Test
    public void testCalcularPromedio() {
        assertEquals(15.0, ej2.calcularPromedio(), 0.001);
    }

    @Test
    public void testCalcularMinimo() {
        assertEquals(10.0, ej2.calcularMinimo(), 0.001);
    }

    @Test
    public void testCalcularMaximo() {
        assertEquals(20.0, ej2.calcularMaximo(), 0.001);
    }

    private List<Double> obtenerRecursos(EJ2 ej2) {
        try {
            Field field = EJ2.class.getDeclaredField("recursos");
            field.setAccessible(true);
            return (List<Double>) field.get(ej2);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
