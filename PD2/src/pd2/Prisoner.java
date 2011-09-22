
package pd2;

import java.util.ArrayList ;

/**
 *
 * @author gblais1
 */
public class Prisoner 
{
int score = 0 ;
ArrayList<String> selfMovesList = new ArrayList<String>();
ArrayList<String> opponentMovesList = new ArrayList<String>();




    //Here we create a setter method that adjusts the prisoners score
    public void awardPoints(int points)
    {
    score += points ;
    }
    
    //Here we create an accessor method that returns score
    public int returnPoints()
    {
    return score ;
    }














//BELOW ARE THE PLAYER STRATEGIES (Always COOP, Always Defect, 

    //This method represents the "always defect" strategy
    public String provideAlwasDefResponse()
    {
    return ("d") ;
    }
    
    //This method represents the "random" strategy
    public String provideRandomResponse()
    {
        int randomN = (int) (Math.random() * 2) ;
        if (randomN == 1)
            {
            return("c") ;
            }
        else
            {
            return("d") ;
            }
      
    }
    
    //This method represents the "always cooperate" strategy.
    public String provideAlwaysCoopResponse() 
    {
    return("c") ;
    }
    
    
    public String titForTatOptimistic()
    {    if (selfMovesList.isEmpty())
        {
        return("c") ;
        }
    else
        {
        //Here we are getting the opponents last move.  We then respond identically to that last move.
        int opponentMovesListSize = opponentMovesList.size() ;
        String OpponentLastMove = opponentMovesList.get(opponentMovesListSize - 1) ;
        if (OpponentLastMove.equals("c"))
            {
            return("c") ;
            }
        else 
            {
            return("d") ;
            }
        
        
        }
    }
    
}
