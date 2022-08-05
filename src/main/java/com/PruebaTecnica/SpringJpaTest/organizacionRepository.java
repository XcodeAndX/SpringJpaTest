package com.PruebaTecnica.SpringJpaTest;

import entity.organizacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface organizacionRepository extends JpaRepository<organizacion, Integer> {
}
