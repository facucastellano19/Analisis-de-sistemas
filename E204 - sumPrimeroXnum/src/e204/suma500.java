
package e204;


public class suma500 {
    
        public int sumaConFor(int limite) {
        int suma = 0;
        for (int i = 1; i <= limite; i++) {
            suma += i;
        }
        return suma;
    }

    public int sumaConWhile(int limite) {
        int suma = 0;
        int contador = 1;
        while (contador <= limite) {
            suma += contador;
            contador++;
        }
        return suma;
    }
}
