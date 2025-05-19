//Reto1.S1

/*Objetivo
Desarrollar un programa en Java que registre los datos de un paciente, aplicando
los fundamentos de clases, objetos, atributos, métodos y la entrada de datos
por consola.
*/

//Es recomendable organizar los códigos dentro de paquetes o package
/*ya que un paquete es una agrupación de clases, interfaces y supaquetes relacionados que ayudan a organizar
el código y evitar conflictos de nombres.*/
//La primera línea en un archivo Java debe indicar a que paquete pertenece la clase
package Solucion_Reto_01;


import java.util.Scanner; //Scanner es para solicitar los datos desde la consola

//Crea una clase llamada Paciente
public class Paciente {
    String nombre;
    int edad;
    String numeroExpediente;

    // Método público para mostrar los datos del paciente (imprime los datos)
    void mostrarInformacion() {
        System.out.println("\n Información del paciente:");
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numeroExpediente);
    }
}