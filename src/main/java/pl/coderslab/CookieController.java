package pl.coderslab;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

@Controller
public class CookieController {

	@RequestMapping("/setcookie/{value1}/{value2}")
	@ResponseBody
	public String setCookie(HttpServletResponse response ,@PathVariable("value1") String value1, @PathVariable("value2") String value2) {
		
		response.addCookie(new Cookie("value1",value2));

		return "ustawiono ciastko";
		
	}
	@RequestMapping("/getcookie")
	public String getCooke(@CookieValue("value1") String value1,HttpServletRequest request) {
		
		Cookie c = WebUtils.getCookie(request,"value1");
		return "ciasteczko"+c.getValue();
	}
}
