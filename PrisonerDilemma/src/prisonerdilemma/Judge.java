
package prisonerdilemma;

/**
 *
 * @author gblais1
 */
public class Judge 
{
       
    public Judge()  //This is the constructor.  Below we can initialize variblaes.
    {
        
    }
       
    
//Create a method to get input from Player 
    	
public String getPrisonerInput(Prisoner prisoner1)
	{
	String prisoner1input = prisoner1.provideRandomResponse() ;
        return prisoner1input ;
	}



//Create a method for the Judge to reach a verdict
//Verdict will come back as a string to be deciphered in Main
public String returnVerdict(String jointTactics)
    {
        String p1 = jointTactics.substring(0,1) ;
        String p2 = jointTactics.substring(1,2) ;
        System.out.println("p1 is " + p1) ;
        System.out.println("p2 is " + p2) ;
                
        String prisoner1input = p1 ;
        String prisoner2input = p2 ;
        
     if (prisoner1input.equals("c") && prisoner2input.equals("c")) 
        {
        return "zz" ; //This "zz" means 0 and 0, the years each inmate will get
        } 
        
    //Next we calculate the scenario in which both players talk and so both receive medium sentences 
     else if (prisoner1input.equals("d") && prisoner2input.equals("d")) 
        {
        return "ff" ; //Means 5 and 5.  Both inmates get 1 year.
        }
   
    //Next we calculate the scenario in which the players have differing responses.
    //The player who remains silent receives a high sentence, the talker receives a minimal sentence.
     else if (prisoner1input.equals("c") && prisoner2input.equals("d"))
        {
        return "t1" ; //P1 gets 1 year for ratting, p2 gets 10 years
        }
    //Now we do the inverse real wuick, in case Prisoner1 was the talker
    else if (prisoner1input.equals("d") && prisoner2input.equals("c")) 
        {
        return "1t" ;
        }
    else
        {
        return"Manjor Screwup" ;
        
        
        }
    }


   
    
    
}
                   
                
                
            
	
    
   
