/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package novelpd;

import java.util.* ;
/**
 *
 * @author gblais1
 */
public class ScannerMethods 
{

    public static int chooseGameType()
        {
        Scanner in = new Scanner(System.in) ;
        System.out.println("\nDo you want a single matchup or a Round Robin tournament?") ;
        System.out.println("Enter '1' for a single player matchup or '2' for a Round Robin tournament.") ;
        int gameType = in.nextInt() ;
        return gameType ;
        }
    
    
    
    
    public static int getPChoice(int Prisoner)
        {
        Scanner in = new Scanner(System.in) ;
        System.out.println("\nPlease choose the tactic for Prisoner " + Prisoner + ".") ;
        System.out.println("Enter '1' to choose ALWAYS COOPERATE.") ;
        System.out.println("Enter '2' to choose ALWAYS DEFECT.")    ;
        System.out.println("Enter '3' to choose RANDOM.")             ;
        System.out.println("Enter '4' to choose Optimistic Tit-For-Tat.") ;
        System.out.println("Enter '5' to choose Pessimistis Tit-For-Tat.") ;
        System.out.println("Enter '6' to choose GerryFu.") ;
        System.out.println("\n") ;
        int tactic = in.nextInt() ;
        return tactic ;
                
        }
  
    public static int getRounds()
        {
        Scanner in = new Scanner(System.in) ;
        System.out.println("\nHow many rounds would you like the Prisoners to be subjected to?") ;
        System.out.println("\n") ;
        int rounds = in.nextInt() ;
        return rounds ;
        }
    
    
    
      
}
