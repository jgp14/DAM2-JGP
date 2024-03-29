package es.leliadoura.ad.eva1rec.data;

import java.io.Serializable;


/**
 *
 * @author marco
 */
public class Alumno implements Serializable{
    private String nombre;
    private String dni;

    public Alumno() {
    }

    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }


    
}
