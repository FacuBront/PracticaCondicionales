import javax.swing.*;
import java.util.Scanner;

public class RecomendacionLibros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Indique su género de libro favorito (fantasía, misterio, romance, ciencia ficción)");
        String genero = sc.nextLine().toLowerCase();

        if (genero.equals("fantasia")) {
            System.out.println("Te recomiendo leer '50 sombras de gray'.");
        } else  if (genero.equals("misterio")) {
            System.out.println("Te recomiendo leer 'Sherlock Holmes'.");
        } else  if (genero.equals("romance")) {
            System.out.println("Te recomiendo leer 'Yo antes de ti'.");
        } else  if (genero.equals("ciencia ficcion")) {
            System.out.println("Te recomiendo leer 'Avatar War'.");
        } else {
            System.out.println("Lo siento no tengo recomendaciones para ese genero");
        }
    }
}
