package com.javacodegeeks.mockitotutorial.basecode;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class AuthenticatorApplicationTest {

//    @Test
//    public void testAuthenticate() {
//
//        AuthenticatorInterface authenticatorMock;
//        AuthenticatorApplication authenticator;
//        String username = "JavaCodeGeeks";
//        String password = "unsafePassord";
//        
//        /*
//         * Definimos o objeto mock. É assim que o mock "aprende" as definições do método que será
//         * mockado.
//         */
//        authenticatorMock = Mockito.mock(AuthenticatorInterface.class);
//        authenticator = new AuthenticatorApplication(authenticatorMock);
//        /*
//         * Esse é o ponto chave. 
//         * Quando o objeto mock é chamado pelo método com os parâmetros usarname e password, 
//         * então ele retorna esse valor (false). 
//         */
//        when(authenticatorMock.authenticateUser(username, password))
//                .thenReturn(false);
//
//        boolean actual = authenticator.authenticate(username, password);
//
//        /*
//         * Verifica se os métodos são chamados na ordem correta. Devem ser chamados na ordem
//         * definida abaixo.
//         */
//        InOrder inOrder = Mockito.inOrder(authenticatorMock);
//        inOrder.verify(authenticatorMock).foo(); // ordem correta. se não estiver aqui ele falha
//        inOrder.verify(authenticatorMock).authenticateUser(username, password); //agora vai falhar
////        inOrder.verify(authenticatorMock).foo(); // O método authenticateUser() deve ser chamado antes do método foo().
//        
//        assertFalse(actual);
//    }
    
    @Test (expected = EmptyCredentialsException.class)
    public void testAuthenticateEmptyCredentialsException() throws EmptyCredentialsException {
        AuthenticatorInterface authenticatorMock;
        AuthenticatorApplication authenticator;
        
        authenticatorMock = Mockito.mock(AuthenticatorInterface.class);
        authenticator = new AuthenticatorApplication(authenticatorMock);
        
        when(authenticatorMock.authenticateUser("", ""))
        .thenThrow(new EmptyCredentialsException());
        
        authenticator.authenticate("", "");
        
    }
    

}
