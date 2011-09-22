
package pd2;

import java.util.Scanner ;

public class PD2 
{

    
    public static void main(String[] args) 
    {
        //Find out what strategy the user wants Prisoner 1 to employ
        String prisoner1Tactic = getTactic("prisoner 1") ;
        String prisoner2Tactic = getTactic("prisoner 2") ;
        
        int numOfRounds = getRoundInput() ;
        System.out.println(numOfRounds) ;
        
        //Now we create our prisoners
        Prisoner Prisoner1 = new Prisoner() ;
        Prisoner Prisoner2 = new Prisoner() ; 
        
        //Now we assign the prisoners their tactics
       
        
        
        //Now we create out Judge
        Judge dredd = new Judge() ;
        
        
        //Now we start the for loop where the magic happens
 
    for (int i = 1; i <= numOfRounds ; i += 1) 
        {
    
        //First we solicit player 1 move
        String p1Move = determineP1Move(prisoner1Tactic , Prisoner1) ;
        
        //Next we solicit player 2's move
        String p2Move = determineP2Move(prisoner2Tactic , Prisoner2) ;
        
        //Then we deliver those moves to the Judge for a verdict
        String verdict = Judge.returnVerdict(p1Move , p2Move) ;
        System.out.println("The verdict is " + verdict) ;
        //Then we decipher the verdict
        if (verdict.equals("00"))
        {
        Prisoner1.awardPoints(0) ;
        Prisoner2.awardPoints(0) ;
        }
        else if (verdict.equals("55"))
        {
        Prisoner1.awardPoints(5) ;
        Prisoner2.awardPoints(5) ;
        }
        else if (verdict.equals("10-1"))
        {
        Prisoner1.awardPoints(10) ;
        Prisoner2.awardPoints(1) ;
        }
        else if (verdict.equals("1-10"))
        {
        Prisoner1.awardPoints(1) ;
        Prisoner2.awardPoints(10) ;
        }
        else 
        {
        System.out.println("Major screwup in implementation ov verdict, line 34 in main") ;
        }
        
        //Then we update everyone's array lists
        Prisoner1.selfMovesList.add(p1Move) ;
        Prisoner1.opponentMovesList.add(p2Move) ;
        Prisoner2.selfMovesList.add(p2Move) ;
        Prisoner2.opponentMovesList.add(p1Move) ;
        
        System.out.println("In round " + i + " Prisoner 1 has played " + p1Move ) ;
        System.out.println("In round " + i + " Prisoner 2 has played " + p2Move ) ;
        System.out.println("In round " + i + " Prisoner 1's aggregate prison sentence is " + Prisoner1.returnPoints() + " years.") ;
        System.out.println("In round " + i + " Prisoner 2's aggregate prison sentence is " + Prisoner2.returnPoints() + " years." ) ;
        
        }
    
    System.out.println("\n\n") ;
    
    System.out.println("Prisoner 1 used " + prisoner1Tactic + ".") ;
    System.out.println("Prisoner 2 used " + prisoner2Tactic + ".") ;
    
    if(Prisoner2.returnPoints() > Prisoner1.returnPoints())
        {
        System.out.println("Prisoner 1 has the greater strategy") ;
        }
    else if (Prisoner2.returnPoints() < Prisoner1.returnPoints())
        {
        System.out.println("Prisoner 2 had the greater strategy") ;
        }
    else
        {
        System.out.println("It was a tie") ;
        }
        
    
    }
       
        
        
   
    
 
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //STATIC METHODS
    
    
    //This method translates the Judge's sentencings
    //Then we translate and implement the verdict
    
    
    //Determine Prisoner 2 Move
    public static String determineP2Move(String prisoner2Tactic, Prisoner Prisoner2)
        {
        if (prisoner2Tactic.equals("RANDOM"))
            {
            String P2Move = Prisoner2.provideRandomResponse() ;
            return P2Move ;
            }
        else if (prisoner2Tactic.equals("ALWAYS COOPERATE"))
            {
            //String P2Move = Prisoner2.provideAlwaysCoopResponse() ;
            return "c" ;
            }
        else if (prisoner2Tactic.equals("ALWAYS DEFECT"))
            {
            //String P2Move = Prisoner2.provideAlwasDefResponse() ;
            return "d" ;
            }
        else if (prisoner2Tactic.equals("OPTIMISTIC TIT-FOR-TAT"))
            {
            String P2Move = Prisoner2.titForTatOptimistic() ;
            return P2Move ;
            }
        else
            {
            return("MAJOR SCREWUP.  SOURCE:  determineP1Move method") ;
            }
        }
    
    
    //Determine Prisoner 1 Move

   
    
    public static String determineP1Move(String prisoner1Tactic, Prisoner Prisoner1)
        {
        if (prisoner1Tactic.equals("RANDOM"))
            {
            String P1Move = Prisoner1.provideRandomResponse() ;
            return P1Move ;
            }
        else if (prisoner1Tactic.equals("ALWAYS COOPERATE"))
            {
            //String P1Move = Prisoner1.provideAlwaysCoopResponse() ;
            return "c" ;
            }
        else if (prisoner1Tactic.equals("ALWAYS DEFECT"))
            {
            //String P1Move = Prisoner1.provideAlwasDefResponse() ;
            return "d" ;
            }
        else if (prisoner1Tactic.equals("OPTIMISTIC TIT-FOR-TAT"))
            {
            String P1Move = Prisoner1.titForTatOptimistic() ;
            return P1Move ;
            }
        else
            {
            return("MAJOR SCREWUP.  SOURCE:  determineP1Move method") ;
            }
        }
    
    
    public static int getRoundInput()
	{
		Scanner in = new Scanner(System.in) ;
		System.out.print("How many rounds should the strategies compete?     ") ; //Display prompt
		int rounds = in.nextInt() ;
		
                return rounds ;
	}
    
    
    
    
    public static String getTactic(String nameToUse)
	{
		Scanner in = new Scanner(System.in) ;
		System.out.println("\nWhat tactic should " + nameToUse + " employ?     ") ;
                System.out.println("Type '1' for the RANDOM strategy.");
                System.out.println("Type '2' for the ALWAYS COOPERATE strategy.");
                System.out.println("Type '3' for the ALWAYS DEFECT strategy.");
                System.out.println("Type '4' for OPTIMISTIC TIT-FOR-TAT strategy.\n");
                
                        
		int tactic = in.nextInt() ;
                String tacticName = "intialized";
		if (tactic == 1)
                    {
                    tacticName = "RANDOM" ;
                    }
                if (tactic == 2)
                    {
                    tacticName = "ALWAYS COOPERATE" ;
                    }
                if (tactic == 3)
                    {
                    tacticName = "ALWAYS DEFECT" ;
                    }
                if (tactic == 4)
                    {
                    tacticName = "OPTIMISTIC TIT-FOR-TAT" ;
                    }
              
                return tacticName;
	}
    
}
