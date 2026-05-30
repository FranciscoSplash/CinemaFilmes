package com.Senai.Filmes.DTO.Response;

import java.util.UUID;

public record FilmeResponse(
        UUID id,
        String titulo,
        String descricao,
        String urlPoster,
        com.Senai.Filmes.Model.Enums.@jakarta.validation.constraints.NotNull(message = "O genero deve ser obrigatorio") GeneroFilme genero,
        Integer duracaoMinutos

) {
}
