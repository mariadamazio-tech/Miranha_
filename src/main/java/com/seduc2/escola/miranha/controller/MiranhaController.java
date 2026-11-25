package com.seduc2.escola.miranha.controller;

import com.seduc2.escola.miranha.service.MiranhaService;
import com.seduc2.escola.miranha.entities.Miranha;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api")
public class MiranhaController {

    private final MiranhaService service;
    public MiranhaController(MiranhaService service) {
        this.service = service;
    }
    public String save(@RequestBody Miranha m){
        return service.salvar(m) + "Miranha Calvo com sucesso"; }

    @GetMapping
    public List<Miranha> listar(){
        return service.listar();
    }
}
