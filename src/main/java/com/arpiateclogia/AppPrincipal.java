package com.arpiateclogia;

import com.arpiateclogia.model.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class AppPrincipal {

    //        List<Cliente> listClient = this.tabelaDeCliente.findAll();
    //
    //        var ultimoId = listClient.stream().mapToLong(Cliente::getId).max().orElse(0L);
    //
    //        return new AtomicLong(ultimoId).incrementAndGet();

    private static void distinct() {
        List<Integer> listaInteger = Arrays.asList(1, 2, 3, 1, 1, 4, 3);

        // Distinct
        // List<Integer> listaIntegerDistinct = listaInteger.stream().distinct().collect(Collectors.toList());

        List<Integer> listaIntegerDistinc = new ArrayList<>();
        // 1, 2, 3
        for (Integer i : listaInteger) {
            if (!listaIntegerDistinc.contains(i)) {
                listaIntegerDistinc.add(i);
            }
        }

        listaIntegerDistinc.forEach(System.out::println);
    }

    private static void incrementAndGet() {
        Cliente cliente1 = Cliente.builder().id(1L).razaoSocial("").fantasia("").build();
        Cliente cliente2 = Cliente.builder().id(3L).razaoSocial("").fantasia("").build();

        List<Cliente> listCliente = Arrays.asList(cliente1, cliente2);

        listCliente.forEach(System.out::println);

        // Cliente .map(Cliente -> cliente.getId()) -> idCliente
        //        List<Long> listaCodigoCliente = listCliente.stream().map(Cliente::getId).collect(Collectors.toList());

        Long maiorCodigoDoIdDeCliente = listCliente.stream()
                                                   .mapToLong(Cliente::getId)
                                                   .max()
                                                   .orElse(0L);

        System.out.println("Maior código do cliente: " + maiorCodigoDoIdDeCliente);

        Long primeiroValor = new AtomicLong(maiorCodigoDoIdDeCliente).incrementAndGet();

        System.out.println("Primeiro valor: " + primeiroValor);

        Long segundoValor = new AtomicLong(primeiroValor).incrementAndGet();

        System.out.println("Segundo valor: " + segundoValor);
    }

    public static void main(String[] args) {
        int increment = 0;

        System.out.println("Increment++ :" + increment++);
        System.out.println("Increment++ :" + increment++);

        int increment2 = 0;

        System.out.println("++Increment :" + ++increment2);
        System.out.println("++Increment :" + ++increment2);
    }
}
