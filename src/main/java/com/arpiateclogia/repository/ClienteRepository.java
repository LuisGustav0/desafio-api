package com.arpiateclogia.repository;

import com.arpiateclogia.infra.bancodedados.TabelaDeCliente;
import com.arpiateclogia.interfaces.ICrud;
import com.arpiateclogia.model.Cliente;

public class ClienteRepository implements ICrud {

    @Override
    public void salvar(Cliente cliente) {
        var tabelaDeCliente = TabelaDeCliente.getInstance();

        tabelaDeCliente.salvar(cliente);
    }
}
