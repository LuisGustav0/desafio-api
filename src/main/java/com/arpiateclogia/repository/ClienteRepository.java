package com.arpiateclogia.repository;

import com.arpiateclogia.infra.bancodedados.TabelaDeCliente;
import com.arpiateclogia.interfaces.ICrud;
import com.arpiateclogia.model.Cliente;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class ClienteRepository implements ICrud {

    private final TabelaDeCliente tabelaDeCliente = TabelaDeCliente.getInstance();

    @Override
    public void salvar(Cliente cliente) {
        this.tabelaDeCliente.salvar(cliente);
    }

    public Long getIdAutoIncrement() {
        List<Cliente> listClient = this.tabelaDeCliente.findAll();

        var ultimoId = listClient.stream().mapToLong(Cliente::getId).max().orElse(0L);

        // ultimoId = ultimoId + 1;
        // ++ultimoId;

        return new AtomicLong(ultimoId).incrementAndGet();
    }

    public List<Cliente> findAll() {
        return this.tabelaDeCliente.findAll();
    }
}
