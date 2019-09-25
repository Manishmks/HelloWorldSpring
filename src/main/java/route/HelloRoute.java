package route;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Repository
@EnableAutoConfiguration
public class HelloRoute
{
    @RequestMapping(value = "/hello")
    public String get()
    {
        return "hello";
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
