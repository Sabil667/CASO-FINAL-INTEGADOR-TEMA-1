import java.util.Scanner;

public class EJ6 {

    public static int contarVocales(String mensaje) {
        int contador = 0;
        String mensajeEnMinusculas = mensaje.toLowerCase();

        for (char letra : mensajeEnMinusculas.toCharArray()) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }

        return contador;
    }

    public static String invertirMensaje(String mensaje) {
        StringBuilder mensajeInvertido = new StringBuilder(mensaje);
        return mensajeInvertido.reverse().toString();
    }

    public static boolean verificarPalindromo(String mensaje) {
        String mensajeSinEspacios = mensaje.replaceAll("\\s", "").toLowerCase();
        String mensajeInvertido = invertirMensaje(mensajeSinEspacios);
        return mensajeSinEspacios.equals(mensajeInvertido);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un mensaje: ");
        String mensajeUsuario = scanner.nextLine();

        // Contar vocales
        int cantidadVocales = contarVocales(mensajeUsuario);
        System.out.println("Cantidad de vocales: " + cantidadVocales);

        // Invertir mensaje
        String mensajeInvertido = invertirMensaje(mensajeUsuario);
        System.out.println("Mensaje invertido: " + mensajeInvertido);

        // Verificar palíndromo
        boolean esPalindromo = verificarPalindromo(mensajeUsuario);
        System.out.println("Es palíndromo: " + esPalindromo);

        scanner.close();
    }
}
