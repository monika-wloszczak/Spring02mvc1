package pl.coderslab.controler;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

@Controller
public class HomeController {
//	@RequestMapping("/hello")
//	@ResponseBody
//	public String hello(@RequestParam(defaultValue = "1") String paramName) {
//
//		System.out.println(paramName);
//		return "My param = " + paramName;
//
//	}
	@RequestMapping("/cookieSet")
	@ResponseBody
	public String homeJsp(HttpServletResponse response) {

		response.addCookie(new Cookie("cookie1", "value1"));

		response.addCookie(new Cookie("cookie2", "value2"));

		return "setCookies";

	}
	@RequestMapping("/cookieGet")
	@ResponseBody
	public String home(HttpServletRequest request){

		Cookie c = WebUtils.getCookie(request,"cookie2");

		return "cookie" + c.getValue();

		}

}
