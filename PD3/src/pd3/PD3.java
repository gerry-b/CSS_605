
package pd3;
/**
 *
 * @author gblais1
 */
import java.util.* ;

public class PD3 
{

    public static void main(String[] args) 
    {
        
        ArrayList<Integer> UserPref = getUserSetupPref() ; //This is where the user chooses player tactics
        
        
        int prisoner1Choice = getUserChoice(UserPref , 0) ;  //the 0 is the spot in the UserPref ArrayList to use
        int prisoner2Choice = getUserChoice(UserPref , 1) ;  //this is another step in creating the players
        
        Prisoner prisoner1 = createPrisoner(prisoner1Choice , 1) ; //the round ("1") is a signal to method so names don't double
        Prisoner prisoner2 = createPrisoner(prisoner2Choice , 2) ; //this is the final step in creating the prisoners
        
        Judge dredd = new Judge() ;  //we create a judge
        
        int rounds = getUserInputRounds() ;  //we ask the user how many rounds the match should go
        
        //here's our experiment cycle in which the actual Prisoners Dilemma (PD) runs
        for (int i = 0 ; i <= rounds ; i += 1)
            {
                int prisoner1move = prisoner1.makeMove(i) ; //Prisoner 1 makes a move
                int prisoner2move = prisoner2.makeMove(i) ; //Prisoner 2 makes a move
                
        System.out.println("\nIn round " + i + "prisoner 1 has chosen " + prisoner1move) ;  //Print the moves
        System.out.println("In round " + i + "prisoner 2 has chosen " + prisoner2move) ;
        
        String theVerdict = dredd.returnVerdict(prisoner1move , prisoner2move) ;  //Give the moves to judge for verdict
        awardPoints(prisoner1, prisoner2, theVerdict) ;
        
        String roundStats = printScores(prisoner1 , prisoner2 , i) ;  //These 2 lines are where we print out round stats
        System.out.println(roundStats) ;
        //String score = printScores(prisoner1, prisoner2, i) ;
        //System.out.println(score) ;
            }
        
        if (prisoner1.score > prisoner2.score)
            {
            System.out.println("The winner is " + prisoner2) ;
            }
        else if (prisoner1.score < prisoner2.score)
            {
            System.out.println("The winner is " + prisoner1) ;
            }
        else    
                {
                System.out.println("It was a tie") ;
                }
    
            
        
        
    }
    
    
    
    public static String returnResults(Prisoner prisoner1 , Prisoner prisoner2)
        {
            String results = "\nFINAL RESULTS" ;
            //String p1Strategy = "\nPrisoner 1 used " + prisoner1.tactic ; 
            //String p2Strategy = "\nPrisoner 2 used " + prisoner2.tactic ;
            String victor = "initiated" ;
            
        if (prisoner1.score > prisoner2.score)
            {
            victor = "Prisoner 2" ;
            }
        else if (prisoner1.score < prisoner2.score)
            {
            victor = "Prisoner 1" ;
            }
        else
            {
            victor = "No victor.  It was a tie." ;
            }
        String combined = results + /*p1Strategy + p2Strategy + */ victor ;
        return combined ; 
        
        }
    
    
    public static String getStats(Prisoner prisoner1 , Prisoner prisoner2, int round) 
        {
        int p1Score = prisoner1.score ;
        int p2Score = prisoner2.score ;
        String rStats = "\nROUND " + round + " STATS:" ;
        String p1 = "\nP1 SCORE: " + p1Score ;
        String p2 = "\nP2 SCORE: " + p2Score ;
        String allE = rStats + p1 + p2 ;
        return allE ;
        }
    
    
    public static String printScores(Prisoner prisoner1 , Prisoner prisoner2, int round) 
        {
        String cRound = ("\nROUND:  " + round) ;    
        String p1Score = ("\nPrisoner 1 Current Score:  " + prisoner1.score) ;
        String p2Score = ("\nPrisoner 2 Current Score:  " + prisoner2.score) ;
        String p1LM    = ("\nPrisoner 1 last sentence:  " + prisoner1.lastSentence) ;
        String p2LM    = ("\nPrisoner 2 last sentence:  " + prisoner2.lastSentence) ;
        String score = cRound + p1Score + p1LM + p2Score + p2LM ;
        return score ;
        }
    
    
    public static int getUserInputRounds()
        {
        Scanner in = new Scanner(System.in) ;
        System.out.println("How many rounds do you want this contest to run?") ;
        int rounds = in.nextInt() ;
        return rounds ;
        }
    
   
    public static void awardPoints(Prisoner prisoner1, Prisoner prisoner2 , String verdict) 
    {
    if (verdict.equals("DD"))
            {
            prisoner1.score += 3 ;
            prisoner1.lastSentence = 3;
            prisoner2.score += 3 ;
            prisoner2.lastSentence = 3;
            } 
    else if (verdict.equals("CC"))
            {
            prisoner1.score += 1 ;
            prisoner1.lastSentence = 1;
            prisoner2.score += 1 ;
            prisoner2.lastSentence = 1;
            }
    else if (verdict.equals("CD"))
            {
            prisoner1.score += 5 ;
            prisoner1.lastSentence = 5;
            prisoner2.score += 0 ;
            prisoner2.lastSentence = 0;
            }
    else if (verdict.equals("DC"))
            {
            prisoner1.score += 0 ;
            prisoner1.lastSentence = 0;
            prisoner2.score += 5 ;
            prisoner2.lastSentence = 5;
            }
    }
    
    
    
