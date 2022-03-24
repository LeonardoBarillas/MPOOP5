/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop5;

/**
 * Clase Circulo
 * @author barillas
 */
public class Circulo {
    public final float PI = 3.1416f;
    private float radio;
/**
 * Constructor vacio
 */
    public Circulo(){
    }
/**
 * Constructor de un circulo
 * @param radio Radio del circulo
 */
    public Circulo(float radio){
        this.radio = radio;
    }
/**
 * Metodo para calcular el perimetro de un circulo
 */
    public void perimetro(){
        float perimetro = 2 * PI * radio;
        System.out.println("Perimetro = " + perimetro);
    }
/**
 * Metodo para calcular el area de un circulo
 */
    public void area(){
        System.out.println("Area = " + (PI * radio * radio));
    }
    
    public float getRadio(){
        return radio;
    }
    
    public void setRadio(float radio){
        this.radio =  Math.abs(radio);
        
    }
    
    public String toString(){
        return "Circulo{radio=" + radio + "}";
    }
}
