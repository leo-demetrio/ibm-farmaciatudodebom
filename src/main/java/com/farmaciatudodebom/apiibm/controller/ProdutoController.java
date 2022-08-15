package com.farmaciatudodebom.apiibm.controller;

import com.farmaciatudodebom.apiibm.domain.Produto;
import com.farmaciatudodebom.apiibm.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository productRepository;

    @GetMapping
    public List<Produto> list() {
        return productRepository.findAll();
    }

    @PostMapping
    public Object save(@RequestBody Produto produto) {
        return productRepository.save(produto);
    }
}
