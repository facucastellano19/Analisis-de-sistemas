package prueba_biblioteca;


public class libros extends estante {
    
    public boolean prestado;
    
    public libros (int codigo, String titulo, int anioPublicacion) {
        
        super(codigo, titulo, anioPublicacion);     
        this.prestado = false;
    }

    @Override
    
    
    public String toString() {
        return super.toString() + ", prestado=" + prestado + '}';
    }
    
    
    
}
