//Reto1.S4
//Reto 01: Registro y comparación de facturas

/*Objetivo
Modelar facturas emitidas para un sistema contable, reforzando el uso de constructores, equals(), hashCode() y toString().
 */

//Es recomendable organizar los códigos dentro de paquetes o package
/*ya que un paquete es una agrupación de clases, interfaces y supaquetes relacionados que ayudan a organizar
el código y evitar conflictos de nombres.*/
//La primera línea en un archivo Java debe indicar a que paquete pertenece la clase
package Solucion_Reto_01;

//Se crea una clase publica llamada Main
public class Main {
    //Método pricipal (método main) desde donde se ejecuta el programa
    //El método main (public static void main) es el punto de entrada de todo programa Java
    public static void main(String[] args) {

        // Creamos dos facturas con el mismo folio
        Factura f1 = new Factura("FAC001", "Juan Pérez", 1450.00);   //se crea un obj. tipo Factura llamado f1
        Factura f2 = new Factura("FAC001", "Comercial XYZ", 1450.00); //se crea un obj. tipo Factura llamado f2

        // Mostramos ambas facturas con toString()
        System.out.println(f1);
        System.out.println(f2);

        // Comparamos si son iguales usando equals()
        System.out.println("¿Las facturas son iguales?: " + f1.equals(f2));
    }
}
