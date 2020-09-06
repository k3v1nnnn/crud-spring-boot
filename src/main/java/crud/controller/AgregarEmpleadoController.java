package crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/agregarEmpleado")
public class AgregarEmpleadoController {
	@GetMapping("/")
	public String saludarAlNuevoEmpleado(@RequestParam("nombre") String nombre, Model modelo) {
		System.out.println(nombre);
		modelo.addAttribute("nombre", nombre);
		return "saludoEmpleado";
	}
}
