/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

/**
 *
 * @author Henrique
 */
public class FimDeJogoException extends Exception {

    public FimDeJogoException(String frase) {
        
        super(frase);
    }

    public FimDeJogoException() {
        System.out.println("Fim de jogo");
    }
    
}