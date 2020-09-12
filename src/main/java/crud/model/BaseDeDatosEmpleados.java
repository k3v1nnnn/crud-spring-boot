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
		int posicion= this.posicionDelEmpleado(unEmpleadoId);
		this.empleados.remove(posicion);
	}
	@Override
	public Empleado obtenerEmpleadoPorId(int unEmpleadoId) {
		int posicion= this.posicionDelEmpleado(unEmpleadoId);
		return this.empleados.get(posicion);
	}
	@Override
	public void actualizarEmpleado(Empleado unEmpleado) {
		int posicion= this.posicionDelEmpleado(unEmpleado.getId());
		this.empleados.remove(posicion);
		this.empleados.add(posicion,unEmpleado);
	}
	
	private int posicionDelEmpleado(int idDelEmpleado) {
		int retorno=0;
		for (int i=0;i<this.empleados.size();i++) {
			if(this.empleados.get(i).esMiId(idDelEmpleado)) {
				retorno= i;
				break;
			}
		}
		return retorno;
	}
}
