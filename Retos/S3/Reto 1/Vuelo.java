//1. Crea la clase Vuelo

//La primera línea en un archivo Java debe indicar a que paquete pertenece la clase
package Solucion_Reto_01;

//Se crea la clase pública llamada Vuelo
public class Vuelo {
    //Atributos (características que puede tener un objeto, datos)
    final String codigoVuelo;       // Constante
    String destino;
    String horaSalida;
    Pasajero asientoReservado;      // Se asignará una instancia o null

    //Métodos (comportamiento de los objetos)
    //Si un método es publico, puede ser llamado desde cualquier otra clase 
    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    // Método con parámetro y valor de retorno
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        } else {
            return false;
        }
    }

    // Metodo con sobrecarga permita reservar con una cadena simples
    public boolean reservarAsiento(String nombre, String pasaporte) {
        Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevoPasajero);
    }

    // Método sin retorno
    //La palabra clave void indica que el método no devuelve ningún valor
    public void cancelarReserva() {
        asientoReservado = null;
    }

    // Método que retorna un String
    public String obtenerItinerario() {
        String info = "✈️ Itinerario del vuelo:\n";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        if (asientoReservado != null) {
            info += "Pasajero: " + asientoReservado.nombre + "\n";
        } else {
            info += "Pasajero: [Sin reserva]\n";
        }
        return info;
    }
}