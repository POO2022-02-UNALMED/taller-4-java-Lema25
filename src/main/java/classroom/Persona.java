package classroom;

public class Persona {

    int cedula;
    String nombre;
    static int totalPersonas;
    
    public static void {
        totalPersonas = 0;
        this.cedula = 3;
    }

    Persona(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, int cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(int cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = "";
        totalPersonas++;
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
