package demo_herencia2;

/**
 *
 * @author eperez50
 */
public class barco extends bote {
    
    private int ancla;

    /**
     * Construye un barco
     *
     * @param color color del barco
     * @param numSerie número de serie del barco
     */
    public barco(String color, int numSerie) {
        super(color, numSerie);
        this.setAncla(1);
    }

    public int getAncla() {
        return ancla;
    }

    public void setAncla(int ancla) {
        this.ancla = ancla;
    }
    
    @Override
    public String avanzar() {
        String mensaje="";
        
        if (this.getAncla() == 1) {
            mensaje = "Anclado. no puede avanzar";
        }
        else if (this.getAncla() == 0) {
            mensaje = "En movimiento";
        }
        return mensaje;
    }
    
}