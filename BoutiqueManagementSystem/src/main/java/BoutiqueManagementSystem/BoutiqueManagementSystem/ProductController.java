package BoutiqueManagementSystem.BoutiqueManagementSystem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String Adminpage(){
		return "admin";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginpage(){
		return "login";
	}

}
