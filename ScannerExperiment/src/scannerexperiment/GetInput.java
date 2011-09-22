/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerexperiment;


import java.util.Scanner ;
/**
 *
 * @author gblais1
 */
public class GetInput 
{
        
    public static int getRoundInput()
	{
		Scanner in = new Scanner(System.in) ;
		System.out.print("How many rounds should the strategies compete?     ") ; //Display prompt
		int rounds = in.nextInt() ;
		
		System.out.println("\nYou have selected " + rounds + " rounds.") ;
                return rounds ;
	}
    
    
    public static String getTactic(String nameToUse)
	{
		Scanner in = new Scanner(System.in) ;
		System.out.println("\nWhat tactic should " + nameToUse + " employ?     ") ;
                System.out.println("Type '1' for the RANDOM strategy.");
                System.out.println("Type '2' for the ALWAYS COOPERATE strategy.");
                System.out.println("Type '3' for the ALWAYS DEFECT strategy.");
                        
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
                
		System.out.println("\nYou have selected the " + tacticName + " strategy for " + nameToUse) ;
                return tacticName;
	}
    
    
}


