package crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import crud.model.BaseDeDatos;

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
}
