package e302;

public class frase {
    
    
    
    public String invertirFrase(String frase){     
        StringBuilder sb = new StringBuilder(frase);
        String fraseInvertida = sb.reverse().toString();         
        return fraseInvertida;
    }
}