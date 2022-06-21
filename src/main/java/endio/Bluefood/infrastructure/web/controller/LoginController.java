package endio.Bluefood.infrastructure.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.Getter;


@Controller
public class LoginController {
	
	
	
	@GetMapping(path = { "/login", "/"} )
	public String login() {
		return "login";
	}

}
