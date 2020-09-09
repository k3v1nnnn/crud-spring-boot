package crud.model;

import java.util.List;

public interface BaseDeDatos {
	public List<Empleado> todosLosEmpleados();
	public void agregarEmpleado(Empleado unEmpledo);
}
