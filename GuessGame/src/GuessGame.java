import java.util.ArrayList ;
 

public class GuessGame 
{
	Player dumb1  ;
	Player dumb2 ;
	Player smarty ;
        
	public String startGame() 
        {
	dumb1 = new Player() ;
	dumb2 = new Player() ;
	smarty = new Player() ;
	
	int guessDumb1 = 0 ;
	int guessDumb2 = 0 ;
	int guessSmarty = 0 ;
	
	//Create a round variable that will indicate how many rounds of the game have been played
	int round = 1 ;
	
	boolean dumb1isRight = false ;
	boolean dumb2isRight = false ;
	boolean smartyisRight = false ;
	
	int targetNumber = (int) (Math.random() * 10000) ;
	//System.out.println("I'm thinking of a number between 0 and 10,000 . . . ") ;
	
	//This is where the loop begins
	while(true) 
		{
		//System.out.println("Number to guess is " + targetNumber) ;
		
		dumb1.guess() ;
		dumb2.guess() ;
		smarty.smartGuess() ;
		
		guessDumb1 = dumb1.number ;
		//System.out.println("Player 1 guessed " + guessDumb1) ;
		
		guessDumb2 = dumb2.number ;
		//System.out.println("Player 2 guessed " + guessDumb2) ;
		
		guessSmarty = smarty.number ;
		//System.out.println("PLayer 3guessed " + guessSmarty) ;
		
		round += 1 ;
		
		if (guessDumb1 == targetNumber) 
			{
			dumb1isRight = true ;
			}
		if (guessDumb2 == targetNumber) 
			{
			dumb2isRight = true ;
			}
		if (guessSmarty == targetNumber) 
			{
			smartyisRight = true ;
			}
			
		if (guessSmarty != targetNumber)  //THIS IS WHERE WE GIVE SMARTY HIS SMARTS.
			{							 //SMARTY CAN REMEMBER HIS WRONG GUESSES AND NOT REPEAT THEM
				smarty.addToMemory(guessSmarty) ;	
				//System.out.println(smarty.memoryFile) ;   //Slows it down too much to print each time
			}
		
		
		if (dumb1isRight || dumb2isRight || smartyisRight) 
			{
			//System.out.println("\n\n\nWe have a winner!") ;
			//System.out.println("Dumb1 got it right? " + dumb1isRight) ;
			//System.out.println("Dumb2 got it right? " + dumb2isRight) ;
			//System.out.println("Smarty got it right? " + smartyisRight) ;
			//System.out.println("It only took " + round + " rounds.") ;
			
			
			break ;
			}
		else
			{
			System.out.println("Players will have to go another round.") ;
			}
			
			
                }	
		
			
	if (dumb1isRight == true)
				{
				return("1") ;
				}
    
        else if (dumb2isRight == true)
				{
				return("2") ;
				}
    
        else if (smartyisRight == true)
				{
				return("smarty") ;
				}
        
        else
            {
            return("screwUp");
            }
        
                

	
	}

        
}
