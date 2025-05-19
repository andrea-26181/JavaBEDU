//1. Crea la clase Factura 

//La primera línea en un archivo Java debe indicar a que paquete pertenece la clase
package Solucion_Reto_02;

//Optional hace referencia a una variable que puede tener un valor asignado o que puede contener un valor null.
//Se uso de Optional para evitar errores con valores nulos
import java.util.Optional;

public class Factura {
    // Atributos privados para encapsular los datos
    private double monto;
    private String descripcion;
    private Optional<String> rfc; // Manejo seguro del valor nulo

    // Constructor: convierte el RFC en Optional, puede ser null
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    // Método público que devuelve un resumen de la factura
    public String getResumen() {
        String resumen = "📄 Factura generada:\n";
        resumen += "Descripción: " + descripcion + "\n";
        resumen += "Monto: $" + monto + "\n";

        // Si el RFC está presente, se muestra. Si no, se muestra mensaje alternativo.
        resumen += "RFC: " + rfc.orElse("[No proporcionado]") + "\n";

        return resumen;
    }
}
