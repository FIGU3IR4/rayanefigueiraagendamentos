package com.example.rayanefigueira.service;



import com.example.rayanefigueira.repository.AdminRepository;
import com.example.rayanefigueira.repository.AgendamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final AdminRepository adminRepository;


    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public boolean login(String userName, String senha){
        return adminRepository.findByUserName(userName)
                .map(admin -> admin.getSenha().equals(senha))
                .orElse(false);
    }
}
