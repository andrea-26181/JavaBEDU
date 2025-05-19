//La primera línea en un archivo Java debe indicar a que paquete pertenece la clase
package Solucion_Reto_01;

//Se crea una clase pública llamada Factura
//(public-permite que el método o clase sea accesible desde cualquier lugar)
// Clase que representa una factura para un sistema contable
public class Factura {

    // Atributos (características que puede tener un objeto) de la factura
    private String folio;
    private String cliente;
    private double total;

    // Constructor con parámetros para inicializar todos los campos
    //Un costructor es un tipo especial de método que se ejecuta automáticamente cuando se crea un objeto. Su
    //propósito es inicializar los valores de los atributos del objeto.
    public Factura(String folio, String cliente, double total) {
        //this se refiere al objeto actual
        //básicamente, es una referencia al objeto que está ejecutando el métrodo o constructor actual
        /*Se usa dentro de un método de instancia o un constructor para acceder a los miembros del
        objeto actual (variables de instancia, métodos y otros constructores)
         */
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // Método toString() para representar el objeto de forma legible
    //El Método toString() en Java es un método especial que pertenece a la clase Object
    /*
    Se utiliza para obtener una representación de un objeto en forma de cadena de texto, esto
    facilita la impresión o visualización de la inf. sobre el objeto
     */
    @Override
    public String toString() {
        return "🧾 Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }

    // Método equals() para comparar si dos facturas tienen el mismo folio
    //equals() compara el contenido de dos objetos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto en memoria
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura otra = (Factura) obj;
        return this.folio.equals(otra.folio); // Comparamos solo el folio
    }

    //El Método hashCode() consistente con equals(), basado en el folio
    //El métdo hashCode() en Java es una función que devuelve un valor entero que representa un objeto
    /* debe ser coherente con el método equals()
       si dos objetos son iguales según equals(), entonces deben tener el mismo código hash
     */
    @Override
    public int hashCode() {
        return folio.hashCode();
    }
}
