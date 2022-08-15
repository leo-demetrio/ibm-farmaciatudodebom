package com.farmaciatudodebom.apiibm.config;

import com.farmaciatudodebom.apiibm.domain.Cliente;
import com.farmaciatudodebom.apiibm.domain.Pedido;
import com.farmaciatudodebom.apiibm.domain.Produto;
import com.farmaciatudodebom.apiibm.repository.ClienteRepository;
import com.farmaciatudodebom.apiibm.repository.PedidoRepository;
import com.farmaciatudodebom.apiibm.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;


    @Configuration

    public class DevConfig implements CommandLineRunner {

        @Autowired
        private ClienteRepository clienteRepository;

        @Autowired
        private PedidoRepository pedidoRepository;

        @Autowired
        private ProdutoRepository produtoRepository;


        @Override
        public void run(String... args) throws Exception {
            Cliente cliente1 = new Cliente(null, "Maria Brown", "988888888", "3333333", "maria@gmail.com", "Av Leo Borges");
            Cliente cliente2 = new Cliente(null, "Lais Brown", "988888888", "3333333", "lais@gmail.com", "Av Leo Borges");

            Pedido pedido1 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), cliente1);
            Pedido pedido2 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), cliente2);


            Produto p1 = new Produto(null, "Vitamina C", 90.5, true, "Composto vitaminico",pedido1);
            Produto p2 = new Produto(null, "Vitamina C", 90.5, true, "Composto vitaminico",pedido1);
            Produto p3 = new Produto(null, "Vitamina C", 90.5, true, "Composto vitaminico",pedido1);


            clienteRepository.saveAll(Arrays.asList(cliente1, cliente2));
            pedidoRepository.saveAll(Arrays.asList(pedido1, pedido2));
            produtoRepository.saveAll(Arrays.asList(p1, p2, p3));

        }
}
