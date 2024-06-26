
package e305;

public class frase {
 
    public static int contadorPalabras(String frase) {
        int contadorPalabras = 0;

        String[] palabras = frase.split(" ");

        contadorPalabras = palabras.length;

        return contadorPalabras;           
        
    }
}
