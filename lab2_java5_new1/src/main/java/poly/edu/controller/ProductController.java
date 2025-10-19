package poly.edu.controller;

import java.awt.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import poly.edu.model.*;

@Controller
public class ProductController {
	@GetMapping("/product/form")
	public String form() {
	Product p = new Product();
	p.setName("iPhone 30");
	p.setPrice(5000.0);
	/*?1*/
	return "form";
	}
	@PostMapping("/product/save")
	public String save(/*?2*/ Product p) {
	return "form";
	}
}