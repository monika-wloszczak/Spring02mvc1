package pl.coderslab.controler;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({ "count", "max" })
public class HomeSessionController {

	@RequestMapping("/session")
	public String home(Model model) {
		model.addAttribute("max", 12);

		model.addAttribute("count", 99);

		return "home";

	}
	@RequestMapping("/session2")
	@ResponseBody
	public String session2(Model model, HttpSession ses) {

	int sesMax = (Integer)ses.getAttribute("max");
	System.out.println(sesMax);
	return "session";

	}

}
