
package e206;

import java.util.Scanner;

public class numeroMayorMenor {
    
    public void imprimirMayorMenor() {
        Scanner sc = new Scanner(System.in);
        int contador = 1;
        int mayor;
        int menor;

        System.out.println("Ingrese cinco numeros:");
        System.out.print("Numero 1: ");
        int numero = sc.nextInt();

        mayor = numero;
        menor = numero;

        while (contador < 5) {
            System.out.print("Numero " + (contador + 1) + ": ");
            numero = sc.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }

            if (numero < menor) {
                menor = numero;
            }

            contador++;
        }

        System.out.println("El mayor numero es: " + mayor);
        System.out.println("El menor numero es: " + menor);
    }     
}
