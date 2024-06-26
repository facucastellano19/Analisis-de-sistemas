
package e203;


public class E203 {


    public static void main(String[] args) {
        
        sumaPositivos sumaP = new sumaPositivos();
        
        sumaP.solicitarNumeros();
        System.out.println("El resultado de la suma es: " + sumaP.suma());        
    }
    
}
