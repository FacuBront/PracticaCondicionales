import java.util.Scanner;

public class SistemaRecomendacionActividades {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese su estado de ánimo
        System.out.print("¿Cómo te sientes? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = sc.nextLine().toLowerCase();

        // Recomendar una actividad basada en el estado de ánimo
        if (estadoAnimo.equals("feliz")) {
            System.out.println("Recomendación: Sal a dar un paseo al aire libre o escucha tu música favorita.");
        } else if (estadoAnimo.equals("triste")) {
            System.out.println("Recomendación: Mira una película que te guste o habla con un amigo cercano.");
        } else if (estadoAnimo.equals("enérgico")) {
            System.out.println("Recomendación: Haz ejercicio, como correr o andar en bicicleta.");
        } else if (estadoAnimo.equals("relajado")) {
            System.out.println("Recomendación: Lee un buen libro o practica meditación.");
        } else {
            System.out.println("Estado de ánimo no reconocido. Por favor, ingresa feliz, triste, enérgico o relajado.");
        }
    }
}
