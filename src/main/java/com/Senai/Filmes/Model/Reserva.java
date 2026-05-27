package com.Senai.Filmes.Model;

import com.Senai.Filmes.Model.Enums.Status;
import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @CreationTimestamp()
    private LocalDateTime criadoEm;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(mappedBy = "reserva", cascade = CascadeType.ALL)
    private




}
