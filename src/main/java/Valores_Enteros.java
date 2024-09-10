import java.util.Scanner;

public class Valores_Enteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer valor entero:");
        int valor1 = scanner.nextInt();

        System.out.println("Introduce el segundo valor entero:");
        int valor2 = scanner.nextInt();

        int suma = valor1 + valor2;
        int resta = valor1 - valor2;
        int producto = valor1 * valor2;
        double division = (double) valor1 / valor2;

        System.out.println("La suma de los valores es: " + suma);
        System.out.println("La resta de los valores es: " + resta);
        System.out.println("El producto de los valores es: " + producto);
        System.out.println("La división de los valores es: " + division);
    }
}
