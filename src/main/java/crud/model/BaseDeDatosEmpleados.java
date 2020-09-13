package crud.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class BaseDeDatosEmpleados implements BaseDeDatos{
	private List<Empleado> empleados;
	private int identificacionParaEmpleados;
	public BaseDeDatosEmpleados() {
		this.identificacionParaEmpleados=0;
		this.empleados=new ArrayList<>();
		this.agregarEmpleado(new Empleado("Pedro","Picapiedra",28,200));
		this.agregarEmpleado(new Empleado("Pablo","Marmol",24,120));
	}
	@Override
	public List<Empleado> todosLosEmpleados(){
		return this.empleados;
	}
	@Override
	public void agregarEmpleado(Empleado unEmpleado) {
		unEmpleado.setId(this.identificacionParaEmpleados);
		this.empleados.add(unEmpleado);
		this.identificacionParaEmpleados++;
	}
	@Override
	public void eliminarEmpleadoPorId(int unEmpleadoId) {
		for(Empleado empleado:this.empleados){
			if(empleado.esMiId(unEmpleadoId)) {
				this.empleados.remove(empleado);
				break;
			}
		}
	}
	@Override
	public Empleado obtenerEmpleadoPorId(int unEmpleadoId) {
		for(Empleado empleado:this.empleados){
			if(empleado.esMiId(unEmpleadoId)) {
				return empleado;
			}
		}
		return null;
	}
	@Override
	public void actualizarEmpleado(Empleado unEmpleado) {
		for(Empleado empleado:this.empleados){
			if(empleado.esMiId(unEmpleado.getId())) {
				this.empleados.remove(empleado);
				break;
			}
		}
		this.empleados.add(unEmpleado);
	}
}
