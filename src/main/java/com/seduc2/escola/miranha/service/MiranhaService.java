package com.seduc2.escola.miranha.service;

import com.seduc2.escola.miranha.entities.Miranha;
import com.seduc2.escola.miranha.repository.MiranhaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MiranhaService {

    private final MiranhaRepository repository;
    public MiranhaService(MiranhaRepository repository) {
        this.repository = repository;
    }

    public Miranha salvar(Miranha miranha){
        return repository.save(miranha);
    }

    public List<Miranha> listar(){
        return repository.findAll();
    }
}
