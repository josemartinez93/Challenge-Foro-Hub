package com.alura.challenge_foro_hub.repository;

import com.alura.challenge_foro_hub.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByLogin(String login);
}