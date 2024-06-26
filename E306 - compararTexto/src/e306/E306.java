package e306;

import java.util.Scanner;

public class E306 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        texto tx = new texto(); 

        System.out.println("Ingrese el primer campo de texto: ");
        String texto1 = sc.nextLine();

        System.out.println("Ingrese el segundo campo de texto: ");
        String texto2 = sc.nextLine();

        boolean incluido = tx.compararTexto(texto1, texto2);

        if (incluido) {
            System.out.println("El segundo campo esta incluido dentro del primero");
        } else {
            System.out.println("El segundo campo no esta incluido dentro del primero");
        }

    }
}
