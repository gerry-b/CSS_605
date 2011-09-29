/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pd3;

/**
 *
 * @author gblais1
 */
public class randomPrisoner extends Prisoner 
{
String tactic = "random" ;

   
    
    public randomPrisoner()
    {
        
    //This is our constructor method
    }
    
    
    public int makeMove(int round) 
    {
    int randomN = (int) (Math.random() * 2) ;
        if (randomN == 1)
            {
            return(0) ;
            }
        else
            {
            return(1) ;
            }        
    }
    
    
    
}
