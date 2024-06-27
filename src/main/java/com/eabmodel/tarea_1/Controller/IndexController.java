package com.eabmodel.tarea_1.Controller;


import com.eabmodel.tarea_1.Entity.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {


    @RequestMapping({"/index", "/" , "home"})
    public String index(Model model){
        model.addAttribute("Titulo" , "Hola Spring Boot");
        return "index2";
    }

    @RequestMapping("/perfil")
    public String perfil(Model model){
        Usuario usuario = new Usuario();
        usuario.setName("Franklin");
        usuario.setLastName("Tapia");
        usuario.setEmail("tapiafranklin666@gmail.com");
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil: " .concat(usuario.getName() + " " + usuario.getLastName()));
        return "index";
    }

    @RequestMapping("/listar")
    public String listar (Model model){
        List<Usuario> usurious = new ArrayList<>();
        usurious.add(new Usuario("Carla", "Leon", "carla@gmail.com"));
        usurious.add(new Usuario("Diego", "Tapia", "diego@gmail.com"));
        usurious.add(new Usuario("Pablo", "tapia", "pablo@gmail.com"));
        usurious.add(new Usuario("Franklin", "tapia", "frank@gmail.com"));
        model.addAttribute("titulo" ,"Listado de Usuarios");
        model.addAttribute("usuarios", usurious);
        return "index3";
    }
    @ModelAttribute("usuarios")
    public  List<Usuario> usuarioss(){
        List<Usuario> users = Arrays.asList(new Usuario(
                "Franklin", "Tapia", "Frank@gmail.com"),
                new Usuario("Carla" ,"Leon", "carla@gamil.com")
        );
        return users;
    }
}
