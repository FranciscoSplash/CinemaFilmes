package com.Senai.Filmes.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "acentos")
public class Assento {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private UUID id;

    @NotBlank(message = "Campo Obrigatório")
    private String fileira;

    @NotNull(message = "Campo de numero obrigatório")
    @Min(value=1, message = "No minimo deve ter um carater")
    private Integer numero;


    @CreationTimestamp
    private LocalDateTime criadoEm;

    @ManyToOne
    @JoinColumn(name="sala_id")
    private Sala sala;
}
