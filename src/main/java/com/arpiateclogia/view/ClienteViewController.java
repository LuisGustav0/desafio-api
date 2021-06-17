package com.arpiateclogia.view;

import com.arpiateclogia.model.Cliente;
import com.arpiateclogia.service.ClienteService;

import java.util.Scanner;

public class ClienteViewController {

    private ClienteService service = new ClienteService();

    public void salvar(Scanner scanner) {
        System.out.println("Digite Razão social: ");
        String razaoSocial = scanner.nextLine();

        System.out.println("Digite Fantasia: ");
        String fantasia = scanner.nextLine();

        var cliente = Cliente.builder().razaoSocial(razaoSocial).fantasia(fantasia).build();

        this.service.salvar(cliente);
    }
}
