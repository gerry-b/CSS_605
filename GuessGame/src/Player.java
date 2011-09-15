import java.util.ArrayList ;


public class Player
{
	int number = 0;  // where the guess goes
	
	public void guess() 
	{
	number = (int) (Math.random() * 10000) ;
	System.out.println("I'm guessing " + number) ;
	}


	public void addToMemory(int wrongGuess)
	{
	memoryFile.add(wrongGuess)  ;
	}



ArrayList<Integer> memoryFile = new ArrayList<Integer>() ;  //Create a memory file for the smarty to use

	public void smartGuess()
	{
	int theGuess = (int) (Math.random() * 10000) ;

	boolean alreadyGuessed = memoryFile.contains(theGuess) ;
	
	while (alreadyGuessed == true) 
		{
		theGuess = (int) (Math.random() * 10000) ;	
		alreadyGuessed = memoryFile.contains(theGuess) ;
		}
		
	number = theGuess ;  //UPDATE GUESSGAME.JAVA TO REFLECT THAT SMARYTY CAN smartGuess NOW!!!!	
	

	}


}