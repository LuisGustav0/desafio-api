package com.arpiateclogia.view;

import com.arpiateclogia.controller.ClienteController;
import com.arpiateclogia.model.Cliente;

import java.util.List;

public class ListarClienteViewController {

    private final ClienteController controller = new ClienteController();

    private boolean isListaClienteUltimoRegistro(List<Cliente> listCliente, Long id) {
        int ultimoIndex = listCliente.size() - 1;

        return listCliente.get(ultimoIndex).getId().equals(id);
    }

    private boolean isListaClienteNaoEhUltimoRegistro(List<Cliente> listCliente, Long id) {
        return !this.isListaClienteUltimoRegistro(listCliente, id);
    }

    public void showListCliente() {
        List<Cliente> listCliente = this.controller.findAll();

        System.out.println("\n");
        System.out.println("|_______________|Lista de Cliente|________________|");

        for (Cliente cliente : listCliente) {
            Long id = cliente.getId();

            System.out.println("Id: " + id);
            System.out.println("Razão social: " + cliente.getRazaoSocial());
            System.out.println("Fantasia: " + cliente.getFantasia());
            System.out.println("Status: " + cliente.getStatusE());

            if (this.isListaClienteNaoEhUltimoRegistro(listCliente, id)) {
                System.out.println("|_________________________________________________|");
            }
        }

        System.out.println("|_____________|Fim Lista de Cliente|______________|");
        System.out.println("\n");
    }
}
