/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad9;

/**
 *
 * @author Sam
 */
public class Domici {

    private int id;
    private String nombre;
    private int fecha;
    private String nacion;
    private int upz;

    public Domici(int id, String nombre, int fecha, String nacion, int upz) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.nacion = nacion;
        this.upz = upz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getNacion() {
        return nacion;
    }

    public void setNacion(String nacion) {
        this.nacion = nacion;
    }

    public int getUpz() {
        return upz;
    }

    public void setUpz(int upz) {
        this.upz = upz;
    }

    @Override
    public String toString() {
        return "Domici{" + "id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", nacion=" + nacion + ", upz=" + upz + '}';
    }
    
}
