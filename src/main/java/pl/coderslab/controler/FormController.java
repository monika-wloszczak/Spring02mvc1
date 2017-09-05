package pl.coderslab.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/first")
public class FormController {

	@GetMapping("/form")
	public String getForm() {
		return "form";
	}

	@PostMapping("/form")
	@ResponseBody
	public String postForm(@RequestParam("paramName") String paramName) {
		return "Parametr z posta: " + paramName;
	}

}
