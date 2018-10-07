package pl.tokl.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class HomeController {

    @RequestMapping
    public String homePage(){
        System.out.println("Ktoś otworzył stronę główną (home.html)");
        return "/home.html";
    }

    @RequestMapping("/page1")
    @ResponseBody
    public String example(){
        System.out.println("Ktoś otworzył podstronę page1");

        return "Oto losowa liczba: " + new Random().nextInt();
    }

}
