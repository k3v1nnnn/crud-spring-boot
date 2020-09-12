package crud.model;

import java.util.List;

public interface BaseDeDatos {
	public List<Empleado> todosLosEmpleados();
	public void agregarEmpleado(Empleado unEmpledo);
	public void eliminarEmpleadoPorId(int unEmpleadoId);
	public Empleado obtenerEmpleadoPorId(int empleadoId);
	public void actualizarEmpleado(Empleado unEmpleado);
}
