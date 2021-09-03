package Logic;

import Logic.Die;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Eduardo Nicolás Pérez Paredes
 */
public class Hand {
       
    ArrayList<Integer> hand;
    //int[] hand;
    int numberOfElements;
    
    public Hand(){
        hand = new ArrayList();        
    }
    
    public ArrayList<Integer> getHand(){
        return this.hand;
    }
    
    public void setHand(ArrayList<Integer> hand){
        this.hand = hand;
    }
    
    public ArrayList<Integer> play(int numberOfThrows){
        Die die = new Die();
        for(int i = 0; i < numberOfThrows; i++){
            die.play();
            hand.add(die.getDieFace());
        }
        return hand;
    }
    
    public ArrayList<Integer> discard(ArrayList<Integer> hand, int movements){
        ArrayList<Integer> auxHand = new ArrayList();
        if(hand.size() < movements){
            int numberOfDiscardedElements = movements - hand.size();
            System.out.println("El número de movimientos es mayor al número de elementos de la mano"
                    + ", sólo se quitaran " + numberOfDiscardedElements + " elementos de la mano");
        }else if(movements < 0){
            System.out.println("El número de elementos a quitar debe ser positivo");
        }else{
            for(int i = movements; i < hand.size(); i++){
                auxHand.add(hand.get(i));
            }
        }
        return auxHand;
    }
    
    public ArrayList<Integer> run(ArrayList<Integer> initialHand, int numberOfNewElements, int numberOfDiscardedElements){
        ArrayList<Integer> auxHand = new ArrayList();
        ArrayList<Integer> newHand = play(numberOfNewElements);
        ArrayList<Integer> discardedElements = new ArrayList();
        if(!initialHand.isEmpty()){
            auxHand.addAll(initialHand);
        }
        for(int i = 0, j = 0; i < newHand.size(); i++, j++){
            auxHand.add(newHand.get(i));
            if(j < numberOfDiscardedElements){
                discardedElements.add(auxHand.get(j));
            }
        }
        auxHand = discard(auxHand, numberOfDiscardedElements);
        System.out.println("Estado de la mano: " + initialHand);
        System.out.println("Lanzamientos generados (" + numberOfNewElements + "): " + newHand);
        System.out.println("Lanzamientos descartados (" + numberOfDiscardedElements + "): " + discardedElements);
        System.out.println(auxHand + "\n");
        newHand.clear();
        return auxHand;
    }   
}
