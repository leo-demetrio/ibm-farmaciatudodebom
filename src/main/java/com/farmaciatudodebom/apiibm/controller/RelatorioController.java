package com.farmaciatudodebom.apiibm.controller;

import com.farmaciatudodebom.apiibm.domain.Cliente;
import com.farmaciatudodebom.apiibm.domain.Produto;
import com.farmaciatudodebom.apiibm.repository.ClienteRepository;
import com.farmaciatudodebom.apiibm.repository.PedidoRepository;
import com.farmaciatudodebom.apiibm.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/relatorio")
public class RelatorioController {

    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    public List<Produto> relatorio(){
        List<Produto> produtos = produtoRepository.findAll();
        return produtos;
    }
    @GetMapping("cliente")
    public List<Cliente> relatorioCliente(){
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes;
    }
}
