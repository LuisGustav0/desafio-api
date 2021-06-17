package com.arpiateclogia.infra.bancodedados;

import com.arpiateclogia.interfaces.ICrud;
import com.arpiateclogia.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class TabelaDeCliente implements ICrud {

    private static TabelaDeCliente instance;

    public static TabelaDeCliente getInstance() {
        if (instance == null) {
            instance = new TabelaDeCliente();
        }
        return instance;
    }

    private List<Cliente> listClient;

    private List<Cliente> getListClient() {
        if (this.listClient == null) {
            this.listClient = new ArrayList<>();
        }
        return this.listClient;
    }

    @Override
    public void salvar(Cliente cliente) {
        this.getListClient().add(cliente);
    }
}
