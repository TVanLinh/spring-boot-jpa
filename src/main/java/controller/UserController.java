package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import service.UserService;

import java.security.Principal;

/**
 * Created by linhtran on 14/07/17.
 */

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/home")
    public String homePage(ModelMap modelMap) {
        modelMap.addAttribute("user", this.userService.getUserByName("priya"));
        return "home";
    }

    @RequestMapping("/login")
    public String loginPage(ModelMap modelMap) {
        return "login";
    }

    @RequestMapping("/403")
    public String page403() {
        return "403";
    }


    @RequestMapping("/hello")
    public String helloPage(Principal principal,ModelMap  modelMap) {
        if(principal!=null){
            modelMap.addAttribute("user",this.userService.getUserByName(principal.getName()));
            return "hello";
        }
        return "redirect:login";
    }
}
