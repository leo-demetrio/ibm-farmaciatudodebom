package com.farmaciatudodebom.apiibm.domain;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;


@Entity
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome_cliente;
    private String cpf_cliente;
    private String tel_cliente;
    private String email_cliente;
    private String endereco_cliente;

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos = new ArrayList<>();

    public Cliente() {
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
    public Cliente(Long id, String nome_cliente, String cpf_cliente, String tel_cliente, String email_cliente, String endereco_cliente) {
        this.id = id;
        this.nome_cliente = nome_cliente;
        this.cpf_cliente = cpf_cliente;
        this.tel_cliente = tel_cliente;
        this.email_cliente = email_cliente;
        this.endereco_cliente = endereco_cliente;
    }

    public Cliente(Long id_cliente, String nome_cliente, String cpf_cliente, String tel_cliente, String email_cliente, String endereco_cliente, List<Pedido> pedidos) {
        this.id = id;
        this.nome_cliente = nome_cliente;
        this.cpf_cliente = cpf_cliente;
        this.tel_cliente = tel_cliente;
        this.email_cliente = email_cliente;
        this.endereco_cliente = endereco_cliente;
        this.pedidos = pedidos;
    }

    public Long getId_cliente() {
        return id;
    }

    public void setId_cliente(Long id_cliente) {
        this.id = id;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public String getTel_cliente() {
        return tel_cliente;
    }

    public void setTel_cliente(String tel_cliente) {
        this.tel_cliente = tel_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getEndereco_cliente() {
        return endereco_cliente;
    }

    public void setEndereco_cliente(String endereco_cliente) {
        this.endereco_cliente = endereco_cliente;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

