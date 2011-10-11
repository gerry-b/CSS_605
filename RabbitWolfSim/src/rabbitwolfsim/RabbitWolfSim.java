
package rabbitwolfsim;

import java.util.* ;

public class RabbitWolfSim 
{

    public static void main(String[] args) 
    {
        Rabbit Bobby = new Rabbit("Bobby") ;
        
        
        
        Bobby.randomHop() ;
        
        
        
        ArrayList<food> foods = new ArrayList<food>() ; //create an arrayList ot hold food items
        
        food cabbage = new food(4, 6 , "cabbage") ;
        food radish  = new food(-3, 0 , "radish" ) ;
        food carrot  = new food (1,1, "carrot") ;
        
        
        foods.add(cabbage) ;
        foods.add(radish) ;
        
        boolean timeToQuit = false ;
        int round = 0 ;
        while (Bobby.alive == true)
            {
            
            Bobby.autoTurn(foods , round) ;
            
            for (int i = 0 ; i <= (foods.size() -1) ; i += 1)
                {
                food currentFood = foods.get(i) ;
                currentFood.agTurn(round);
                System.out.println("Current Round:  " + round) ;
                System.out.println("ROUND:  " + round) ;
                System.out.println("\n\n") ;
                }
                     
            round += 1 ;
            
            }
        
        
        
        
        
       
    }
    
    
    
}
