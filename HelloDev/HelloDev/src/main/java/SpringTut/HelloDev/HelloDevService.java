package SpringTut.HelloDev;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloDevService {

//   Injected using  @Autowired
//   private HelloDevRepository helloDevRepository;;
    private final HelloDevRepository helloDevRepository;
//
    public HelloDevService(HelloDevRepository helloDevRepository){
        this.helloDevRepository = helloDevRepository;
    }
    public void printTodo(){
        System.out.print(helloDevRepository.getTodo());
    }
    public void printname(){
        System.out.println(helloDevRepository.getname());
    }
    public void writePen(){
        System.out.println(helloDevRepository.getPen());
    }
}
