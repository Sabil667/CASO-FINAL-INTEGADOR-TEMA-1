import java.util.ArrayList;

public class EJ3 {
    private double nivelRadiacion;
    private double temperatura;
    private double presion;

    public EJ3() {
        nivelRadiacion = 0.0;
        temperatura = 0.0;
        presion = 0.0;
    }

    public void actualizarFactores(double radiacion, double temp, double pres) {
        nivelRadiacion = radiacion;
        temperatura = temp;
        presion = pres;
        verificarValoresExtremos();
    }

    private void verificarValoresExtremos() {
        if (nivelRadiacion > 100.0 || temperatura > 50.0 || presion > 150.0) {
            alertarTripulacion();
        }
    }

    private void alertarTripulacion() {
        System.out.println("¡Alerta! Valores críticos detectados. Se recomiendan ajustes.");
    }

    public void listarEventosPrimos(int n) {
        ArrayList<Integer> eventosPrimos = new ArrayList<>();
        int candidato = 2;
        while (eventosPrimos.size() < n) {
            if (esPrimo(candidato)) eventosPrimos.add(candidato);
            candidato++;
        }
        System.out.println("Los primeros " + n + " eventos raros o críticos (números primos): " + eventosPrimos);
    }

    private boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public void descomponerEnFactoresPrimos(int numero) {
        // Implementar la lógica de descomposición
    }

    public static void main(String[] args) {
        EJ3 sistema = new EJ3();
        sistema.actualizarFactores(90.0, 55.0, 130.0);
        sistema.listarEventosPrimos(5);
    }
}
