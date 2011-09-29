/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package novelpd;

import java.util.* ;

public class RoundRobin 
{

    
    public static ArrayList<String> roundRobin() 
        {
        //-make a Judge
            //Judge Reinhold = new Judge() ;
        //-make six prisoners
            AlwaysCoo Cooper = new AlwaysCoo("Cooper the Cooperator") ;
            alwaysDef Danny = new alwaysDef("Danny the Defector") ;
            RandomPrisoner Randy = new RandomPrisoner("Random Randy") ;
            t4TO Othello = new t4TO("Optimistic Othello") ;
            t4TP Pauly   = new t4TP("Pessimistic Pauly") ;
            GerryFU Gerry = new GerryFU("Gerry") ;
        //-add the 6 prisoners to a prisoner's ArrayList
            ArrayList<Prisoner> PrisonerAL = new ArrayList<Prisoner>() ;
            PrisonerAL.add(Cooper) ;
            PrisonerAL.add(Danny) ;
            PrisonerAL.add(Randy) ;
            PrisonerAL.add(Othello) ;
            PrisonerAL.add(Pauly) ;
            PrisonerAL.add(Gerry) ;
        
       //Create a "Winners" ArrayList where victors can record their names 
            ArrayList<String> victors = new ArrayList<String>() ;
            
            String winner = doBattle(PrisonerAL.get(0), PrisonerAL.get(1), 100) ;
            victors.add(winner) ;
            winner = doBattle(PrisonerAL.get(0), PrisonerAL.get(2), 100) ;
            victors.add(winner) ;
            winner = doBattle(PrisonerAL.get(0), PrisonerAL.get(3), 100) ;
            victors.add(winner) ;
            winner = doBattle(PrisonerAL.get(0), PrisonerAL.get(4), 100) ;
            victors.add(winner) ;
            winner = doBattle(PrisonerAL.get(0), PrisonerAL.get(5), 100) ;
            victors.add(winner) ;
            winner = doBattle(PrisonerAL.get(1), PrisonerAL.get(2), 100) ;
            victors.add(winner) ;
            winner = doBattle(PrisonerAL.get(1), PrisonerAL.get(3), 100) ;
            victors.add(winner) ;
            winner = doBattle(PrisonerAL.get(1), PrisonerAL.get(4), 100) ;
            victors.add(winner) ;
            winner = doBattle(PrisonerAL.get(1), PrisonerAL.get(5), 100) ;
            victors.add(winner) ;
            winner = doBattle(PrisonerAL.get(2), PrisonerAL.get(3), 100) ;
            victors.add(winner) ;
            winner = doBattle(PrisonerAL.get(2), PrisonerAL.get(4), 100) ;
            victors.add(winner) ;
            winner = doBattle(PrisonerAL.get(2), PrisonerAL.get(5), 100) ;
            victors.add(winner) ;
            winner = doBattle(PrisonerAL.get(3), PrisonerAL.get(4), 100) ;
            victors.add(winner) ;
            winner = doBattle(PrisonerAL.get(3), PrisonerAL.get(5), 100) ;
            victors.add(winner) ;
            winner = doBattle(PrisonerAL.get(4), PrisonerAL.get(5), 100) ;
            victors.add(winner) ;
            
            /*  //COME BACK TO THIS LATER.  FIGURE OUT ROUND ROBIN METHOD
            //Create a looping structure where all prisoners battle all other prisoners     
            for(int i = 0 ; i <= (PrisonerAL.size() - 1) ; i +=1)
                {
                Prisoner currentAggressor = PrisonerAL.get(i) ;
                for(int j = 0 ; j <= (PrisonerAL.size() - 1) ; j +=1)
                    {
                    Prisoner currentDefender = PrisonerAL.get(j) ;        //Now we've selected two prisoners
                    if (!currentAggressor.name.equals(currentDefender.name))   //We make sure it's not same prisoner twice
                        {
                        String winner = doBattle(currentAggressor, currentDefender, 100) ;
                        victors.add(winner) ;
                        }
                    }
                }
            */
            
            
            return victors ;
            
        }
    
    
    
    
    
    
    
    public static String doBattle(Prisoner prisoner1 , Prisoner prisoner2, int numRounds) 
        {
            Judge Reinhold = new Judge() ;
            prisoner1.sentence = 0 ;                //Set prisoners scores to0
            prisoner2.sentence = 0 ;
            
            for (int i = 0 ; i <= numRounds ; i += 1)
                {
                    int p1Move = prisoner1.makeMove() ;
                    int p2Move = prisoner2.makeMove() ;
                    Reinhold.sentenceAndExecute(p1Move, p2Move, prisoner1 , prisoner2) ;
                }
            if (prisoner1.sentence < prisoner2.sentence)
                {
                return prisoner1.name ;
                }
            else if (prisoner2.sentence < prisoner1.sentence) 
                {
                return prisoner2.name ;
                }
            else
                {
                return ("either a tie or an error") ;
                }
            
        
        }
}
