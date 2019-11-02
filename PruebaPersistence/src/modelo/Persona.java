/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.Date;
import annotations.Columna;
import annotations.Entidad;
/**
 *
 * @author user
 */
@Entidad(value= "persons", schema= "public")
public class Persona {
	@Columna(name = "name")
	private String nombre;
	
	@Columna(name = "id", isPk = true)
	private String cedula;
	
	@Columna(name = "age")
	private int edad;
	
	private Date fecha;

	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Persona(String nombre, String cedula, int edad) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
