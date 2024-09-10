import java.util.Scanner;

public class Obtener_Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;

        do {
            System.out.println("Introduce un número (0 para calcular la media):");
            numero = scanner.nextInt();

            if (numero != 0) {
                suma += numero;
                contador++;
            }
        } while (numero != 0);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números introducidos es: " + media);
        } else {
            System.out.println("No se introdujo ningún número.");
        }
    }
}
