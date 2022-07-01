package com.hypthanyx.anacomb.util;

import lombok.experimental.UtilityClass;

import java.math.BigInteger;

@UtilityClass
public class GremioUtil {

    public static BigInteger fatorial(int numero) {
        BigInteger resultado = BigInteger.ONE;
        for (; numero > 1; numero--) resultado = resultado.multiply(BigInteger.valueOf(numero));
        return resultado;
    }
}
