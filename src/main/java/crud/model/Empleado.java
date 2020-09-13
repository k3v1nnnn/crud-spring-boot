package crud.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;



public class Empleado {
	@NotNull
	@Size(min=3,message="El Nombre tiene que ser mas largo")
	private String nombre;
	@NotNull
	@Size(min=3,message="El Apellido tiene que ser mas largo")
	private String apellido;
	@Positive
	@Digits(integer=2,fraction=0,message="La edad tiene que estar entre 1 a 99")
	private int edad;
	@Positive(message="El Sueldo no puede Ser 0")
	@Digits(integer=6,fraction=0)
	private int sueldo;
	private int id;
	public Empleado(String unNombre,String unApellido,int unaEdad,int unSueldo) {
		this.nombre=unNombre;
		this.apellido=unApellido;
		this.edad=unaEdad;
		this.sueldo=unSueldo;
		this.id=0;
		}
	
	public Empleado() {};
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public String getApellido() {return apellido;}
	public void setApellido(String apellido) {this.apellido = apellido;}
	public int getEdad() {return edad;}
	public void setEdad(int edad) {this.edad = edad;}
	public int getSueldo() {return sueldo;}
	public void setSueldo(int sueldo) {this.sueldo = sueldo;}
	public int getId() {return this.id;}
	public void setId(int id) {this.id=id;}
	public boolean esMiId(int unId) {
		return this.id==unId;
	}
}
