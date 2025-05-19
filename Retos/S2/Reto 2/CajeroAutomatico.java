//Reto2.S2

/*Objetivo
Implementar un programa que simule un cajero automático básico, aplicando estructuras de control como while, 
switch, break y continue para navegar entre opciones y validar operaciones del usuario.
*/

//Es recomendable organizar los códigos dentro de paquetes o package
/*ya que un paquete es una agrupación de clases, interfaces y supaquetes relacionados que ayudan a organizar
el código y evitar conflictos de nombres.*/
//La primera línea en un archivo Java debe indicar a que paquete pertenece la clase
package Solucion_Reto_02;

// Importar la clase Scanner para leer entrada del usuario
import java.util.Scanner; //Scanner es para solicitar los datos desde la consola

//Se crea una clase publica (public-permite que el método o clase sea accesible desde cualquier lugar)
//llamada CajeroAutomatico
public class CajeroAutomatico {
    //Método pricipal desde donde se ejecuta el programa
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Crear objeto Scanner
        var saldo = 1000.0; // Saldo inicial (var porque dicha variable debe ser inferida por Java)
        int opcion; // Variable para almacenar la opción del menú

        // Repetir el menú mientras la opción no sea salir (4)
        do {
            // Mostrar menú de opciones
            System.out.println("\n💳 Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt(); // Leer la opción elegida por el usuario

            //estructura decontrol switch (la variable puede tener varias opciones)
            switch (opcion) {
                case 1 -> {
                    // Consultar saldo
                    System.out.println("🔎 Tu saldo actual es: $" + saldo); //Muestra un mensaje en la consola
                }
                case 2 -> {
                    // Depositar dinero
                    System.out.print("💰 Ingresa el monto a depositar: "); //Muestra un mensaje en la consola
                    double deposito = scanner.nextDouble(); // Leer la opción elegida por el usuario

                    if (deposito <= 0) {
                        System.out.println("⚠️ El monto debe ser mayor a 0."); //Muestra un mensaje en la consola
                        continue; // Volver al menú sin modificar el saldo
                    }

                    saldo += deposito; // Aumentar el saldo
                    System.out.println("✅ Depósito realizado. Saldo actualizado: $" + saldo); //Muestra un mensaje en la consola
                }
                case 3 -> {
                    // Retirar dinero
                    System.out.print("💸 Ingresa el monto a retirar: "); //Muestra un mensaje en la consola
                    double retiro = scanner.nextDouble(); // Leer la opción elegida por el usuario

                    if (retiro <= 0) {
                        System.out.println("⚠️ El monto debe ser mayor a 0."); //Muestra un mensaje en la consola
                        continue; // Volver al menú sin hacer nada
                    }

                    if (retiro > saldo) {
                        System.out.println("❌ Saldo insuficiente. Tu saldo es: $" + saldo); //Muestra un mensaje en la consola
                    } else {
                        saldo -= retiro; // Restar el monto del saldo
                        System.out.println("✅ Retiro exitoso. Saldo restante: $" + saldo); //Muestra un mensaje en la consola
                    }
                }
                case 4 -> {
                    // Salir del programa
                    System.out.println("👋 Gracias por usar el cajero. ¡Hasta pronto!"); //Muestra un mensaje en la consola
                }
                default -> {
                    // Opción no válida
                    System.out.println("🚫 Opción inválida. Intenta nuevamente."); //Muestra un mensaje en la consola
                }
            }

        } while (opcion != 4); // Salir cuando el usuario elija la opción 4

        scanner.close(); // Cerrar el Scanner
    }
}