package com.javacodegeeks.mockitotutorial.voidmethod;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;

import org.junit.Test;
import org.mockito.Mockito;

public class AuthenticatorApplicationTest {

    
    
    @Test (expected = NotAuthenticatedException.class)
    public void testAuthenticate() throws NotAuthenticatedException {
        AuthenticatorInterface authenticatorMock;
        AuthenticatorApplication authenticator;
        String username = "JavaCodeGeeks";
        String password = "wrong password";
        
        authenticatorMock = Mockito.mock(AuthenticatorInterface.class);
        authenticator = new AuthenticatorApplication(authenticatorMock);
        
        doThrow(new NotAuthenticatedException())
        .when(authenticatorMock)
        .authenticateUser(username, password);
        
        authenticator.authenticate(username, password);
    }

}
