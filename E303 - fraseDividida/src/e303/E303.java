package e303;

import java.util.Scanner;


public class E303 {

    public static void main(String[] args) {
        
        
        //303 - Escribir un programa en java que lea una frase desde consola, luego debe procesar esa frase 
        //tipo String, y devolver la misma frase dividida en dos partes por su longitud.
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa una frase para ser dividida");
        String frase = sc.nextLine();
        
        int longitud = frase.length();
        int mitad = frase.length()/2;
        
        String primeraMitad = frase.substring(0, mitad);
        String segundaMitad = frase.substring(mitad);   
        
        System.out.println(primeraMitad);
        System.out.println(segundaMitad);
        
    }
    
}
