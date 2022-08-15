package com.farmaciatudodebom.apiibm.repository;

import com.farmaciatudodebom.apiibm.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
