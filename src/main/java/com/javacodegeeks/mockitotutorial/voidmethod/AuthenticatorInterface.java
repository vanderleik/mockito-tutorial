/**
 * 
 */
package com.javacodegeeks.mockitotutorial.voidmethod;

/**
 * @author vanderlei.klein
 *
 */
public interface AuthenticatorInterface {

    /**
     * Método que define a autenticação do usuário.
     * @param username Nome do usuário que será autenticado
     * @param password Senha de autenticação do usuário
     * @throws NotAuthenticatedException Se o usuário não puder ser autenticado
     */
    public void authenticateUser(String username, String password) throws 
    NotAuthenticatedException;;
}
