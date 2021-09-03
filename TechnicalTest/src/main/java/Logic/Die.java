package Logic;

import java.util.Random;

/**
 *
 * @author Eduardo Nicolás Pérez Paredes
 */
public class Die {
    
    int dieFace;
    
    public Die (){
        this.dieFace = 0;
    }
    
    public int getDieFace(){
        return dieFace;
    }
    
    public void setDieFace(int dieFace){
        this.dieFace = dieFace;
    }
    
    public void play(){
        setDieFace((new Random().nextInt(6))+1);
        //System.out.println(getDieFace());
    }
}
