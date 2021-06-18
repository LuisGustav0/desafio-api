package com.arpiateclogia.view;

import com.arpiateclogia.exception.OpcaoMenuInvalidoException;
import com.arpiateclogia.exception.RegraDeNegocioException;
import com.arpiateclogia.util.NumberUtil;

import java.util.Scanner;

public class MenuViewController {

    public static final int MENU_CRIAR_CLIENTE = 1;

    public static final int MENU_LISTAR_CLIENTE = 3;

    public void showMenu() {
        System.out.println("|_________________________________________________|");
        System.out.println("|_____________________|MENU|______________________|");
        System.out.println("|_________________________________________________|");
        System.out.println("|__________________|Cliente:|_____________________|");
        System.out.println("|___________[1]Criar cliente______________________|");
        System.out.println("|___________[2]Alterar cliente____________________|");
        System.out.println("|___________[3]Listar cliente_____________________|");
        System.out.println("|___________[4]Excluir cliente____________________|");
        System.out.println("|_________________________________________________|");
    }

    public int getOpcaoMenu(Scanner scanner) {
        System.out.println("|___________Escolha uma opção abaixo:_____________|");
        String opcaoMenu = scanner.nextLine();

        try {
            return NumberUtil.parse(opcaoMenu);
        } catch (RegraDeNegocioException ex) {
            throw new OpcaoMenuInvalidoException();
        }
    }
}
