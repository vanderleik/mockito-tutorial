package com.javacodegeeks.mockitotutorial.basecode;

/**
 * Cria uma excessão para credenciais vazias.
 * 
 * @author vanderlei.klein
 *
 */
public class EmptyCredentialsException extends Exception{
    
    /**
     * Construtor da classe.
     * Nós adicionamos essa excessão na assinatura do método da interface de 
     * autenticação (AuthenticatorInterface), e também na sua chamada na AuthenticatorApplication.
     */
    public EmptyCredentialsException() {
        super("Empty credentials");
    }

}
