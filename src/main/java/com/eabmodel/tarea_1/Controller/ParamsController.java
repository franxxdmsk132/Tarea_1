package com.eabmodel.tarea_1.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/par")
public class ParamsController {
    @GetMapping("/")
    public String index() {
        return "params/index";
    }

    @GetMapping("/string")
    public String params(@RequestParam(name = "texto", required = false, defaultValue = "Hola") String texto, Model model) {
        model.addAttribute("resultado", "El texto enviado es: " + texto);
        return "params/ver";
    }

    @GetMapping("/mix")
    public String parmix(@RequestParam String saludo, @RequestParam Integer numero, Model model) {
        model.addAttribute("resultado", "Te envia: '" + saludo + "', y el numero " + numero + "'");
        return "params/ver";
    }


    @GetMapping("/mixed")
    public String mixed(HttpServletRequest request, Model model) {

        String saludo = request.getParameter("saludo");
        Integer numero = null;
        try {
            numero = Integer.parseInt(request.getParameter("numero"));

        } catch (NumberFormatException e) {
            numero = 0;
        }
        model.addAttribute("resultado" , "El saludo es:  '" + saludo + "''y es numero" + numero + "'");

        return "params/ver";
    }
}
