/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 * Clase Persona
 * @author barillas
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;
/**
 * Contructor vacio
 */
    public Persona() {
    }
/**
 * Constructor para dar nombre y fecha de cumpleaños valor por valor
 * @param nombre Nombre de la persona
 * @param apellido Apellido de la persona 
 * @param dia Dia de nacimiento de la persona
 * @param mes Mes de nacimineto de la persona
 * @param anio Anio de nacimiento de la persona
 */
    public Persona(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = new Fecha(dia, mes, anio);
    }
/**
 * Constructor para mostrar nombre y fecha de cumpleaños completo
 * @param nombre Nombre de la persona
 * @param apellido Apellido de la persona
 * @param fNacimiento Fecha de nacimiento de la persona
 */
    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override //Sobreescritura del metodo toString
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", "
                + "fNacimiento=" + fNacimiento + '}';
    }
    
}
