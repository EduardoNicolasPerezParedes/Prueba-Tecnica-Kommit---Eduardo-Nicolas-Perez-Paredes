package View;

import Logic.Die;
import Logic.Hand;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Eduardo Nicolás Pérez Paredes
 */
public class Main {
    
    public Main(){
        int numberOfThrows = 3, numberOfDiscards = 1;
        
        Hand hand = new Hand();
        
        // Parte 1
        /*Die die = new Die();
        die.play();
        die.play();
        die.play();*/
        
        // Parte 2
        //ArrayList<Integer> myHand = hand.play(numberOfThrows);
        
        // Parte 3
        //System.out.println(myHand);
        //System.out.println(hand.discard(myHand, numberOfDiscards));
        
        // Parte 4
        /*ArrayList<Integer> myHand = new ArrayList();
        myHand = hand.run(myHand, numberOfThrows, numberOfDiscards);
        numberOfThrows = 5; numberOfDiscards = 2;
        myHand = hand.run(myHand, numberOfThrows, numberOfDiscards);
        numberOfThrows = 1; numberOfDiscards = 3;
        myHand = hand.run(myHand, numberOfThrows, numberOfDiscards);*/
    }
    
    public static void main(String[] args){
        Main execute = new Main();
    }
}
