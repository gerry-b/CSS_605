/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerexperiment;

import java.util.ArrayList ;

/**
 *
 * @author gblais1
 */
public class Prisoner
//In this class we provide the methods for different types of prisoners to provide different 
//types of responses.  
// 1's represent Cooperate, 0's represent Defection

{
    public Prisoner()
    
            
    {
        /* 
         we provide the prisoner an ArrayList of outcomes and of past moves 
         from which to base strategy
         */
//        ArrayList<String> outcomeList = new ArrayList<String>();
  //      ArrayList<String> pastMovesList = new ArrayList<String>();
        
        
    }
    ArrayList<String> outcomeList = new ArrayList<String>();
    ArrayList<String> myPastMovesList = new ArrayList<String>();
    ArrayList<String> opponentPastMovesList = new ArrayList<String>() ;
    //provide the prisoner a score variable
    public static int score = 0 ;
    
    
    
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
    
    
    
    
    //Below are our strategies, represented as methods
    
    
    
    
    //Here we have the Optimistic Tit For Tat Strategy
    public String titForTatOptimistic()
    {
    if (myPastMovesList.size() == 0)
        {
        return("cooperate") ;
        }
    else
        {
        //Here we are getting the opponents last move.  We then respond identically to that last move.
        int opponentPastMovesListSize = opponentPastMovesList.size() ;
        String OpponentLastMove = opponentPastMovesList.get(opponentPastMovesListSize - 1) ;
        if (OpponentLastMove.equals("cooperate"))
            {
            return("cooperate") ;
            }
        else 
            {
            return("defect") ;
            }
        
        
        }
    }
    
    
    
    //This method represents the "random" strategy
    public String provideRandomResponse()
    {
        int randomN = (int) (Math.random() * 2) ;
        if (randomN == 1)
            {
            return("cooperate") ;
            }
        else
            {
            return("defect") ;
            }
      
    }
    
    //This method represents the "always cooperate" strategy.
    public String provideAlwaysCoopResponse() 
    {
    return("cooperate") ;
    }
    
    
    //This method represents the "always defect" strategy
    public String provideAlwasDefResponse()
    {
    return ("defect") ;
    }
    
    
    
    
}
