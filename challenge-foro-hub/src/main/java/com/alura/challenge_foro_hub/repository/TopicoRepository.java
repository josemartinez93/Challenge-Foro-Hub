package com.alura.challenge_foro_hub.repository;

import com.alura.challenge_foro_hub.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
