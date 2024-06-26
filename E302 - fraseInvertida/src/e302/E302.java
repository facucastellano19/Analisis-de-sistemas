package e302;

import java.util.Scanner;


public class E302 {


    public static void main(String[] args) {
        
        // 302- Escribir un programa en java que lea una frase desde consola, luego debe procesar esa frase tipo 
        // String, y devolver la misma frase invertida.
        
            Scanner sc = new Scanner (System.in);
            frase fs = new frase();
            
            System.out.println("Ingrese una frase para ser invertida");
            String frase = sc.nextLine();   
            
            String fraseInvertida = fs.invertirFrase(frase);      
            System.out.println(fraseInvertida);
        }
    }        
    
    

