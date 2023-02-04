package br.com.ctd.Seivom.controllers;

import br.com.ctd.Seivom.dtos.comments.CommentDTO;
import br.com.ctd.Seivom.entities.Comment;
import br.com.ctd.Seivom.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private CommentService service;

    @GetMapping
    public ResponseEntity<Page<CommentDTO>> findAll(Pageable pageable) {
        return ResponseEntity.ok().body(service.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommentDTO> find(@PathVariable Long id){
        return ResponseEntity.ok().body(service.findDto(id));
    }

}
