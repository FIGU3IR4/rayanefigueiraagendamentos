package com.example.rayanefigueira.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @JsonFormat(pattern = "yyyy-MM-dd") // Ensina o Java a ler o que o React envia
    private LocalDate data;

    @JsonFormat(pattern = "HH:mm") // Ensina o Java a ler horários como "08:00"
    private LocalTime horario;

    private String servico;

    @Enumerated(EnumType.STRING)
    private StatusAgendamento status;
}
