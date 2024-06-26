package prueba_biblioteca;

public class revistas extends estante {
    
    public int numero;
    
    public revistas (int codigo, String titulo, int anioPublicacion, int numero) {
        
        super(codigo, titulo, anioPublicacion);
        this.numero = numero;  
        
        
    }   

    @Override
    public String toString() {
        return super.toString() + " numero=" + numero + '}';
    }
    
    
    
}
