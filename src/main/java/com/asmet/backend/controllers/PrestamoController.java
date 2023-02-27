package com.asmet.backend.controllers;

import com.asmet.backend.models.entity.Prestamo;
import com.asmet.backend.models.services.IPrestamoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "*" }, methods = { RequestMethod.GET, RequestMethod.DELETE,
        RequestMethod.POST, RequestMethod.PUT }, allowedHeaders = { "*" } )//"Access-Control-Allow-Headers", "Access-Control-Allow-Headers","Content-Type, Access-Control-Request-Method", "Access-Control-Request-Headers"
@RestController
@RequestMapping("/prestamo")
@RequiredArgsConstructor
public class PrestamoController {

    private final IPrestamoService prestamoService;

    @GetMapping("/find-all")
    public List<Prestamo> listartodos() {
        return prestamoService.findAll();
    }

    @GetMapping("/{id}")
    public Prestamo findById(@PathVariable Long id) {
        return prestamoService.findById(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public Prestamo create(@PathVariable Prestamo prestamo) {
        System.out.print("AQUI VAMOS");
        return prestamoService.create(prestamo);
    }

    @DeleteMapping("/{id}")
    public void eliminarById(@PathVariable Long id) {
        prestamoService.delete(id);
    }
}
