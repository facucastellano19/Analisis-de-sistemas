package e802;

    // Extiende a la clase padre
public class producto_congelado extends producto {
    
    // Atributos
    public String fecha_envasado;
    public String pais_origen;
    public int temperatura_mantenimiento;

    
    //Crear constructor usando SOURCE
    //Junta los atributos de la clase padre (producto) + clase hija (producto_congelado)
    public producto_congelado(String fecha_envasado, String pais_origen, int temperatura_mantenimiento, String fecha_caducidad, long numero_lote) {
        super(fecha_caducidad, numero_lote);
        this.fecha_envasado = fecha_envasado;
        this.pais_origen = pais_origen;
        this.temperatura_mantenimiento = temperatura_mantenimiento;
    }
    

    
    
    
}
