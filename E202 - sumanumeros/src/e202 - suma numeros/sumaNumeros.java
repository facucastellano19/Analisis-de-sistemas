
package e202;

import java.util.Scanner;

public class sumaNumeros {
    
    private Scanner sc;

    public sumaNumeros() {
        this.sc = new Scanner(System.in);
    }
    
    public void sumaFor() {
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el dato " + i + " para ser sumado: ");
            int num = sc.nextInt();
            suma += num;
        }
        System.out.println("La suma de los numeros es: " + suma);
    }


    
}
