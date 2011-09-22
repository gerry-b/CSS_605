package rabbitwolfsimulator;


import java.util.* ;

/**
 *
 * @author gblais1
 */
public class RabbitWolfSimulator 
{

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) 
    {
    Rabbit Peter = new Rabbit("Peter") ;
    Rabbit Tiny  = new Rabbit("Tiny") ;
    
    
    ArrayList<Rabbit> Rabbits = new ArrayList<Rabbit>();
    Rabbits.add(Peter) ;
    Rabbits.add(Tiny) ;
    
    Wolf   bigBad = new Wolf()  ;
    Wolf   bigBad2 = new Wolf()  ;
    Wolf   bigBad3 = new Wolf()  ;
    Wolf   bigBad4 = new Wolf()  ;
    Wolf   bigBad5 = new Wolf()  ;
    Wolf   bigBad6 = new Wolf()  ;
    Wolf   bigBad7 = new Wolf()  ;
    Wolf   bigBad8 = new Wolf()  ;
    Wolf   bigBad9 = new Wolf()  ;
    Wolf   bigBad10 = new Wolf()  ;
    
    
    int i = 0 ;
    
    while (Peter.deadOrAlive.equals("ALIVE"))
        {
        
        Peter.fullMove() ;    
        System.out.println(Peter.reportPosition(Peter.xLocation, Peter.yLocation)) ;
        Peter.checkForMax() ;
        
        bigBad.fullMove() ;
        //System.out.println(bigBad.reportPosition(bigBad.xLocation, bigBad.yLocation)) ;
        
        
        //This loop is my attempt to get the Wolves to try to eat any rabbits they see
        for (int P = 0 ; P <= (Rabbits.size() - 1) ; P += 1)   
            {                                                 
            bigBad.eatRabbit(Rabbits.get(P) );
            bigBad2.eatRabbit(Rabbits.get(P) );
            bigBad3.eatRabbit(Rabbits.get(P) );
            bigBad4.eatRabbit(Rabbits.get(P) );
            bigBad5.eatRabbit(Rabbits.get(P) ); 
            }
        
        //This loop tells us every round which rabbits are alive
        for (int P = 0 ; P <= (Rabbits.size() - 1) ; P += 1)   
            { 
                Rabbit theRabbit = Rabbits.get(P) ;
                        {
                        System.out.println(theRabbit.name + "IS ALIVE") ;
                        }
            
            }
        
        
        
        bigBad2.fullMove() ;
        //System.out.println(bigBad2.reportPosition(bigBad2.xLocation, bigBad2.yLocation)) ;
        
        
        bigBad3.fullMove() ;
        //System.out.println(bigBad3.reportPosition(bigBad3.xLocation, bigBad3.yLocation)) ;
        
        
        bigBad4.fullMove() ;
        //System.out.println(bigBad4.reportPosition(bigBad4.xLocation, bigBad4.yLocation)) ;
        
        
        bigBad5.fullMove() ;
     
        
        i += 1 ;
        
        System.out.println("ROUND:  " + i) ;
        
        }
    

    System.out.println("Max X was " + Peter.maxX ) ;
    System.out.println("Max Y was " + Peter.maxX ) ;
    System.out.println("Min Y was " + Peter.minY ) ;
    System.out.println("Max Y was " + Peter.maxY ) ;
    
    if(Peter.deadOrAlive.equals("ALIVE"))
        {
        System.out.println("Rabbit not eaten") ;
        }
    else
        {
        System.out.println("Rabbit eaten!") ;
        }
    
    System.out.println("Finished after " + i + " rounds.") ;
    
    }

}
