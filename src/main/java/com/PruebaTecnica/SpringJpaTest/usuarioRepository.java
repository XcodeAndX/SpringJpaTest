package com.PruebaTecnica.SpringJpaTest;

import entity.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepository extends JpaRepository <usuario, Integer> {
}
