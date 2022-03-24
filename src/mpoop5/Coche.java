/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 * Clase Coche
 * @author barillas
 */
public class Coche {
    
    private String marca;
    private String color;
    private int placa;
    private int numPuertas;
    private int modeloAnio;
    private String chofer;
    private String copiloto;
    private String pasajero1;
    private String pasajero2;
/**
 * Constructor vacio
 */
    public Coche(){
    }
/**
 * Constructor de caracteristicas del coche
 * @param marca Marca del coche
 * @param color Color del coche
 * @param placa Placa del coche
 * @param numPuertas Numero de puertas del coche
 * @param modeloAnio Modelo del coche
 */
    public Coche(String marca, String color, int placa, int numPuertas, 
            int modeloAnio) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.numPuertas = numPuertas;
        this.modeloAnio = modeloAnio;
    }
/**
 * Contructor de posicion de personas de un coche
 * @param chofer Nombre del chofer
 * @param copiloto Nombre del copiloto
 * @param pasajero1 Nombre del primer pasajero
 * @param pasajero2 Nombre del segindo pasajero
 */
    public Coche(String chofer, String copiloto, String pasajero1, 
            String pasajero2) {
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }

    public String getChofer() {
        return chofer;
    }

    public void setChofer(String chofer) {
        this.chofer = chofer;
    }

    public String getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(String copiloto) {
        this.copiloto = copiloto;
    }

    public String getPasajero1() {
        return pasajero1;
    }

    public void setPasajero1(String pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public String getPasajero2() {
        return pasajero2;
    }

    public void setPasajero2(String pasajero2) {
        this.pasajero2 = pasajero2;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNimPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getModeloAnio() {
        return modeloAnio;
    }

    public void setModeloAnio(int modeloAnio) {
        this.modeloAnio = modeloAnio;
    }
/**
 * Metodo para encender el coche
 */
    public void encender(){
        System.out.println("Estoy encendido");
    }
/**
 * Metodo para apagar el coche
 */
    public void apagar(){
        System.out.println("Me voy a apagar");
    }
/**
 * Metodo para frenar el coche
 */    
    public void frenar(){
        System.out.println("Frenando");
    }
/**
 * Metodo para tocar el claxon del coche
 */
    public void tocarClaxon(){
        System.out.println("Quitate del camino");
    }
/**
 * Metodo para acelerar el coche
 * @param velocidad Velocidad del coche
 */
    public void acelerar(int velocidad){
        System.out.println("Voy a acelerar de " + velocidad);
    }

    @Override
    public String toString() {
        return "{chofer=" + chofer + ", copiloto=" + copiloto
                + ", pasajero1=" + pasajero1 + ", pasajero2=" + pasajero2 + '}';
    }

}
