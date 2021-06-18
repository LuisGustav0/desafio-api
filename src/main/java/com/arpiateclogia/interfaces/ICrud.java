package com.arpiateclogia.interfaces;

import com.arpiateclogia.model.Cliente;

import java.util.List;

public interface ICrud {

    void salvar(Cliente cliente);

    List<Cliente> findAll();
}
