/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personaejemplo;

/**
 *
 * @author soryl
 */
public class PersonaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Persona persona = new Persona("Brenda", "Garcia", 20);
        
        Estudiante est = new Estudiante("Brenda", "Garcia", 20, 456);
        
        est.altaEstudiante(est);
        
        System.out.println("Hello World!");
    }
    
}
