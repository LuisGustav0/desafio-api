package com.arpiateclogia.controller;

import com.arpiateclogia.interfaces.ICrud;
import com.arpiateclogia.model.Cliente;
import com.arpiateclogia.service.ClienteService;

import java.util.List;

public class ClienteController implements ICrud {

    private final ClienteService service = new ClienteService();

    @Override
    public void salvar(Cliente cliente) {
        this.service.salvar(cliente);
    }

    public List<Cliente> findAll() {
        return this.service.findAll();
    }
}
