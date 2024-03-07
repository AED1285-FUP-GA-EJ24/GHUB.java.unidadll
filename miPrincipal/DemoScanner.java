package miPrincipal
/*
 * El proposito es mostrar la entrada de datos
 */
import java.util.Scanner;

import javax.xml.validation.SchemaFactoryConfigurationError;
public class DemoScanner {
    public static void main(String[] args) {
        //Crear el objeto Scanner
        Scanner teclado = new Scanner(System.in);
        //Obtener la primera entrada
        System.out.print("Cual es tu nombre");
        String nombre = teclado.nextLine();
        System.out.print("Cual es tu edad?");
        int edad = teclado.nextInt();
        System.out.print("Cuanto deseas ganar");
        double sueldo = teclado.nextDouble();
        System.out.print("Buenos dias" +nombre+
                           "me dices tu edad" +edad+                       
                             "y cuanto deseas ganar" +sueldo);   
                             teclado.close();
    }
}
