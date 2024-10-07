import java.util.Scanner;

public class EvaluadorHabitosSaludables {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario cuántas horas duerme al día
        System.out.print("¿Cuántas horas al día duermes?: ");
        int horasDormidas = sc.nextInt();

        // Pedir al usuario cuántas horas de ejercicio hace al día
        System.out.print("¿Cuántas horas al día haces ejercicio?: ");
        int horasEjercicio = sc.nextInt();

        // Pedir al usuario cuántas comidas saludables consume al día
        System.out.print("¿Cuántas comidas saludables consumes al día?: ");
        int comidasSaludables = sc.nextInt();

        // Evaluar los hábitos de sueño
        if (horasDormidas >= 7 && horasDormidas <= 9) {
            System.out.println("Tienes buenos hábitos de sueño.");
        } else if (horasDormidas < 7) {
            System.out.println("No duermes lo suficiente.");
        } else {
            System.out.println("Estás durmiendo demasiado.");
        }

        // Evaluar los hábitos de ejercicio
        if (horasEjercicio >= 1 && horasEjercicio <= 2) {
            System.out.println("Haces una cantidad adecuada de ejercicio.");
        } else if (horasEjercicio < 1) {
            System.out.println("Deberías hacer más ejercicio.");
        } else {
            System.out.println("Podrías estar haciendo demasiado ejercicio.");
        }

        // Evaluar los hábitos alimenticios
        if (comidasSaludables >= 3) {
            System.out.println("Tienes buenos hábitos alimenticios.");
        } else {
            System.out.println("Deberías consumir más comidas saludables.");
        }
    }
}
