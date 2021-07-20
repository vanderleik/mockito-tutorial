/**
 * 
 */
package com.javacodegeeks.mockitotutorial.voidmethod;

/**
 * @author vanderlei.klein
 *
 */
public class AuthenticatorApplication {

    private AuthenticatorInterface authenticator;
    
    /**
     * Construtor do método AuthenticatorApplication
     * @param authenticator
     */
    public AuthenticatorApplication(AuthenticatorInterface authenticator) {
        this.authenticator = authenticator;
    }
    
    /**
     * Tenta autenticar um usuário com os dados de nome e senha recebidos através do construtor.
     * @param username
     * @param password
     * @throws NotAuthenticatedException
     */
    public void authenticate(String username, String password) throws NotAuthenticatedException {
    this.authenticator.authenticateUser(username, password);
    
    }
     
}
