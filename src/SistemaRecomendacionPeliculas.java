import java.util.Scanner;

public class SistemaRecomendacionPeliculas {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario su género de película favorito
        System.out.println("¿Cuál es tu género de película favorito? (acción, comedia, drama, ciencia ficción): ");
        String genero = sc.nextLine().toLowerCase(); // Convertir a minúsculas para facilitar la comparación

        // Estructura condicional para recomendar una película según el género elegido
        if (genero.equals("acción")) {
            System.out.println("Te recomiendo ver 'Mad Max: Fury Road'.");
        } else if (genero.equals("comedia")) {
            System.out.println("Te recomiendo ver 'Superbad'.");
        } else if (genero.equals("drama")) {
            System.out.println("Te recomiendo ver 'El Padrino'.");
        } else if (genero.equals("ciencia ficción")) {
            System.out.println("Te recomiendo ver 'Inception'.");
        } else {
            System.out.println("Lo siento, no tengo recomendaciones para ese género.");
        }
    }
}
