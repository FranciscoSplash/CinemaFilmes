package com.Senai.Filmes.DTO.Request;

import java.util.List;
import java.util.UUID;

public record ReservaRequest(
        UUID id,
        List<UUID>assetosIds
) {
}
