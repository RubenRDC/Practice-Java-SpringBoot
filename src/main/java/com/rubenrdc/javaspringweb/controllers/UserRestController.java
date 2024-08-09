package com.rubenrdc.javaspringweb.controllers;

import com.rubenrdc.javaspringweb.models.User;
import jakarta.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.*;

@RestController//Se Utiliza principalmente para devolver JSONs o XMLs
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/urlVar/{urlvar}")
    public Map<String, Object> goUrlVar(@PathVariable String urlvar) {
        Map<String, Object> a = new HashMap<>();//Podria ser un Objeto personalizado...
        a.put("urlVariable", urlvar);
        return a;
    }

    @GetMapping("/urlVar/{product}/{id}")
    public Map<String, Object> goMultiVarUrl(@PathVariable String product, @PathVariable int id) {
        Map<String, Object> json = new HashMap<>();//Podria ser un Objeto personalizado...
        json.put("product", product);
        json.put("id", id);
        return json;
    }

    @GetMapping("/getJSON")
    //@ResponseBody Se encuenta implicitamente gracias a la anotacion @RestController
    public Map<String, Object> getJSON() {

        User user = new User("Ruben", "Ruiz", "rsc@gmail.com");
        Map<String, Object> a = new HashMap<>();
        a.put("Titulo", "Bienvenido");
        a.put("Usuario", user);

        return a;
    }

    @GetMapping("/getJSON/list")
    //@ResponseBody Se encuenta implicitamente gracias a la anotacion @RestController
    public List<User> getJSONList() {
        User user = new User("Ruben", "Ruiz", "RubenRuiz@gmail.com");
        User user2 = new User("Carlos", "Gimenez", "CarlosGimenez@gmail.com");
        User user3 = new User("Sebastian", "Quintos", "SebastianQuintos@gmail.com");

        //List<User> a = new ArrayList<>();
        List<User> a = Arrays.asList(user, user2, user3);
        return a;
    }

    @GetMapping("/getJSON/byParams")
    public Map<String, Object> getParams(@RequestParam(required = false, defaultValue = "") String messg) {
        Map<String, Object> a = new HashMap<>();//Podria ser un Objeto personalizado...
        a.put("Mensaje", messg);
        return a;
    }

    @GetMapping("/getJSON/byParamsDouble")
    public Map<String, Object> getParamsDouble(@RequestParam(required = false, defaultValue = "") String text, @RequestParam(required = false, defaultValue = "") String code) {
        Map<String, Object> a = new HashMap<>();//Podria ser un Objeto personalizado...
        a.put("Texto", text);
        a.put("Codigo", code);
        return a;
    }

    @GetMapping("/getJSON/byRequest")
    public Map<String, Object> getRequest(HttpServletRequest request) {
        Map<String, Object> a = new HashMap<>();//Podria ser un Objeto personalizado...
        a.put("Texto", request.getParameter("text"));
        a.put("Codigo", request.getParameter("code"));
        return a;
    }
}
