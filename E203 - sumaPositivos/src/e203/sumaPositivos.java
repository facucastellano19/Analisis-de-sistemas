
package e203;

import java.util.Scanner;

public class sumaPositivos {
    
    private int suma;

    public void agregarNumero(int num) {
        if (num >= 0) {
            this.suma += num;
        }
    }

    public int suma() {
        return this.suma;
    }

    public void solicitarNumeros() {
        Scanner sc = new Scanner(System.in);
        int num;
        
        do {
            System.out.println("Ingrese un numero para ser sumado (negativo para terminar):");
            num = sc.nextInt();
            agregarNumero(num);
        } while (num >= 0);
    }
}
