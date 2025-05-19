//Reto1.S3

/*Objetivo
Diseñar un sistema básico de reservas de vuelo aplicando los fundamentos de la Programación
Orientada a Objetos en Java. Practicarás la creación de clases y objetos, el uso de atributos static
y final, así como la definición de métodos con parámetros y valores de retorno.
*/

/*Instrucciones
Tu nuevo desafío es simular un sistema donde un pasajero puede reservar un asiento en un vuelo, 
consultar su itinerario y cancelar la reserva si así lo desea.
 */

//Es recomendable organizar los códigos dentro de paquetes o package
/*ya que un paquete es una agrupación de clases, interfaces y supaquetes relacionados que ayudan a organizar
el código y evitar conflictos de nombres.*/
//La primera línea en un archivo Java debe indicar a que paquete pertenece la clase
package Solucion_Reto_01;

//Se crea una clase publica (public-permite que el método o clase sea accesible desde cualquier lugar)
//llamada Principal
public class Principal {
    //Método pricipal (método main) desde donde se ejecuta el programa
    //El método main (public static void main) es el punto de entrada de todo programa Java
    public static void main(String[] args) {
        // Crear un pasajero (aquí pasajero es un objeto)
        Pasajero pasajero = new Pasajero("Ana Martínez", "P123456");
        
        // Crear un vuelo (aquí vuelo es un objeto)
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        // Reservar asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("✅ Reserva realizada con éxito.\n"); //Muestra un mensaje en la consola
        } else {
            System.out.println("❌ No se pudo realizar la reserva.\n"); //Muestra un mensaje en la consola
        }

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario()); 

        // Cancelar reserva
        System.out.println("❌ Cancelando reserva...\n"); //Muestra un mensaje en la consola
        vuelo.cancelarReserva();

        // Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario()); 

        // Realizamos una nueva reservacion
        vuelo.reservarAsiento("Mario Gonzalez", "P987654"); //Muestra un mensaje en la consola
        System.out.println(vuelo.obtenerItinerario());
    }
}