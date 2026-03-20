package in.sp.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller

public class MyController {
    
    @GetMapping("/home")
    public String openFirstPage() {
    	
    	
    	String name="home";
    	return name;
    }
    
    @GetMapping("/bbb")
    public String openSecondtPage() {
    	return "admin";
    }
    
    @GetMapping("/loginpage")
    public String OpenLogingPage() {
    	return "login";
    }
} 
