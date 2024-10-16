/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaejemplo;

import java.util.ArrayList;

/**
 *
 * @author soryl
 */
public class Estudiante extends Persona {
    
    private int matricula;
    
    public ArrayList<Persona> lista_persona = new ArrayList<Persona>();

    
    public Estudiante(String nombre, String apellidos, int edad,  int mat){
        super(nombre,apellidos,edad);
        this.matricula = mat;
    }
    
    public int getMatricula(){
        return this.matricula;
         
    }
    
   
     public void altaEstudiante(Persona persona){
        this.lista_persona.add(persona);
       System.out.println(persona);
    }
     
    public void mostrarLista(){
        
        for(Persona lista:  lista_persona){
            System.out.println();
        }
    }
    
}
