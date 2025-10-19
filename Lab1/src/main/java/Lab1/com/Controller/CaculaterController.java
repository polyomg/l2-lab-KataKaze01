package Lab1.com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CaculaterController {

 @Autowired
 HttpServletRequest request;
 @GetMapping("/Caculate/Rectangle")
 public String Caculate() {
	 return "/Caculate/Rectangle";
 }
 @PostMapping("/Caculate/caculate")
 public String Caculate(Model model) {
	 double Length= Double.parseDouble(request.getParameter("length"));
	 double Width=  Double.parseDouble(request.getParameter("width"));
	 
	 double area=Length*Width;
	 double perimeter=(Length+Width)*2;
	 
	 model.addAttribute("area",area);
	 model.addAttribute("perimeter",perimeter);
	 return "/Caculate/Rectangle";
 }
}
