package romaniancoder.booking;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String hello(){

        return "Bonjour Fabrice Otepa, Comment va le Traval ?";
    }

}

