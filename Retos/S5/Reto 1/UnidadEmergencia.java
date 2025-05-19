//1. Crea una clase abstracta UnidadEmergencia

//La primera línea en un archivo Java debe indicar a que paquete pertenece la clase
package Solucion_Reto_01;

//Se crea una clase abstracta 
/*
-una clase abstracta es una clase que no puede ser instanciada directamente, es 
decir, no se pueden crear objetos de ella
-Sirve como plantilla para otras clases que la heredan, obligándolas a implementar 
sus métodos abstractos (aquellos sin implementación)
-Las clases abstractas son útiles para definir una funcionalidad común a un grupo
de subclases, dejando que estas definan la implementación de ciertos 
comportamientos específicos.
*/
public abstract class UnidadEmergencia {
    String nombre;

    public UnidadEmergencia(String nombre) {
        this.nombre = nombre;
    }

    public void activarUnidad() {
        System.out.println("🚨 Activando unidad: " + nombre);
    }

    public abstract void responder();
}
