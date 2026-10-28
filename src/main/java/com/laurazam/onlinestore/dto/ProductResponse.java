package  com.laurazam.onlinestore.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ProductResponse(
        Long id,
        String name,
        String description,
        BigDecimal price,
        String category,
        Boolean inStock,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {}