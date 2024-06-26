package e204;


public class E204 {


    public static void main(String[] args) {
        suma500 S500 = new suma500();
        // E204 - Hacer un algoritmo que calcule la suma de los primeros 500 números naturales. 
        //Imprimir el resultado de la suma. Codificar dos soluciones, una usando un ciclo for, y otra usando un ciclo while.
        
        // Usando ciclo for
        int sumaFor = S500.sumaConFor(500);
        System.out.println("El resultado usando ciclo for es: " + sumaFor);

        // Usando ciclo while
        int sumaWhile = S500.sumaConWhile(500);
        System.out.println("El resultado usando ciclo while es: " + sumaWhile);        
    }
    
}
