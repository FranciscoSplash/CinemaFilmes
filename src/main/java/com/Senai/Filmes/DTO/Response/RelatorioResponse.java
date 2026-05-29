package com.Senai.Filmes.DTO.Response;

import java.math.BigDecimal;

public record RelatorioResponse(
        long totalReservas,
        BigDecimal totalReceitas,
        List<FilmeTotais>filmes;
) {
}
