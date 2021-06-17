package com.arpiateclogia;

import com.arpiateclogia.exception.RegraDeNegocioException;
import com.arpiateclogia.view.ClienteViewController;
import com.arpiateclogia.view.MenuViewController;

import java.util.Scanner;

import static com.arpiateclogia.view.MenuViewController.MENU_CRIAR_CLIENTE;

public class AppDesafio {

    private static Scanner scanner = new Scanner(System.in);

    private static void executar() {
        var menuCtrl = new MenuViewController();

        int opcaoMenu = 0;

        do {
            menuCtrl.showMenu();
            opcaoMenu = menuCtrl.getOpcaoMenu(scanner);

            switch (opcaoMenu) {
                case MENU_CRIAR_CLIENTE:

                    var clienteCtrl = new ClienteViewController();
                    clienteCtrl.salvar(scanner);

                    break;
                default:
                    messageGerenic("Opção do menu não encontrado!");
                    break;
            }
        } while (opcaoMenu != 5);
    }

    private static void messageGerenic(String message) {
        System.out.println("|____________________|Message|____________________|");
        System.out.println("|Exception: " + message);
        System.out.println("|_________________________________________________|\n");
    }

    public static void main(String[] args) {
        try {
            executar();
        } catch (RegraDeNegocioException ex) {
            messageGerenic(ex.getMessage());

            executar();
        }
    }
}
