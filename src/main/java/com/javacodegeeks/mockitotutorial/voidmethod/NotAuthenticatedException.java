/**
 * 
 */
package com.javacodegeeks.mockitotutorial.voidmethod;

/**
 * @author vanderlei.klein
 *
 */
public class NotAuthenticatedException extends Exception{
    
    public NotAuthenticatedException() {
        super("Não pode ser autenticado!");
    }

}
