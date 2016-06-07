package cabanas.garcia.ismael.springcloud.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world controller
 *
 * Created by ismael on 07/06/2016.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String home(){
        return "Hellor world!";
    }
}
