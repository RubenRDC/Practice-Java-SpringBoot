package com.rubenrdc.javaspringweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author Ruben
 */
@Controller
@RequestMapping("/")//No es requerido en este caso.
public class HomeController {
    
    @GetMapping({"","/","/home"})
    public String redirectPage(){
        //return "forward:/web/listUsers";
        return "redirect:/web/listUsers";
        //return "forward:https://www.google.com/"; No found
        //return "redirect:https://www.google.com/";//Found
    }
}
