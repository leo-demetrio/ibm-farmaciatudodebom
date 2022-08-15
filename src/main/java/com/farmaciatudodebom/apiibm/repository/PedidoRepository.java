package com.farmaciatudodebom.apiibm.repository;

import com.farmaciatudodebom.apiibm.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
