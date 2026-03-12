package in.sp.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import in.sp.beans.Student;

@Controller

public class MyController {
    
  	
    	@GetMapping("/helloPage")
    	public String openHellopage() {
    		System.out.println(100/0);
    		return "hello";
    	}
    	
    	@GetMapping("/pageNotFound")
    	public String openPageNotFound() {
    		return "page-not-found";
    	}
} 
