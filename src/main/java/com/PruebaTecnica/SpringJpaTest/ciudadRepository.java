package com.PruebaTecnica.SpringJpaTest;

import entity.ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ciudadRepository extends JpaRepository <ciudad, Integer> {
}
