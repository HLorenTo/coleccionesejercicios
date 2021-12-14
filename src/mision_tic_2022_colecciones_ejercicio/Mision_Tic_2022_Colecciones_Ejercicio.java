package mision_tic_2022_colecciones_ejercicio;
import java.util.ArrayList;
public class Mision_Tic_2022_Colecciones_Ejercicio {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>(); 
        personas.add(new Persona("Pedro", 50, 70.3, 1.60));
        personas.add(new Persona("Marta", 35, 80.3, 1.70));
        personas.add(new Persona("Julian", 70, 40.3, 1.50));
        int edad =0;
        double indice = 0;
        String nombre = null;
        String Indice = null;
        for(Persona i : personas){
           if(i.getEdad()>edad) {
               edad = i.getEdad();
               indice = (i.imc());
               nombre = i.getNombre();
               edad = i.getEdad();
           }
           System.out.println("i: "+i.getEdad());
           System.out.print("El nombre es: "+ i.getNombre()+ " el peso es de: " +i.getPeso());
           System.out.println("La edad es de: "+i.getEdad()+ " y la altura es de: "+i.getAltura()); 
        }
        if (indice <= 18.5){
            Indice = "Delgado";
        }else if (indice >18.5 && indice <= 24.9){
            Indice= "Aceptable";
        }else if (indice >25 && indice <= 29.9){
            Indice= "Sobrepeso";
        }else if (indice >30 && indice <= 34.9){
            Indice = "Obesidad";
        }else {
            Indice = "Obesidad avanzada";
        }
        System.out.println("La persona con nombre: "+ nombre + "y una edad de: "+ edad +" tiene un IMC "+ indice + " con descripcion " + Indice );
    }
}
    

