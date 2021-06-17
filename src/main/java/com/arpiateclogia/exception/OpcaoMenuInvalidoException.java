package com.arpiateclogia.exception;

public class OpcaoMenuInvalidoException extends RegraDeNegocioException {

    public OpcaoMenuInvalidoException() {
        super("Opção do menu invalido! Digite somente número");
    }
}
