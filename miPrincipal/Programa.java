package miPrincipal;
//Declaraciones import
import otrosProgramas.*; //Esta sentencia importa todas las clases del paquete a otrosProgramas
public class Programa {
    
    public static void main(String[] args) {
        obtenerDatos();
        alfabetizar();       
        verpalabras();                               
    }
    public static void obtenerDatos(){
        System.out.println("Estoy en la función obtener datos");
    }
    public static void alfabetizar(){
        System.out.println("Estoy en la función alfabetizar");
}
    public static void verpalabras(){
    System.out.println("Estoy en la función ver palabras");
}
}