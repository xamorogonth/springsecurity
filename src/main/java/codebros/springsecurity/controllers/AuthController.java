package codebros.springsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AuthController {

    @GetMapping("/signin")
    public String getLoginPage() {
        return "signin";
    }

    @GetMapping("/success")
    public String getSuccessPage() {
        return "success";
    }
}
