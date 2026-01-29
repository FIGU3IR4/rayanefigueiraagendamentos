package com.example.rayanefigueira.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    private LocalDate data;

    private LocalTime horario;


    private String servico;

    @Enumerated(EnumType.STRING)
    private StatusAgendamento status;




}
