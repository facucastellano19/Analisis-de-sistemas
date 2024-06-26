
package e205;

import java.util.Scanner;

public class nombreMeses {
    
    public int solicitarMes() {
        Scanner sc = new Scanner(System.in);
        int numMes;
        do {
            System.out.println("Ingrese un numero de mes (1 al 12) o '0' para salir: ");
            numMes = sc.nextInt();
            if (numMes < 0 || numMes > 12) {
                System.out.println("Error: El numero de mes debe estar entre 1 y 12.");
            }
        } while (numMes < 0 || numMes > 12);
        return numMes;
    }        
     
    
    public void imprimirNombreMes(int numMes) {
        switch (numMes) {
            case 1:
                System.out.println("El mes es: Enero");
                break;
            case 2:
                System.out.println("El mes es: Febrero");
                break;
            case 3:
                System.out.println("El mes es: Marzo");
                break;
            case 4:
                System.out.println("El mes es: Abril");
                break;
            case 5:
                System.out.println("El mes es: Mayo");
                break;
            case 6:
                System.out.println("El mes es: Junio");
                break;
            case 7:
                System.out.println("El mes es: Julio");
                break;
            case 8:
                System.out.println("El mes es: Agosto");
                break;
            case 9:
                System.out.println("El mes es: Septiembre");
                break;
            case 10:
                System.out.println("El mes es: Octubre");
                break;
            case 11:
                System.out.println("El mes es: Noviembre");
                break;
            case 12:
                System.out.println("El mes es: Diciembre");
                break;
        }
    }

    
}
