package e205;


public class E205 {

    public static void main(String[] args) {
        
        // E205 - Crear un algoritmo que pida al usuario ingresar un número de mes, y que imprima en letras el número de mes ingresado, 
        // si el valor no está entre 1 y 12, debe mostrar un mensaje de error, y volver a pedir un nuevo ingreso hasta que el ingreso sea válido, 
        // o se ingrese un cero. Usar la sentencia switch.  
        
        nombreMeses nm = new nombreMeses();
        
        int numMes;
        
        do {
            numMes = nm.solicitarMes();
            if (numMes != 0) {
                nm.imprimirNombreMes(numMes);
            }
        } while (numMes != 0);        
        
    }
    
}
