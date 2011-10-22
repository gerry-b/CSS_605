/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans4;

import java.util.* ;

public class KMeans4 
{

    
    
    
    
    
    
    public static void main(String[] args) 
    {
    ArrayList<Point> pointList = new ArrayList<Point>() ; //This will hold our points
            
    int pointNum = 10 ;
            
    for (int i = 0 ; i <= pointNum ; i += 1 )     //This will make our regular points
        {
        Point newPoint = new Point(i , i) ;
        pointList.add(newPoint) ; 
        }    
    
    for (int i = 0 ; i <= pointNum ; i += 1)     //This will make the first 5 of our English professors
        {
        double x = 10 ;
        double y = 2 ;
        Point newPoint = new Point( x , y) ;
        pointList.add(newPoint) ;
        }
    
    for (int i = 0 ; i <= pointNum ; i += 1)     //This will make the second 5 of our English professors
        {
        double x = 10 ;
        double y = 4 ;
        Point newPoint = new Point( x , y) ;
        pointList.add(newPoint) ;
        }
        
    for (int i = 0 ; i <= pointNum ; i += 1)     //This will the first 5 of our lotto winners
        {
        double y = 10 ;
        double x = 2 ;
        Point newPoint = new Point(x , y) ;
        pointList.add(newPoint) ;
        }
    
    for (int i = 0 ; i <= pointNum ; i += 1)     //This will the second 5 of our lotto winners
        {
        double y = 10 ;
        double x = 3 ;
        Point newPoint = new Point(x , y) ;
        pointList.add(newPoint) ;
        }
        
                
       
    DistMeasDev testBot = new DistMeasDev(pointList) ;   //This is our distance measuring device
    ArrayList<Result> RL = new ArrayList<Result>() ;     //This is where we'll hold all our answers
    
    
    //Here's our main loop where we'll get all our results
    for (int i = 0 ; i <= 1000 ; i += 1)
        {
        Result manResult = testBot.calcNAddEnergies("M") ;
        Result eucResult = testBot.calcNAddEnergies("E") ;
        Result sEucResult = testBot.calcNAddEnergies("SE") ;
        
        RL.add(manResult)   ;
        RL.add(eucResult)   ;
        RL.add(sEucResult)  ;
        }
    
    
    System.out.println("We went through " + ((RL.size()) / 3) + " simulations to get these results") ;  //Checks to make sure results are going into RL
    //Below we'll create a result interpreter object and interpret our results
    ResultInterpreter RI = new ResultInterpreter(RL) ;  //We feed the results interpreter our results list (RL)
    
    String EucAnswer = RI.findBestEuc() ;
    String ManAnswer = RI.findBestMan() ;
    String SEucAnswer = RI.findBestSEuc() ;
    
    System.out.println(EucAnswer) ;
    System.out.println(ManAnswer) ;
    System.out.println(SEucAnswer) ;
    
    
    
        
        
        
    }
    
    
    
    
}
