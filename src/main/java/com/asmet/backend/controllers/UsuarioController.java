package com.asmet.backend.controllers;

import com.asmet.backend.models.entity.Usuario;
import com.asmet.backend.models.services.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "*" }, methods = { RequestMethod.GET, RequestMethod.DELETE,
        RequestMethod.POST, RequestMethod.PUT }, allowedHeaders = { "*" } )//"Access-Control-Allow-Headers", "Access-Control-Allow-Headers","Content-Type, Access-Control-Request-Method", "Access-Control-Request-Headers"
@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {
    private final IUsuarioService usuarioService;

    @GetMapping("/find-all")
    public List<Usuario> listartodos() {
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public Usuario findById(@PathVariable Long id) {
        return usuarioService.findById(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public Usuario create(@PathVariable Usuario usuario) {
        System.out.print("AQUI VAMOS");
        return usuarioService.create(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminarById(@PathVariable Long id) {
        usuarioService.delete(id);
    }
}
