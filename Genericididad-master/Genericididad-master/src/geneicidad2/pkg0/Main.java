/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geneicidad2.pkg0;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
 
public class Main {
    public static void main(String[] args) {
         Persona persona = new Persona("Camilo ", 22, "Famisanar", LocalDate.of(2002, 5, 25));
        
//        System.out.println(persona);

        Map<String, Persona> personas = new LinkedHashMap<>();
        personas.put("Persona 1", persona);
        personas.put("Persona 2", new Persona("Nelly", 57, "Famisanar", LocalDate.of(1957, 9, 16)));

        for (Map.Entry<String, Persona> entry : personas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

