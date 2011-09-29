/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package novelpd;

//import java.util.* ;
/**
 *
 * @author gblais1
 */
public class fabricationMethods 
{

    
    public static void fab2PrisonerMatch()
        {
       int p1 = ScannerMethods.getPChoice(1) ;  //Get user to choose tactic for Prisoner 1
       int p2 = ScannerMethods.getPChoice(2) ;  //Get user to choose tactic for Prisoner 2
        
       int rounds = ScannerMethods.getRounds() ; //Get user to choose # of rounds                            
       
       Prisoner Prisoner1 = fabricationMethods.fabPrisoner(p1) ;  //Made this static. Is that a big deal?
       Prisoner Prisoner2 = fabricationMethods.fabPrisoner(p2) ;  //We make our second prisoner
       
       Judge    dredd     = new Judge() ;                         //We make a judge
       
       for (int i = 0 ; i <= rounds ; i += 1)
            {
            int p1Move = Prisoner1.makeMove() ;
            int p2Move = Prisoner2.makeMove() ;
            dredd.sentenceAndExecute(p1Move, p2Move, Prisoner1, Prisoner2);
            /*System.out.println(Prisoner1.name +  "AGGREGATE SENTENCE:  " + Prisoner1.sentence) ;
            System.out.println(Prisoner2.name +  "AGGREGATE SENTENCE:  " + Prisoner2.sentence) ; */
            }
       
            System.out.println(Prisoner1.name +  " AGGREGATE SENTENCE:  " + Prisoner1.sentence) ;
            System.out.println(Prisoner2.name +  " AGGREGATE SENTENCE:  " + Prisoner2.sentence) ;
       
        }
    
    
    
    
    
    
    
    
    
    
    public static Prisoner fabPrisoner(int selection)
        { 
        if (selection == 1)
            {
            AlwaysCoo Cooper = new AlwaysCoo("Cooper the Cooperator") ;
            return Cooper ;
            }
        if (selection == 2)
            {
            alwaysDef Danny = new alwaysDef("Danny the Defector") ;
            return Danny ;
            }
        if (selection == 3)
            {
            RandomPrisoner Randy = new RandomPrisoner("Random Randy") ;
            return Randy ;
            }
        if (selection == 4)
            {
            t4TO Othello = new t4TO("Optimistic Othello") ;
            return Othello ;
            }
        if (selection == 5)
            {
            t4TP Pauly   = new t4TP("Pessimistic Pauly") ;
            return Pauly ;
            }
        if (selection == 6)
            {
            GerryFU Gerry = new GerryFU("Gerry") ;
            return Gerry ;
            }
        else
            {
            RandomPrisoner CrazyRandy = new RandomPrisoner("Crazy 'This Method's Malfunctionin' Randy") ;
            return CrazyRandy ;
            }
            
        }
    
    

    
    
}
