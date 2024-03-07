package miPrincipal;

public class DemoEntrada {

    public static void main(String[] args) {
    System.out.print(x);
    System.out.println("Esto es otra cadena");
    //Podemos imprimir caracteres especiales utilizando \ (alrevez)
    System.out.println("\n\n\nSalte tres veces");
    System.out.println("\nImprimi  un tabulador\n otra fila");
    System.out.println("\nHola\nAngel");
    System.out.println("Esto es un texto largo que quiero \n"
                       "y quiero ver como se vera imprimido\n"
                        "en la pantalla\n");

        double precio = 195.8928;
        int Cantidad = 1500;
        System.out.println("El precio unitario total = " +precio*Cantidad +"de los productos comprados");
        
        /*
        La sentencia printf se utiliza para escribir un numero con formato
        */                
        System.out.println("Ejemplo de printf: ");
        System.out.printf("%10.4f", precio*Cantidad);
        System.out.printf("%10.4f", precio*10);
        System.out.printf("%10.4f", precio*100);
        System.out.printf("%10.2f", precio*10);
    }
}