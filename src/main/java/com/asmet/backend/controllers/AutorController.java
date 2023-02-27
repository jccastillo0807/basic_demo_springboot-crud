package com.asmet.backend.controllers;


import com.asmet.backend.models.entity.Autor;
import com.asmet.backend.models.services.IAutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "*" }, methods = { RequestMethod.GET, RequestMethod.DELETE,
        RequestMethod.POST, RequestMethod.PUT }, allowedHeaders = { "*" } )//"Access-Control-Allow-Headers", "Access-Control-Allow-Headers","Content-Type, Access-Control-Request-Method", "Access-Control-Request-Headers"
@RestController
@RequestMapping("/autor")
@RequiredArgsConstructor
public class AutorController {

    private final IAutorService autorService;

    @GetMapping("/find-all")
    public List<Autor> listartodos() {
        return autorService.findAll();
    }

    @GetMapping("/autor/{id}")
    public Autor findById(@PathVariable Long id) {
        return autorService.findById(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public Autor create(@PathVariable Autor autor) {
        System.out.print("AQUI VAMOS");
        return autorService.create(autor);
    }

    @DeleteMapping("/{id}")
    public void eliminarById(@PathVariable Long id) {
        autorService.delete(id);
    }


}
