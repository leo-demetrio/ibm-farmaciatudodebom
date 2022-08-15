package com.farmaciatudodebom.apiibm.controller;

import com.farmaciatudodebom.apiibm.domain.Pedido;
import com.farmaciatudodebom.apiibm.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping
    private List<Pedido> list(){
        return pedidoRepository.findAll();
    }

    @PostMapping
    private Pedido save(@RequestBody Pedido pedido){
        return pedidoRepository.save(pedido);
    }

}
