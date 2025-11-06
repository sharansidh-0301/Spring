package SpringTut.HelloDev;


import org.springframework.stereotype.Component;

@Component
public class HelloDevRepository {
    String getTodo(){
        return "Todo Returned....";
    }
    String getname(){
        return "Sidh";
    }
    String getPen(){
        return "Pen is writing....";
    }

}
