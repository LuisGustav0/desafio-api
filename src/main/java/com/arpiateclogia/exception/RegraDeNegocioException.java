package com.arpiateclogia.exception;

public class RegraDeNegocioException extends RuntimeException {

    public RegraDeNegocioException(Throwable cause) {
        super(cause);
    }

    public RegraDeNegocioException(String message) {
        super(message);
    }
}
