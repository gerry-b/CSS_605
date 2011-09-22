/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pd2;

import java.util.ArrayList ;

public class Judge 
{

ArrayList<String> player1MovesList = new ArrayList<String>();
ArrayList<String> player2MovesList = new ArrayList<String>();


public static String returnVerdict(String p1, String p2)
    {
        
        //System.out.println("p1 is " + p1) ;
        //System.out.println("p2 is " + p2) ;
                
        String prisoner1input = p1 ;
        String prisoner2input = p2 ;
        System.out.println("The Judge sees " + p1 + "and " + p2) ;
     if (prisoner1input.equals("c") && prisoner2input.equals("c")) 
        {
        return "00" ; //This "zz" means 0 and 0, the years each inmate will get
        } 
        
    //Next we calculate the scenario in which both players talk and so both receive medium sentences 
     else if (prisoner1input.equals("d") && prisoner2input.equals("d")) 
        {
        return "55" ; //Means 5 and 5.  Both inmates get 1 year.
        }
   
    //Next we calculate the scenario in which the players have differing responses.
    //The player who remains silent receives a high sentence, the talker receives a minimal sentence.
     else if (prisoner1input.equals("c") && prisoner2input.equals("d"))
        {
        return "10-1" ; //P2 gets only 1 year, because he's a rat
        }
    //Now we do the inverse real wuick, in case Prisoner1 was the talker
    else if (prisoner1input.equals("d") && prisoner2input.equals("c")) 
        {
        return "1-10" ;
        }
    else
        {
        return"Major Screwup" ;
        
        
        }
    }
    
    


}