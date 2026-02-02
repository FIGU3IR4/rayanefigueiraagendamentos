package com.example.rayanefigueira.repository;


import com.example.rayanefigueira.model.Admin;
import com.example.rayanefigueira.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByUserName(String userName);
}
