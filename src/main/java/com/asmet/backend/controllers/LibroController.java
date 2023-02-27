package com.asmet.backend.controllers;

import com.asmet.backend.models.entity.Libro;
import com.asmet.backend.models.services.ILibroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "*" }, methods = { RequestMethod.GET, RequestMethod.DELETE,
        RequestMethod.POST, RequestMethod.PUT }, allowedHeaders = { "*" } )//"Access-Control-Allow-Headers", "Access-Control-Allow-Headers","Content-Type, Access-Control-Request-Method", "Access-Control-Request-Headers"
@RestController
@RequestMapping("/libro")
@RequiredArgsConstructor
public class LibroController {
    private final ILibroService libroService;

    @GetMapping("/find-all")
    public List<Libro> listartodos() {
        return libroService.findAll();
    }

    @GetMapping("/autor/{id}")
    public Libro findById(@PathVariable Long id) {
        return libroService.findById(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public Libro create(@PathVariable Libro autor) {
        System.out.print("AQUI VAMOS");
        return libroService.create(autor);
    }

    @DeleteMapping("/{id}")
    public void eliminarById(@PathVariable Long id) {
        libroService.delete(id);
    }
}
