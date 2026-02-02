package com.example.rayanefigueira.Controller;

import com.example.rayanefigueira.dto.LoginRequest;
import com.example.rayanefigueira.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService){
        this.adminService=adminService;

    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest request) {

        boolean sucesso = adminService.login(
                request.getUserName(),
                request.getSenha()
        );

        if (sucesso) {
            return ResponseEntity.ok("Login realizado");
        }

        return ResponseEntity.status(401).body("Credenciais inválidas");
    }


}
