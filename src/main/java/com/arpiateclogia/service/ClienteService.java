package com.arpiateclogia.service;

import com.arpiateclogia.interfaces.ICrud;
import com.arpiateclogia.model.Cliente;
import com.arpiateclogia.repository.ClienteRepository;

public class ClienteService implements ICrud {

    private ClienteRepository repository = new ClienteRepository();

    @Override
    public void salvar(Cliente cliente) {
        cliente.setId(1L);

        this.repository.salvar(cliente);
    }
}
