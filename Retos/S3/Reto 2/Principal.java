//Reto2.S3
//Reto 02: Factura con RFC opcional

/*Objetivo
Diseñar una clase Factura aplicando los principios de encapsulación con modificadores de acceso
y utilizando la clase Optional para manejar valores que pueden ser nulos, como el RFC del cliente.
 */

/*Instrucciones
Tu reto será modelar una factura sencilla, que contenga los datos básicos de una compra y, opcionalmente, el
RFC del cliente. Se deberá proteger el acceso a los atributos y permitir el uso seguro de null a través de Optional.
 */

//Es recomendable organizar los códigos dentro de paquetes o package
/*ya que un paquete es una agrupación de clases, interfaces y supaquetes relacionados que ayudan a organizar
el código y evitar conflictos de nombres.*/
//La primera línea en un archivo Java debe indicar a que paquete pertenece la clase
package Solucion_Reto_02;

//Se crea la clase pública llamda Principal
public class Principal {
    //Método pricipal desde donde se ejecuta el programa
    public static void main(String[] args) {
        // Factura con RFC (se crea un objeto de tipo Factura)
        Factura facturaConRFC = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");

        // Factura sin RFC (se pasa null)  -> se crea un objeto de tipo Factura
        Factura facturaSinRFC = new Factura(1800.0, "Reparación de equipo", null);

        // Mostrar ambas facturas
        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}