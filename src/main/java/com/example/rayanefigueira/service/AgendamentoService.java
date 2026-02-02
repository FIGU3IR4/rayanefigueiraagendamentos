package com.example.rayanefigueira.service;

import com.example.rayanefigueira.model.Agendamento;
import com.example.rayanefigueira.model.StatusAgendamento;
import org.springframework.stereotype.Service;
import com.example.rayanefigueira.repository.AgendamentoRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;


    public AgendamentoService(AgendamentoRepository agendamentoRepository
                          ) {
        this.agendamentoRepository = agendamentoRepository;

    }

    public Agendamento criarAgendamento(Agendamento agendamento){

        if (agendamentoRepository.existsByDataAndHorario(
                agendamento.getData(),
                agendamento.getHorario())) {

            throw new RuntimeException("Horário já agendado");
        }

        // aqui depois podemos validar horário indisponível
        agendamento.setStatus(StatusAgendamento.AGENDADO);
        return agendamentoRepository.save(agendamento);
    }

    public List<Agendamento> listarTodos() {
        return agendamentoRepository.findAll();
    }

    public List<Agendamento> listarPorData(LocalDate data) {
        return agendamentoRepository.findByData(data);
    }

    public void cancelar(Long id) {
        Agendamento agendamento = agendamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agendamento não encontrado"));

        agendamento.setStatus(StatusAgendamento.CANCELADO);
        agendamentoRepository.save(agendamento);
    }
}
