import java.util.ArrayList; 

public class GameLauncher2 
{
	public static void main(String[] args)
	{
	int tally = 0 ;
	int dumb1 = 0 ;
	int dumb2 = 0 ;
	int smarty = 0 ;
        int screwUp = 0 ;
	
	while (tally < 100) 
	{
	GuessGame game = new GuessGame() ;
	String TheWinner = game.startGame() ;
	
	if (TheWinner.equals("1"))
		{
		dumb1 += 1 ;
		}
        if (TheWinner.equals("2")) 
		{
		dumb2 += 1 ;
		}
		
      if (TheWinner.equals("smarty"))
		{
		smarty +=1 ;
		}
      
      if (TheWinner.equals("screwUp"))
                {
                screwUp += 1 ;
                }
        
        
		
	tally += 1;
	
	}
	
	 System.out.println("\n\n\n") ;
	 System.out.println("Dumb1 has won " + dumb1 + " total games.") ;
	 System.out.println("Dumb2 has won " + dumb2 + " total games.") ;
	 System.out.println("Smarty has won " + smarty + " total games.") ;
         System.out.println("There was a monumental screwup " + screwUp + "times") ;
	System.out.println(tally + " games were played.") ;
		
	
	}



}