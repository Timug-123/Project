package BoutiqueManagementSystem.BoutiqueManagementSystem;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/*@Controller
public class ProductmagntController {

	@RequestMapping(value = "/testing", method = RequestMethod.GET)
    @ResponseBody
    public String securedEndpoint(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("user") == null) {
            return "Access denied: No active session.";
        }
        return "Welcome, " + session.getAttribute("user");
    }
}*/
