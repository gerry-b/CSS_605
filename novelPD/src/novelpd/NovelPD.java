
package novelpd;
import java.util.* ;


public class NovelPD 
{

   
    public static void main(String[] args) 
    
    {
        
       int gameType = ScannerMethods.chooseGameType();  //First we have the user choose the game type
       
       if (gameType == 1)
            {
            fabricationMethods.fab2PrisonerMatch() ;
            }
       if (gameType == 2)
            {
            ArrayList<String> Victors = RoundRobin.roundRobin() ;
            System.out.println(Victors.size()) ;
            System.out.println(Victors) ;
            }
       
     
        
    }
    
    
}



