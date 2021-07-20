package com.javacodegeeks.mockitotutorial.basecode;

/**
 * <h1>AuthenticatorApplication</h1>
 * @author vanderlei.klein
 *
 */
public class AuthenticatorApplication {

    private AuthenticatorInterface authenticator;

    /**
     * <h2>Construtor</h2>
     * 
     * @param authenticator
     */
    public AuthenticatorApplication(AuthenticatorInterface authenticator) {
        this.authenticator = authenticator;
    }
    
    /**
     * <h2>Método de autenticação</h2>
     * 
     * <p>Recebe username e password e tenta autenticar um usuário.</p>
     * <p>Para fazer a autenticação o método recebe a implementação da interface feita
     * no método construtor.</p>
     * 
     * @param username
     * @param password
     * @return authenticated (usuário autenticado)
     * @throws EmptyCredentialsException 
     */
    public boolean authenticate(String username, String password) throws EmptyCredentialsException {
        boolean authenticated;
        
        this.authenticator.foo();
        authenticated = this.authenticator.authenticateUser(username, password);
        
        return authenticated;
    }
    
}
