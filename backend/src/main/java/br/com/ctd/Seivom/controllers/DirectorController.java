package br.com.ctd.Seivom.controllers;

import br.com.ctd.Seivom.dtos.director.DirectorDTO;
import br.com.ctd.Seivom.services.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/directors")
public class DirectorController {
    @Autowired
    private DirectorService service;

    @GetMapping
    public ResponseEntity<Page<DirectorDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok().body(service.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DirectorDTO> find(@PathVariable Long id){
        return ResponseEntity.ok().body(service.findDto(id));
    }
}
