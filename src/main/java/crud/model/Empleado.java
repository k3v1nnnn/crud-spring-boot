package crud.model;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



public class Empleado {
	@NotNull(message="El Nombre no puede ser nulo")
	@Size(min=3,message="El Nombre tiene que ser mas largo")
	private String nombre;
	@NotNull(message="El Apellido no puede ser nulo")
	@Size(min=3,message="El Apellido tiene que ser mas largo")
	private String apellido;
	@Min(value =1,message="La edad tiene que ser mayor a 1")
	@Max(value=110,message="La edad tiene que ser menor a 99")
	private int edad;
	@Min(value = 100,message="El sueldo tiene que ser mayor a 1000")
	private int sueldo;
	private int id;
	public Empleado(String unNombre,String unApellido,int unaEdad,int unSueldo) {
		this.nombre=unNombre;
		this.apellido=unApellido;
		this.edad=unaEdad;
		this.sueldo=unSueldo;
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
