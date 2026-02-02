package com.example.rayanefigueira.Controller;

import com.example.rayanefigueira.model.Agendamento;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.rayanefigueira.service.AgendamentoService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    private final AgendamentoService service;

    public AgendamentoController(AgendamentoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Agendamento> criar(@RequestBody Agendamento agendamento) {
        return ResponseEntity.ok(service.criarAgendamento(agendamento));
    }

    @GetMapping
    public ResponseEntity<List<Agendamento>> listar(@RequestParam(required = false) LocalDate data) {
        if (data != null) {
            return ResponseEntity.ok(service.listarPorData(data));
        }
        return ResponseEntity.ok(service.listarTodos());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancelar(@PathVariable Long id) {
        service.cancelar(id);
        return ResponseEntity.noContent().build();
    }
}
