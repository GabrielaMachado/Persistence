/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import modelo.Persona;
import persistence.Persistence;
/**
 *
 * @author user
 */
public class PruebaPersistence {

    public static void main(String[] args) {
		
		Persistence persistence = new Persistence();
		try {
			persistence.persist(new Persona("Juan", "1234", 22));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
}
