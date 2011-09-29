/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package novelpd;

/**
 *
 * @author gblais1
 */
public class Judge 
{

    public Judge()  //This is my constructor.  Made it blind.  Hope I did it right.
    {
        
    }
    
    public void sentenceAndExecute(int p1Move, int p2Move, Prisoner prisoner1 , Prisoner prisoner2)
        {
        String verdict = this.declareVerdict(p1Move , p2Move) ;
        executePunishment(prisoner1 , prisoner2, verdict) ;
        }
    
    
    
    public String declareVictor(Prisoner P1, Prisoner P2)
        {
        if (P1.sentence < P2.sentence)
            {
            return P1.name ;
            }
        else if (P2.sentence < P1.sentence)
            {
            return P2.name ;
            }
        else if (P2.sentence == P1.sentence)
            {
            return "tie" ;
            }
        else
            {
            return "error" ;
            }
        }
    
    
    
    
    public String declareVerdict(int P1Move , int P2Move) //0 = Defect , 1 = Cooperate
    {
    if (P1Move == 0 && P2Move == 0) //Defect/Defect scenario
        {
        return("33") ;
        }
    else if (P1Move == 1 && P2Move == 1) //Cooperate/Coperate scenario
        {
        return("11") ;
        }
    else if (P1Move == 1 && P2Move == 0) //Cooperate/Defect scenario
        {
        return("50") ;
        }
    else if (P1Move == 0 && P2Move ==1) //Defect/Cooperate scenario
        {
        return("05") ;
        }
    else 
        {
        return("major screwup") ;
        }    
    }
    
    
    
    
    public void executePunishment(Prisoner prisoner1 , Prisoner prisoner2, String verdict)
        {
            
        if (verdict.equals("33"))
            {
            prisoner1.sentence += 3 ;      //this increases the actual aggregate int sentence
            prisoner1.sentences.add(3) ;   //this adds the 3 integer to the arrayList of sentences
            prisoner2.sentence += 3 ;
            prisoner2.sentences.add(3) ;
            }
        if (verdict.equals("11"))
            {
            prisoner1.sentence += 1 ;      //this increases the actual aggregate int sentence
            prisoner1.sentences.add(1) ;   //this adds the 3 integer to the arrayList of sentences
            prisoner2.sentence += 1 ;
            prisoner2.sentences.add(1) ;
            }
        if (verdict.equals("05"))
            {
            prisoner1.sentence += 0 ;      //this increases the actual aggregate int sentence
            prisoner1.sentences.add(0) ;   //this adds the 3 integer to the arrayList of sentences
            prisoner2.sentence += 5 ;
            prisoner2.sentences.add(5) ;
            }
        if (verdict.equals("50"))
            {
            prisoner1.sentence += 5 ;      //this increases the actual aggregate int sentence
            prisoner1.sentences.add(5) ;   //this adds the 3 integer to the arrayList of sentences
            prisoner2.sentence += 0 ;
            prisoner2.sentences.add(0) ;
            }
        }
    
    
    
}
