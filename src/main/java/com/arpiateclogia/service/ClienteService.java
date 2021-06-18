package com.arpiateclogia.service;

import com.arpiateclogia.interfaces.ICrud;
import com.arpiateclogia.model.Cliente;
import com.arpiateclogia.repository.ClienteRepository;

import java.util.List;

public class ClienteService implements ICrud {

    private final ClienteRepository repository = new ClienteRepository();

    @Override
    public void salvar(Cliente cliente) {
        Long idAutoIncrement = this.repository.getIdAutoIncrement();

        cliente.setId(idAutoIncrement);

        this.repository.salvar(cliente);
    }

    public List<Cliente> findAll() {
        return this.repository.findAll();
    }
}
