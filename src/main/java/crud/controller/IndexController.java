package crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import crud.model.BaseDeDatos;

@Controller
@RequestMapping("/")
public class IndexController {
	@Autowired
	private BaseDeDatos baseDeDatosEmpleado;;
	@GetMapping("")
	public String index(Model modelo) {
		modelo.addAttribute("empleados",this.baseDeDatosEmpleado.todosLosEmpleados());
		return "index";
	}
}
