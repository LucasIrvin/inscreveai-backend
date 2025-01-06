package com.example.inscreveai.exceptions;

/**
 * Classe de exceção do sistema. Esta classe lance uma exceção do tipo
 * RuntimeException
 *
 */

public class InscreveAiNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InscreveAiNotFoundException(String message) {
        super(message);
    }

    public InscreveAiNotFoundException(){ super();}
}
