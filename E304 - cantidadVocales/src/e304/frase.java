
package e304;


public class frase {
    
    public static int contarVocales(String frase) {
        
        String fraseMinuscula = frase.toLowerCase();
        
        int contador = 0;
        
        for (int i = 0; i < fraseMinuscula.length(); i++) {
            char c = fraseMinuscula.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
                contador++;
            }
        }
        return contador;
    }    
    
    public static int contarNoVocales (String frase){
        
        String fraseMinuscula = frase.toLowerCase();
        int contador = 0;
        for (int i = 0; i < fraseMinuscula.length(); i++) {
            char c = fraseMinuscula.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' ) {
                contador++;
          }  
          
        }     
        return contador;
    }
    
}
