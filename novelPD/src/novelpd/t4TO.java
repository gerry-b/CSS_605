/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package novelpd;

/**
 *
 * @author gblais1
 */
public class t4TO extends Prisoner
{

    public t4TO(String name)
    {
    super(name) ;
    }
    
    public int makeMove()
        {
        if (isSentenceZero() == true) //First we check if it's the first move of the game.
            {                           //If it's the first move we return 1, cooperate
            return 1 ;
            }
        else  //From this point we're preceding w/ assumption that it's not first move of the game
            {
            int lastSentence = this.sentences.get(sentences.size() - 1) ;
            if (lastSentence == 0) //This means a D-C scenario where opponent C'd
                {
                return 1 ;  //So this time we cooperate
                }
            if (lastSentence == 1) //This means a CC scenario, so respond with a C
                {
                return 1 ;
                }
            else
                {
                return 0 ;  //The other two scenarios are oppenent D'ing, so we D this time
                }
            }
        
        }
    
    
    
    
    
    public boolean isSentenceZero() 
        {
        if (this.sentences.size() == 0) //This means it's start of the game, no sentences have been delivered
            {
            return true ;
            }
        else
            {
            return false ;
            }
        }
    
    
}
