package com.cliente.exception;

public class BusinessException extends RuntimeException {

    public BusinessException(String messagem) {
        super(messagem);
    }
}