import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Crear un objeto Random para generar una opción al azar para la computadora
        Random random = new Random();

        // Pedir al usuario que elija entre piedra, papel o tijera
        System.out.print("Elige piedra, papel o tijera: ");
        String eleccionUsuario = sc.nextLine().toLowerCase();

        // Generar una opción aleatoria para la computadora
        int eleccionComputadora = random.nextInt(3); // 0 para piedra, 1 para papel, 2 para tijera
        String eleccionComp = "";

        if (eleccionComputadora == 0) {
            eleccionComp = "piedra";
        } else if (eleccionComputadora == 1) {
            eleccionComp = "papel";
        } else if (eleccionComputadora == 2) {
            eleccionComp = "tijera";
        }

        // Imprimir la elección de la computadora
        System.out.println("La computadora eligió: " + eleccionComp);

        // Determinar el ganador con estructuras if-else
        if (eleccionUsuario.equals(eleccionComp)) {
            System.out.println("¡Es un empate!");
        } else if (eleccionUsuario.equals("piedra") && eleccionComp.equals("tijera") ||
                eleccionUsuario.equals("papel") && eleccionComp.equals("piedra") ||
                eleccionUsuario.equals("tijera") && eleccionComp.equals("papel")) {
            System.out.println("¡Ganaste!");
        } else if (eleccionComp.equals("piedra") && eleccionUsuario.equals("tijera") ||
                eleccionComp.equals("papel") && eleccionUsuario.equals("piedra") ||
                eleccionComp.equals("tijera") && eleccionUsuario.equals("papel")) {
            System.out.println("La computadora gana.");
        } else {
            System.out.println("Opción no válida. Por favor, elige entre piedra, papel o tijera.");
        }
    }
}

