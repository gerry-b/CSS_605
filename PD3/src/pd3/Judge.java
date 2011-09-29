/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pd3;

import java.util.ArrayList ;
/**
 *
 * @author gblais1
 */
public class Judge 
{

ArrayList<String> player1MovesList = new ArrayList<String>();
ArrayList<String> player2MovesList = new ArrayList<String>();


public static String returnVerdict(int prisoner1Input, int prisoner2Input)
    {
        
     if (prisoner1Input == 0 && prisoner2Input == 0) //Both players defect
        {
        return "DD"; 
        } 
        
    
     else if (prisoner1Input == 1 && prisoner2Input == 1) 
        {
        return "CC" ; //Both players cooperate
        }
   
     else if (prisoner1Input == 0 && prisoner2Input == 1)
        {
        return "DC" ; //Defect / Cooperate
        }
    //Now we do the inverse real wuick, in case Prisoner1 was the talker
    else if (prisoner1Input == 1 && prisoner2Input == 0) 
        {
        return "CD" ;
        }
    else
        {
        return"Major Screwup" ; 
        }
    }
    
    


}
    
    

