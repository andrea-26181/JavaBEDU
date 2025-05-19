//1. Crea un record llamado DeclaracionImpuestos

//Es recomendable organizar los códigos dentro de paquetes o package
/*ya que un paquete es una agrupación de clases, interfaces y supaquetes relacionados que ayudan a organizar
el código y evitar conflictos de nombres.*/
//La primera línea en un archivo Java debe indicar a que paquete pertenece la clase
package Solucion_Reto_02;

//Record que representa una declaración de impuestos
//este record tiene los campos String rfcContribuyente y double montoDeclarado
/* RECORD
   -para definir clases inmutables sin necesidad de escribir código repetitivo
   -es un tipo de clase que simplifica la creación de clases que principalmente sirven para almacenar datos
   -al ser inmutables, sus campos no pueden modificarse después de la creación
   -generan automáticamente métodos como equals(), hashCode() y tuString() basados en sus campos, reduciendo
    el código repetitivo
 */
public record DeclaracionImpuestos(String rfcContribuyente, double montoDeclarado) {
}
