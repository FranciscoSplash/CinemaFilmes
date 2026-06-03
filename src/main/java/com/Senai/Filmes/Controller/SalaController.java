package com.Senai.Filmes.Controller;


import com.Senai.Filmes.DTO.Response.SalaResponse;
import com.Senai.Filmes.Model.Sala;
import com.Senai.Filmes.Service.SalaService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/salas")
public class SalaController {

    @Autowired
    private SalaService salaService;


    @GetMapping
    @Operation(summary = "Listar todas as salas", description = "Rota para listar todas as salas")

    public ResponseEntity<List<Sala>>listarTodassalas(){
        List<SalaResponse>sala = salaService.listarTodassalas();

        if(sala.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
