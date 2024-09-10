import java.util.Scanner;

public class Nombre_Usuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Bienvenido al curso de M03B, " + nombre);
    }
}
