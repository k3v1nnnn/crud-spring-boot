package crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import crud.model.BaseDeDatos;
import crud.model.Empleado;

@Controller
@RequestMapping("/actualizarEmpleado")
public class ActualizarEmpleadoController {
	@Autowired
	private BaseDeDatos baseDeDatos;
	@GetMapping("")
	public String actualizarEmpleado(Model modelo) {
		modelo.addAttribute("empleados",this.baseDeDatos.todosLosEmpleados());
		return "actualizarEmpleado";
	}
	@GetMapping("/{id}")
	public String actualizarEmpleadoPorId(@PathVariable("id") int empleadoId,Model modelo) {
		Empleado unEmpleado = this.baseDeDatos.obtenerEmpleadoPorId(empleadoId);
		modelo.addAttribute("actualizarEmpleado", unEmpleado);
		return "actualizandoEmpleado";
	}
	@PostMapping("")
	public String empleadoActualizado(@ModelAttribute("actualizarEmpleado") Empleado unEmpleado) {
		this.baseDeDatos.actualizarEmpleado(unEmpleado);
		return "redirect:/";
	}
}
