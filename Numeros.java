import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[10];

        // Guardar los 10 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
        }

        // Buscar el mayor
        double max = numeros[0];

        for (double numero : numeros) {
            if (numero > max) {
                max = numero;
            }
        }

        // Buscar el menor
        double min = numeros[0];

        for (double numero : numeros) {
            if (numero < min) {
                min = numero;
            }
        }

        System.out.println("El número mayor es: " + max);
        System.out.println("El número menor es: " + min);

        }
}

