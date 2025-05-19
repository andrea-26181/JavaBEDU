//2. Crear la clase Pasajero

//La primera línea en un archivo Java debe indicar a que paquete pertenece la clase
package Solucion_Reto_01;

//Se crea la clase pública llamada Pasajero
public class Pasajero {
    //Atributos (características que puede tener un objeto)
    String nombre;       // Visibilidad por defecto
    String pasaporte;

    //Métodos (comportamiento de los objetos)
    //Los métodos en JAVA son funciones dentrto de una clase que definen el comportamiento de los objetos
    public Pasajero(String nombre, String pasaporte) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }
}