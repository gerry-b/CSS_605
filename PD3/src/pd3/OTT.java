/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pd3;

/**
 *
 * @author gblais1
 */
public class OTT extends Prisoner 
{

    String tactic = "Optimistic Tit For Tat" ;
    
    public OTT()
    {
        
    //This is our constructor method
    }
    
    
    public int makeMove(int round) 
    {
    if (round == 0)
        {
        return 1 ;
        }
    else if (lastSentence == 0) //If the opponent cooperated in CD scenario
        {
        return 1 ; // 1 is cooperate, this would mirror opponents move
        }
    else if (lastSentence == 5) //If the opponent defected in CD scenario
        {
        return 0 ; //
        }
    else if (lastSentence == 3) //If opponent defected in DD scenario
        {
        return 0 ;
        }
    else if (lastSentence == 1) //if it was a CC scenario
        {
        return 1 ; 
        }
    else
        {
        return (2) ; //Something totally wrong has occured if this happens
        }
    
    }
    
    
    
}
