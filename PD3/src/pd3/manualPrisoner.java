/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pd3;

import java.util.* ;

/**
 *
 * @author gblais1
 */
public class manualPrisoner extends Prisoner 
{
String tactic = "manual" ;
    
    
    public manualPrisoner()
    {
        
    }
    
    

    
    public int makeMove(int round) 
    {
    
    int response = 7 ;
    
    while (response != 0 && response != 1)
        {
        Scanner in = new Scanner(System.in) ;
        System.out.println("'D'efecting means being a rat. 'C'ooperating means not snitching.") ;
        System.out.println("What is your move?  Type '0' to defect or '1' to Cooperate:  ") ;
        response = in.nextInt() ;
        }
    return response ;
    
    }
    
    
   
    
}
