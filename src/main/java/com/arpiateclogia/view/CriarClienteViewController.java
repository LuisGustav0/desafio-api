package com.arpiateclogia.view;

import com.arpiateclogia.controller.ClienteController;
import com.arpiateclogia.enums.StatusE;
import com.arpiateclogia.model.Cliente;

import java.util.Scanner;

public class CriarClienteViewController {

    private final ClienteController controller = new ClienteController();

    public void salvar(Scanner scanner) {
        System.out.println("Digite Razão social: ");
        String razaoSocial = scanner.nextLine();

        System.out.println("Digite Fantasia: ");
        String fantasia = scanner.nextLine();

        var cliente = Cliente.builder()
                             .razaoSocial(razaoSocial)
                             .fantasia(fantasia)
                             .statusE(StatusE.AGRADANDO_APROVACAO)
                             .build();

        this.controller.salvar(cliente);
    }
}
