package SpringTut.HelloDev;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDevController {
    @GetMapping("/hello")
    String sayHello(){
        return "Hello Buddy! This is Sidh Machan!...";
    }
    @GetMapping("")
    String welcome(){
        return "Welcome to the Spring Boot Application!";
    }
}
