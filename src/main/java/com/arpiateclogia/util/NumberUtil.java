package com.arpiateclogia.util;

import com.arpiateclogia.exception.RegraDeNegocioException;

public class NumberUtil {

    // public -> Acesso outras classes
    // static -> PRa não criar Objeto  NumberUtil
    // int pro retorno do metodo
    // Parametro String
    public static int parse(String num) {
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException ex) {
            throw new RegraDeNegocioException(ex);
        }
    }
}
