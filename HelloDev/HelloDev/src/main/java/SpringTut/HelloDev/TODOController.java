package SpringTut.HelloDev;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
//Request Mapping
@RequestMapping("/api/v1/todo")
public class TODOController {
    //Path Variable
    @GetMapping("/userid/{id}")
    String printId(@PathVariable int id){
        return "Path Id: " + id;}
    //Request Parameter
    //Single Parameter
    @GetMapping("/id")
    String getID(@RequestParam("id") int id){
        return "User ID = "+id;}
    //Multiple Parameter
    @GetMapping("/user")
    String showUser(@RequestParam String name, @RequestParam int id){
        return "User Name: " + name + ", User Id: "+ id ;}
    //Request Body
    @PostMapping("/create")
    String postUser(String body){
        return body;}

    //IOC DI
    @Autowired
    private HelloDevService helloDevService;
    @GetMapping("/to")
    String getTodo(){
        helloDevService.printTodo();
        return "Todo";
    }
    @GetMapping("/name")
    String showName(){
        helloDevService.printname();
        return "Name Returned....";
    }
    @GetMapping("/pen")
    String showPen(){
        helloDevService.writePen();
        return "Pen Returned";
    }


}


