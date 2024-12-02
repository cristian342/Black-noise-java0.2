package com.example.BlackNoise.Controller;

import com.example.blacknoise.model.Usuario;
import com.example.blacknoise.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/registro")
    public String mostrarRegistroForm() {
        return "registro"; // Devuelve la vista de registro.html
    }

    @PostMapping("/registro")
    public String registrarUsuario(@ModelAttribute Usuario usuario) {
        // Lógica para registrar el usuario
        usuarioService.guardarUsuario(usuario);
        return "redirect:/auth/login"; // Redirige a la página de inicio de sesión
    }

    @GetMapping("/login")
    public String mostrarLoginForm() {
        return "login"; // Devuelve la vista de login.html
    }
}