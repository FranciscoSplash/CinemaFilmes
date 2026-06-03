package com.Senai.Filmes.Controller;


import com.Senai.Filmes.DTO.Request.FilmeRequest;
import com.Senai.Filmes.DTO.Response.FilmeResponse;
import com.Senai.Filmes.Service.FilmeService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/filmes")

public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    @Operation(summary = "Listar todos os filmes", description = "Rota para listar todos os filmes")
    public ResponseEntity<List<FilmeResponse>> listarTodos(){
        List<FilmeResponse>filmes = filmeService.listarTodos();

        if(filmes.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(filmes, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    @Operation(summary = "Buscar os filmes por Id", description = "Rota buscar os filmes por Id")
    public  ResponseEntity<FilmeResponse>buscarPorId(UUID id){
        return new ResponseEntity<>(filmeService.buscarFilme(id),HttpStatus.OK);

    }

    @PostMapping
    @Operation(summary = "Criar filmes", description = "Rota para criar os filmes")
    public ResponseEntity<FilmeResponse>criarFilme(@RequestBody FilmeRequest filmerequest){
        return new ResponseEntity<>(filmeService.cadastrarFilme(filmerequest), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar os filmes", description = "Rota para atualizar os filmes")
    public ResponseEntity<FilmeResponse>atualizarFilme(@PathVariable UUID id, @RequestBody FilmeRequest filmeRequest){
        return new ResponseEntity<>(filmeService.atualizarFilme(id, filmeRequest), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Apagar os dados", description = "Rota para apagar os filmes")

    public ResponseEntity<FilmeResponse>deletar(@PathVariable UUID id){

        filmeService.deletarFilme(id);
    return new ResponseEntity<>(HttpStatus.OK);
    }
}
