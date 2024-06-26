package e802;


public class producto {
  
    public String fecha_caducidad;
    public long numero_lote;

    // Crear constructor usando SOURCE
    public producto(String fecha_caducidad, long numero_lote) {
        this.fecha_caducidad = fecha_caducidad;
        this.numero_lote = numero_lote;
    }
    
    
    // toString usando SOURCE  (ALT + INSERTAR)
    @Override
    public String toString() {
        return "producto{" + "fecha_caducidad=" + fecha_caducidad + ", numero_lote=" + numero_lote + '}';
    }
    


    
}
