import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario su peso en kilogramos
        System.out.print("Introduce tu peso en kilogramos: ");
        double peso = sc.nextDouble();

        // Pedir al usuario su altura en metros
        System.out.print("Introduce tu altura en metros: ");
        double altura = sc.nextDouble();

        // Calcular el Índice de Masa Corporal (IMC)
        double imc = peso / (altura * altura);

        // Imprimir el valor del IMC
        System.out.printf("Tu IMC es: %.2f\n", imc);

        // Dar una recomendación basada en el valor del IMC
        if (imc < 18.5) {
            System.out.println("Tienes bajo peso. Debes consumir comida rica en grasas, proteinas e hidratos de carbono");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Tienes un peso normal. Debes acompañarlo con comida saludable");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Tienes sobrepeso. Debes hacer mas actividad fisica");
        } else {
            System.out.println("Tienes obesidad. Debes consumir comida saludable y realizar mas ejercicio");
        }
    }
}
