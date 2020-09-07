package crud.model;

public class Empleado {
	private String nombre;
	private String apellido;
	private int edad;
	private int sueldo;
	public Empleado(String unNombre,String unApellido,int unaEdad,int unSueldo) {
		this.nombre=unNombre;
		this.apellido=unApellido;
		this.edad=unaEdad;
		this.sueldo=unSueldo;
		}
	
	
	public String getNombre() {return nombre;}
	//public void setNombre(String nombre) {this.nombre = nombre;}
	public String getApellido() {return apellido;}
	public void setApellido(String apellido) {this.apellido = apellido;}
	public int getEdad() {return edad;}
	public void setEdad(int edad) {this.edad = edad;}
	public int getSueldo() {return sueldo;}
	public void setSueldo(int sueldo) {this.sueldo = sueldo;}
}
