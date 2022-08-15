package com.farmaciatudodebom.apiibm.repository;


import com.farmaciatudodebom.apiibm.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
