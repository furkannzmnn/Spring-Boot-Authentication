

package backend.ecommerce.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ValidationController {
    @RequestMapping("/user")
    public String loginUser(){
        return "User kullanıcı girişi başarılı";
    }

    @RequestMapping("/admin")
    public String loginAdmin(){
        return "Admin kullanıcı girişi başarılı";
    }


}
