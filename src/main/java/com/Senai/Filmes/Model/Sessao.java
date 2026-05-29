package com.Senai.Filmes.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;


@Data
@NoArgsConstructor
@Entity
@Table(name="sessoes")

public class Sessao {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name="filmes_id")
    @NotNull
    private Filme filme;

    @ManyToOne
    @JoinColumn(name = "sala_id")
    @NotNull
    private Sala sala;

    @NotNull(message = "O horario de inicio é obrigatório")
    private LocalDateTime inicio;

    @NotNull(message = "O horario do fim é obrigatório")
    private LocalDateTime fim;

    @NotNull(message = "Preco obrigatorio")
    private BigDecimal preco;

}
