package com.eabmodel.tarea_1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/var")
public class VariablesController {
    @GetMapping("/")
    public String indx(Model model){
        model.addAttribute("titulo", "Enviar parametros por ruta");
        return "var/index";
    }

    @GetMapping("/var/{texto}")
    public String var(@PathVariable String texto , Model model){
        model.addAttribute("titulo", "Recibir var(@PathVariable)");
        model.addAttribute("resultado", "El texto enviado es: " + texto);
        return "var/ver";

    }
    @GetMapping("/var/{texto}/{numero}")
    public String varnum(@PathVariable String texto ,@PathVariable Integer numero, Model model){
        model.addAttribute("titulo", "Recibir var(@PathVariable)");
        model.addAttribute("resultado", "El texto enviado es: " + texto + "  , Y el numero es : '"  + numero + "'");
        return "var/ver";

    }
}
