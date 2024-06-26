
package e305;

import java.util.Scanner;


public class E305 {


    public static void main(String[] args) {
        
        
        // 305- Escribir un programa en java que lea una frase desde consola, y determinar cuantas palabras se 
        //encuentran en la cadena.  Cada palabra se separa por medio de un espacio en blanco.
        
        frase fs = new frase();
        Scanner scanner = new Scanner(System.in);
          
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();

        int cantidadPalabras = fs.contadorPalabras(frase);
        System.out.println("La frase tiene " + cantidadPalabras + " palabras");
    }


    
}
