//Reto1.S2

/*Objetivo
Desarrollar un programa que calcule el total de una compra en farmacia y aplique un descuento
si supera cierta cantidad. Este reto refuerza el uso de operadores aritméticos, asignación,
entrada por consola, e inferencia de tipo con var.
*/

//Es recomendable organizar los códigos dentro de paquetes o package
/*ya que un paquete es una agrupación de clases, interfaces y supaquetes relacionados que ayudan a organizar
el código y evitar conflictos de nombres.*/
//La primera línea en un archivo Java debe indicar a que paquete pertenece la clase
package Solucion_Reto_01;

import java.util.Scanner; //Scanner es para solicitar los datos desde la consola

//Se crea una clase publica (public-permite que el método o clase sea accesible desde cualquier lugar)
//llamada SimuladorFarmacia
public class SimuladorFarmacia {
    //Método pricipal desde donde se ejecuta el programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Nombre del medicamento: "); //Muestra un mensaje en la consola
        String medicamento = scanner.nextLine();

        System.out.print("Precio unitario: "); //Muestra un mensaje en la consola
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad de piezas: "); //Muestra un mensaje en la consola
        int cantidad = scanner.nextInt();

        // Cálculo del total
        double totalSinDescuento = precioUnitario * cantidad;

        // Evaluar si aplica descuento usando operador ternario
        var aplicaDescuento = totalSinDescuento > 500; // Al menos una implementacion de var (es una palabra clave
                                                       // que se utiliza para declara una variable cuyo tipo se infiere
                                                       // automáticamente segun el valor asignado
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;

        // Total a pagar
        double totalConDescuento = totalSinDescuento - descuento;

        // Mostrar resumen
        System.out.println("\nResumen de compra:");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);

        scanner.close();
    }
}