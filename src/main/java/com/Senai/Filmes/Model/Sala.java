package com.Senai.Filmes.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.beans.ConstructorProperties;
import java.util.ArrayList;
import java.util.UUID;


@Data
@NoArgsConstructor
@Entity
@Table(name="salas")

public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "Campo Obrigatório")
    private String nome;

    @Min(value=1L, message = "A Sala deve ter no minimo um acento")
    private Integer totalAcentos;

    @OneToMany(mappedBy = "sala", cascade=CascadeType.ALL,orphanRemoval = true)
    private List<Assento>Assentos=new ArrayList<>();
}
