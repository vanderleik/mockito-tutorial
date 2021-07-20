package com.javacodegeeks.mockitotutorial.basecode;

public interface AuthenticatorInterface {
    /**
     * <h1>Interface de autenticação</h1>
     * 
     * <p>Interface que recebe duas strings como parâmetros e retorna um booleano
     * indicando que a autenticação ocorreu com sucesso ou não.</p>
     * 
     * @param username
     * @param password
     * @return boolean
     * @throws EmptyCredentialsException
     */
    public boolean authenticateUser(String username, String password) throws EmptyCredentialsException;
    
    /**
     * <p>Método dummy criado para verificar a ordem de chamada do método </p>
     */
    public void foo();

}
