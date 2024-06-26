
package prueba_biblioteca;

public class estante {
    
    private int codigo;
    private String titulo;
    private int anioPublicacion;
    
    public estante(int codigo, String titulo, int anioPublicacion){     
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        
    }

    @Override
    public String toString() {
        return "estante{" + "codigo=" + codigo + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion;
    }
    
    
    
}
