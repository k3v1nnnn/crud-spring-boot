package crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/iniciarSesion")
public class IniciarSesionController {
	@GetMapping
	public String iniciarSesion() {
		return "iniciarSesion";
	}
}
