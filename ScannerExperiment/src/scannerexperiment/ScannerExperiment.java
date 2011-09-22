package scannerexperiment;

public class ScannerExperiment 
{

    public static Void main(String[] args) 
    {

        int numOfRounds = GetInput.getRoundInput() ;                
        String p1Tactic = GetInput.getTactic("player 1") ;
        String p2Tactic = GetInput.getTactic("player 2") ;

    for (int i = 0 ; i <= numOfRounds ; i += 1) 
        {
        //First we create two players
        Prisoner Prisoner1 = new Prisoner() ;
        Prisoner Prisoner2 = new Prisoner() ;        
     
    //Then we create a Judge Object
        Judge dredd = new Judge() ;
    
    //Then we have the judge get input from the two prisoners
        String prisoner1input = dredd.getPrisonerInput(Prisoner1) ;
        String prisoner2input = dredd.getPrisonerInput(Prisoner2) ;
    

//Then we format the prisoners tactics into a single string for the judge, i.e., "cc","cd","dd", or "dc".
        String p1 = prisoner1input.substring(0,1) ;
        String p2 = prisoner2input.substring(0,1) ;
        String jointTactics = p1 + p2 + "buffer_chars";
    
    
//Then we have the judge deliver an untranslated verdict
        String verdict = dredd.returnVerdict(jointTactics) ;
    

//Then we translate and implement the verdict
        if (verdict.equals("zz"))
            {
            Prisoner1.awardPoints(0) ;
            Prisoner2.awardPoints(0) ;
            }
        else if (verdict.equals("ff"))
            {
            Prisoner1.awardPoints(5) ;
            Prisoner2.awardPoints(5) ;
            }
        else if (verdict.equals("t1"))
            {
            Prisoner1.awardPoints(10) ;
            Prisoner2.awardPoints(1) ;
            }
        else if (verdict.equals("1t"))
            {
            Prisoner1.awardPoints(1) ;
            Prisoner2.awardPoints(10) ;
            }
        else 
            {
            System.out.println("Major screwup in implementation ov verdict, line 34 in main") ;
            }
    
        
        
    
        
         
        
        }
    
    
  
    
    
    }
}
