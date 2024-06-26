package e802;

public class producto_fresco extends producto {
    
    
    public String fecha_envasado;
    public String pais_origen;

    public producto_fresco(String fecha_envasado, String pais_origen, String fecha_caducidad, long numero_lote) {
        super(fecha_caducidad, numero_lote);
        this.fecha_envasado = fecha_envasado;
        this.pais_origen = pais_origen;
    }

    @Override
    public String toString() {
        return super.toString() + "producto_fresco{" + "fecha_envasado=" + fecha_envasado + ", pais_origen=" + pais_origen + '}';
    }
    
    
    
}
