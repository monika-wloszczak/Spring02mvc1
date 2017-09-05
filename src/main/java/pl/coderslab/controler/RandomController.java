package pl.coderslab.controler;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RandomController {
	@RequestMapping("/random/{min}/{max}")
	@ResponseBody
public String showRandom(@PathVariable(name="max")int max,
		@PathVariable(name="min")int min){
		Random r = new Random();
		int a = r.nextInt(max-min+1)+min;
		
		
	return "Wylosowano liczbę:" + a;
}
}
