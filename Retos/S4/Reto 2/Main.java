//Reto2.S4
//Reto 02: Comparación de declaraciones de impuestos

/*Objetivo
Modelar una declaración de impuestos con record y validarla contra una cuenta fiscal usando encapsulación y comparación segura con Objects.equals().
 */

//La primera línea en un archivo Java debe indicar a que paquete pertenece la clase
package Solucion_Reto_02;

//Se crea una clase publica llamada Main
public class Main {
    //Método pricipal (método main) desde donde se ejecuta el programa
    //El método main (public static void main) es el punto de entrada de todo programa Java
    public static void main(String[] args) {

        // Creamos una declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("XAXX010101000", 8700.0);

        // Creamos una cuenta fiscal (es un objeto)
        CuentaFiscal cuenta = new CuentaFiscal("XAXX010101000", 9500.0);

        // Mostramos la información
        System.out.println("📄 Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                           " por $" + declaracion.montoDeclarado());
        cuenta.mostrarCuenta();

        // Validamos si el RFC de la declaración es válido
        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("✅ ¿RFC válido para esta cuenta?: " + rfcValido);
    }
}
