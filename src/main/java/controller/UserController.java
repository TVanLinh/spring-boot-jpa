package controller;

import entities.Article;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import page.Page;
import page.PageService;
import service.ArticleService;
import service.UserService;

import java.security.Principal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by linhtran on 14/07/17.
 */

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    ArticleService articleService;

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

    @RequestMapping(value = "/paging")
    public String pagingPage(ModelMap modelMap, @RequestParam(value = "page",required = false) String page){
         int totalRecord = this.articleService.getAllArticles().size();

         int totalPage = totalRecord % 3 == 0 ? totalRecord/3 : totalRecord/3+1;

         int pageCurrent = NumberUtils.toInt(page,1);

         Page pageResult  = PageService.getPage(totalPage,pageCurrent,5);

         List<Article> list = this.articleService.getArticles((pageCurrent-1)*3,3);

         modelMap.addAttribute("list",list);
         modelMap.addAttribute("pageResult",pageResult);
         modelMap.addAttribute("totalPage",totalPage);
        return  "paging";
    }
}
