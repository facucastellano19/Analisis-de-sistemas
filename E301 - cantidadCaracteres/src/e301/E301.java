
package e301;

import java.util.Scanner;


public class E301 {


    public static void main(String[] args) {
        
        //301 - Escribir un programa en java que lea una frase desde consola, luego debe procesar esa frase tipo String, 
        //y devolver e imprimir en pantalla cuantos caracteres tiene la frase
    
        frase fs = new frase ();        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese una frase para contar sus caracteres");
        String frase = sc.nextLine();
        int cantidad_caracteres = fs.contarCaracteres(frase);
        
        System.out.println("La cantidad de caracteres de la frase: " + cantidad_caracteres);
        
        
        
        
    }
    
}
