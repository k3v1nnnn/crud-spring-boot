package crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import crud.model.BaseDeDatos;

@Controller
@RequestMapping("/eliminarEmpleado")
public class EliminarEmpleadoController {
	@Autowired
	private BaseDeDatos baseDeDatos;
	@GetMapping("")
	public String elimnarEmpleado(Model modelo) {
		modelo.addAttribute("empleados",this.baseDeDatos.todosLosEmpleados());
		return "eliminarEmpleado";
	}
	@GetMapping("/{id}")
	public String elimnarEmpleadoPorId(@PathVariable("id") int empleadoId) {
		this.baseDeDatos.eliminarEmpleadoPorId(empleadoId);
		return "redirect:/";
	}
}
