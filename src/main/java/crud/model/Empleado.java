package crud.model;

public class Empleado {
	private String nombre;
	private String apellido;
	private int edad;
	private int sueldo;
	private int id;
	public Empleado(String unNombre,String unApellido,int unaEdad,int unSueldo) {
		this.nombre=unNombre;
		this.apellido=unApellido;
		this.edad=unaEdad;
		this.sueldo=unSueldo;
		this.id=0;
		}
	
	public Empleado() {
		this.nombre="";
		this.apellido="";
		this.edad=0;
		this.sueldo=0;
		this.id=0;
	};
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