    public static ArrayList<Integer> getUserSetupPref()     //Is it cool that I made this static?
    {
    System.out.println("Welcome to the Prisoners Dilemma.") ;
    System.out.println("Please choose a strategy for player 1.") ;
    Scanner in = new Scanner(System.in) ;
    System.out.println("Type (1) for Manual.") ;
    System.out.println("Type (2) for Random.") ;
    System.out.println("Type (3) for Optimistic Tit-For-Tat.") ;
    System.out.println("Type (4) for Pessimistic Tit-For-Tat.") ;
    System.out.println("Type (5) for Always Cooperate") ;
    System.out.println("Type (6) for Always Defect") ;
    System.out.println("Type (7) for Gerry-Fu.") ;
    int response = in.nextInt() ;
    
    System.out.println("Please choose a strategy for player 1.") ;
    System.out.println("Type (1) for Manual.") ;
    System.out.println("Type (2) for Random.") ;
    System.out.println("Type (3) for Optimistic Tit-For-Tat.") ;
    System.out.println("Type (4) for Pessimistic Tit-For-Tat.") ;
    System.out.println("Type (5) for Always Cooperate") ;
    System.out.println("Type (6) for Always Defect") ;
    System.out.println("Type (7) for Gerry-Fu.") ;
    int response2 = in.nextInt() ;
    
    ArrayList<Integer> prisonerSetup = new ArrayList<Integer>();
    
    prisonerSetup.add(response)  ;
    prisonerSetup.add(response2) ;
    
    
    return prisonerSetup ;
        
    }
    
    
    public static int getUserChoice(ArrayList<Integer> ArrayList , int spotInList) //Is it cool that I made this static?
        {
        int PrisonerChoice = ArrayList.get(spotInList) ;
        return PrisonerChoice ;    
        }
    
    
   
      //Think there's a problem with scope.  Think these prisoners only exist inside this method.
    public static Prisoner createPrisoner(int choice, int round)  //Is it cool that I made this static?
    {
        if(choice == 1 && round == 1)
            {
            Prisoner Manny = new manualPrisoner() ;
            return Manny ;
            }
        if(choice == 1 && round == 2)
            {
            Prisoner Manny2 = new manualPrisoner() ;
            return Manny2 ;
            }
        else if(choice == 2 && round == 1)
            {
            Prisoner Randy = new randomPrisoner() ;
            return Randy ;
            }
        else if(choice == 2 && round == 2)
            {
            Prisoner Randy2 = new randomPrisoner() ;
            return Randy2 ;
            }
        else if (choice == 3 && round ==1)
            {
            Prisoner Optimus = new OTT() ;
            return Optimus ;
            }
        else if (choice == 3 && round == 2)
            {
            Prisoner Othello = new OTT() ;
            return Othello ;
            }    
            
        else
            {
            Prisoner ERROR = new randomPrisoner() ;
            return ERROR ;
            }
            
         
    }
    
    
    
    
    
    
    
    
}
