package com.Senai.Filmes.DTO.Request;

public record SalaRequest(
        String nome,
        String totalAssentos,
        Integer fileiras,
        Integer assentosPorFileira
) {
}
