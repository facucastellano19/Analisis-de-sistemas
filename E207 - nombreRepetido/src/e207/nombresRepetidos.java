package e207;

import java.util.Scanner;

public class nombresRepetidos {

    public void ingresarNombres() {
        
        Scanner sc = new Scanner(System.in);
        String nombreAnterior = "";
        int contador = 0;

        while (contador < 5) {
            System.out.println("Ingrese un nombre:");
            String nombre = sc.nextLine();

            if (contador > 0 && nombre.equals(nombreAnterior)) {
                System.out.println("No se permite ingresar nombres repetidos de forma consecutiva.");
            } else {
                nombreAnterior = nombre;
                contador++;
            }
        }

        System.out.println("Se ingresaron 5 nombres correctamente.");
    }    
}
