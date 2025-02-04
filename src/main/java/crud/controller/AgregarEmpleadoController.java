package crud.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import crud.model.BaseDeDatos;
import crud.model.Empleado;

@Controller
@RequestMapping("/agregarEmpleado")
public class AgregarEmpleadoController {
	@Autowired
	private BaseDeDatos baseDeDatosEmpleado;
	@GetMapping("")
	public String saludarAlNuevoEmpleado(Model modelo) {
		Empleado unEmpleado = new Empleado();
		modelo.addAttribute("nuevoEmpleado", unEmpleado);
		return "agregarEmpleado";
	}
	@PostMapping("")
	public String agregarEmpleado(@Valid @ModelAttribute("nuevoEmpleado") Empleado unEmpleado ,BindingResult errores) {
		if(errores.hasErrors()) {
			return "agregarEmpleado";
		}
		this.baseDeDatosEmpleado.agregarEmpleado(unEmpleado);
		return "redirect:/";
	}
}
