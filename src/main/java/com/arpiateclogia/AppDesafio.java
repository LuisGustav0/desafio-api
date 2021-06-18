package com.arpiateclogia;

import com.arpiateclogia.exception.RegraDeNegocioException;
import com.arpiateclogia.view.CriarClienteViewController;
import com.arpiateclogia.view.ListarClienteViewController;
import com.arpiateclogia.view.MenuViewController;

import java.util.Scanner;

import static com.arpiateclogia.view.MenuViewController.MENU_CRIAR_CLIENTE;
import static com.arpiateclogia.view.MenuViewController.MENU_LISTAR_CLIENTE;

public class AppDesafio {

    private static final Scanner scanner = new Scanner(System.in);

    private static void executar() {
        var menuCtrl = new MenuViewController();

        var opcaoMenu = 0;

        do {
            menuCtrl.showMenu();
            opcaoMenu = menuCtrl.getOpcaoMenu(scanner);

            switch (opcaoMenu) {
                case MENU_CRIAR_CLIENTE:

                    var criarClienteCtrl = new CriarClienteViewController();
                    criarClienteCtrl.salvar(scanner);

                    break;
                case MENU_LISTAR_CLIENTE:

                    var listarClienteCtrl = new ListarClienteViewController();
                    listarClienteCtrl.showListCliente();

                    break;
                default:

                    messageGeneric("Opção do menu não encontrado!");

                    break;
            }
        } while (opcaoMenu != 5);
    }

    private static void messageGeneric(String message) {
        System.out.println("|____________________|Message|____________________|");
        System.out.println("|Exception: " + message);
        System.out.println("|_________________________________________________|\n");
    }

    public static void main(String[] args) {
        try {
            executar();
        } catch (RegraDeNegocioException ex) {
            messageGeneric(ex.getMessage());

            main(null);
        }
    }
}
