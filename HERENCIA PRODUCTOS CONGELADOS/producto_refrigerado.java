package e802;


public class producto_refrigerado extends producto {
   
    
    public String codigo_organismo;
    public String fecha_envasado;
    public int temperatura_mantenimiento;
    public String pais_origen;

    public producto_refrigerado(String codigo_organismo, String fecha_envasado, int temperatura_mantenimiento, String pais_origen, String fecha_caducidad, long numero_lote) {
        super(fecha_caducidad, numero_lote);
        this.codigo_organismo = codigo_organismo;
        this.fecha_envasado = fecha_envasado;
        this.temperatura_mantenimiento = temperatura_mantenimiento;
        this.pais_origen = pais_origen;
    }
    
    
    
}
