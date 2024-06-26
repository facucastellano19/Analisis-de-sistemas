
package e304;

import java.util.Scanner;


public class E304 {


    public static void main(String[] args) {
        
        //304 - Escribir un programa en java que lea una frase desde consola, luego debe procesar esa frase tipo String, 
        // escribir un método que devuelva cuantas vocales tiene , y escribir un segundo método que devuelva cuantas no vocales tiene 
        
        frase fs = new frase();
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();
        
        int cantidadVocales = fs.contarVocales(frase);
        int cantidadNoVocales = fs.contarNoVocales(frase);
        
        System.out.println("La cantidad de vocales son: " + cantidadVocales);
        System.out.println("La cantidad de no vocales son: " + cantidadNoVocales);
        
        
    }
    
}
