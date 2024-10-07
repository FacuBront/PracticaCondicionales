import java.util.Scanner;

public class CalculadoraDescuentos {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario el precio del producto
        System.out.print("Introduce el precio del producto: ");
        double precio = sc.nextDouble();

        // Limpiar el buffer después de leer el número
        sc.nextLine();

        // Pedir al usuario la categoría del cliente
        System.out.print("Introduce la categoría del cliente (estudiante, adulto, jubilado): ");
        String categoria = sc.nextLine().toLowerCase(); // Convertir a minúsculas para facilitar la comparación

        // Definir la variable para el descuento
        double descuento = 0;

        // Estructura condicional para aplicar el descuento según la categoría
        if (categoria.equals("estudiante")) {
            descuento = 0.10; // 10% de descuento para estudiantes
        } else if (categoria.equals("adulto")) {
            descuento = 0.05; // 5% de descuento para adultos
        } else if (categoria.equals("jubilado")) {
            descuento = 0.15; // 15% de descuento para jubilados
        } else {
            System.out.println("Categoría no válida. No se aplicará ningún descuento.");
        }

        // Calcular el precio final después del descuento
        double precioFinal = precio - (precio * descuento);

        // Imprimir el precio final
        System.out.printf("El precio final después del descuento es: %.2f\n", precioFinal);
    }
}
