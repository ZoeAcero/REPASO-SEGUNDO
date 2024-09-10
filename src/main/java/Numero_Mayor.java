import java.util.Scanner;

public class Numero_Mayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Introduce un número mayor que cero (0 para salir):");
            numero = scanner.nextInt();

            if (numero > 0) {
                int numDigitos = String.valueOf(numero).length();
                System.out.println("El número tiene " + numDigitos + " dígitos.");
            }
        } while (numero != 0);

        System.out.println("Has introducido el valor 0. El programa ha finalizado su ejecución.");
    }

}
