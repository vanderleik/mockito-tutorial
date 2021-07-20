package com.javacodegeeks.mockitotutorial.basecode;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AuthenticatorApplicationTest2 {

    /**
     * Com a anotação @Mock nós definimos as dependências que serão injetadas
     */
    @Mock
    private AuthenticatorInterface authenticatorMock;
    
    /**
     * Com a anotação @InjectMocks nós especificamos onde injetar as dependências definidas.
     */
    @InjectMocks
    private AuthenticatorApplication authenticator;
    
    @Test
    public void testAuthenticateMockInjection() throws EmptyCredentialsException {
        String username = "javacodegeeks";
        String password = "s4f3 p4ssw0rd";
        
        when(this.authenticatorMock.authenticateUser(username, password))
        .thenReturn(true);
        
        boolean actual = this.authenticator.authenticate("javacodegeeks", "s4f3 p4ssw0rd");
        
        assertTrue(actual);
        
    }

}
