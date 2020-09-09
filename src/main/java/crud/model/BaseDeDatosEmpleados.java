package crud.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class BaseDeDatosEmpleados implements BaseDeDatos{
	private List<Empleado> empleados;
	public BaseDeDatosEmpleados() {
		this.empleados=new ArrayList<>();
		this.empleados.addAll(Arrays.asList(new Empleado("Pedro","Picapiedra",28,200),
				new Empleado("Pablo","Marmol",24,120)));
	}
	@Override
	public List<Empleado> todosLosEmpleados(){
		return this.empleados;
	}
	@Override
	public void agregarEmpleado(Empleado unEmpleado) {
		this.empleados.add(unEmpleado);
	}
}
