package pl.coderslab.controler;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FreeTimeController {

	@RequestMapping("/freetime")
	@ResponseBody
	public String freeTime(){
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		
		if(day != Calendar.SUNDAY && day != Calendar.SATURDAY)
				if(hour>=9 && hour<18){
					return "Pracuje, nie dzwoń.";
				}else{
					return "Po Pracy";
				}
		return "Wolne";
	}
}
