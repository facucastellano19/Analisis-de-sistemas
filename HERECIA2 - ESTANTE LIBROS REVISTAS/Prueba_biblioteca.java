package prueba_biblioteca;


public class Prueba_biblioteca {


    public static void main(String[] args) {
        
       libros lb = new libros (120, "Facu libro", 2004);
       
       System.out.println("Libro: "  + lb.toString());
       
       revistas rv = new revistas (240, "Facu revista", 2005, 210);
  
       System.out.println("Revista: " + rv.toString());
       
       
        
    }
    
}
