package com.rubenrdc.javaspringweb.controllers;

import com.rubenrdc.javaspringweb.models.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//Se puede devolver contenido HTML, enlaces o atributos que se puedan inyectar directamente en el HTML
@RequestMapping("/web")
public class UserController {

    //@ResponseBody Se Utiliza para devolver JSON o XML en el caso de que no se utilice desde el principio la anotacion @RestController
    @GetMapping("/details") // == @RequestMapping(path = {"/details"},method = RequestMethod.GET) 
    public String details(Model model) {
        /*Nombre del archivo html o *, contenida en templates que devolvera
        a cualquiera que ingrese en la url mapeada
         */
        User user = new User("Ruben", "Ruiz", "rdc@gmail.com");
        model.addAttribute("titulo", "Titulo_Principal");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/listUsers")
    public String getListUser(ModelMap modelMap) {

        //modelMap.addAttribute("userList",userList);
        modelMap.addAttribute("titulo", "Lista de Usuarios");
        return "listUsers";
    }

    @ModelAttribute("userList")//Metodo publico accesible desde cualquier pagina
    public List<User> ModelPublicUsersList() {
        List<User> userList = new ArrayList<>();

        userList.add(new User("Ruben", "Ruiz", "RubenRuiz@gmail.com"));
        userList.add(new User("Carlos", "Gimenez", "CarlosGimenez@gmail.com"));
        userList.add(new User("Sebastian", "Quintos", "SebastianQuintos@gmail.com"));
        userList.add(new User("Cristian", "Ovelar", "CristianOvelar@gmail.com"));
        return userList;
    }
    
    @GetMapping("/urlVar/{urlvar}")
    public String goUrlVar(@PathVariable String urlvar) {
        return urlvar;
    }
    
}
