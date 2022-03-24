/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop5;

/**
 * Clase principal
 * @author barillas
 */
public class MPOOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo cir1 = new Circulo();
        //cir1.radio = 5;
        cir1.setRadio(5);
        System.out.println(cir1.getRadio());
        cir1.area();
        cir1.perimetro();
        System.out.println(cir1.toString());
        System.out.println(cir1);
        System.out.println("\n##################\n");
        Circulo cir2 = new Circulo();
        cir2.setRadio(-15);
        System.out.println(cir2);
        
        
        System.out.println("\n##################\n");
        Coche coche = new Coche("Audi", "blanco", 703489, 2, 2021);
        System.out.println(coche);
        
        
        System.out.println("\n##################\n");
        Persona per1 = new Persona();
        per1.setNombre("Panchito");
        per1.setApellido("Lopez");
        //per1.setfNacimiento(fNacimiento);
        System.out.println(per1);
        Fecha fecha = new Fecha(8, 12, 2001);
        per1.setfNacimiento(fecha);
        System.out.println(per1);
         
        System.out.println("\n##################\n");
        Persona per2 = new Persona();
        per2.setNombre("Juanito");
        per2.setApellido("Aguilar");
        per2.setfNacimiento(new Fecha(15, 6, 2002));
        System.out.println(per2);
        
        System.out.println("\n##################\n");
        Persona per3 = new Persona("Alan", "Martinez", new Fecha(16, 2, 2002));
        System.out.println(per3);
        
        System.out.println("\n##################\n");
        Persona per4 = new Persona("Sofia", "Vazquez", 12,9,1999);
        System.out.println(per4);
        
        System.out.println("\n##################\n");
        Coche coche2 = new Coche("Leonardo", "Ariadne", "Juan", "Mariel");
        System.out.println(coche2);
    }
}
