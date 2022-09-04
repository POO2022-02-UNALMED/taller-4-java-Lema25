package classroom;

public class Persona {

    static int cedula = 3;
    String nombre;
    static int totalPersonas = 0;
    
    
    Persona(int cedula, String nombre) {
        Persona.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, int cedula) {
    	Persona.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(int cedula) {
    	Persona.cedula = cedula;
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
