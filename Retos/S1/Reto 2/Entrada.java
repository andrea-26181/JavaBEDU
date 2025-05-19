//Reto2.S1

/*Objetivo
Desarrollar un programa en Java que permita registrar la información básica de entradas para eventos, aplicando
los fundamentos de clases, objetos, atributos, métodos y el uso de constructores.
*/

//Es recomendable organizar los códigos dentro de paquetes o package
/*ya que un paquete es una agrupación de clases, interfaces y supaquetes relacionados que ayudan a organizar
el código y evitar conflictos de nombres.*/
//La primera línea en un archivo Java debe indicar a que paquete pertenece la clase
package Solucion_Reto_02;

//Se crea una clase llamada Entrada
public class Entrada {
    //se declaran los atributos
    String evento;
    double precio;

    // Se crea un constructor
    //este recibe ambos valores al momento de crear el objeto
    public Entrada(String evento, double precio) {
        this.evento = evento;
        this.precio = precio;
    }

    // Método (público) para mostrar los datos de la entrada
    public void mostrarInformacion() {
        System.out.println("Evento: " + evento + " | Precio: $" + precio);
    }
}
