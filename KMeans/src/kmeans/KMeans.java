/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans;

import java.util.* ;




public class KMeans 
{

    public static void main(String[] args) 
    {
    String result = doIt() ;
    System.out.println(result) ;
    
    }
/*
    {
        
      // Here we make a list of x,y coordinates to work with
      ArrayList<point> pointList = makePoints();
     
      
      //Here we create a measurer object
      Measurer M = new Measurer(pointList) ;
      
      //Measurer object chooses 3 random metroids
      ArrayList<point> Centroids = M.chooseRandomCentroids(pointList) ;
      
      
      //Initialized an ArrayList to use later to hold energies
      ArrayList<Integer> energies = new ArrayList<Integer>() ;  
      
      
      
      
      for (int i = 0 ; i <= (pointList.size() - 1) ; i +=1)
        {
            point currentPoint = pointList.get(i) ;
            
            int energy = M.calculateEnergy(currentPoint , Centroids) ;
            
            energies.add(energy) ;  
        }
        
      
      int aggSum = calcAggEnergy(energies) ;
      
      System.out.println(aggSum) ;
        
    }
    
    */
    
    
    
    
  
    
    
    
    public static String doIt()
        {
        //initialize a lowest energy     
        int lowestEnergy = 10000 ; 
        int highestEnergy = 0 ;
        ArrayList optimalCentroids ; 
        ArrayList worstCentroids ;
            
        // Here we make a list of x,y coordinates to work with
      ArrayList<point> pointList = makePoints();
      
      //Here we create a measurer object
      Measurer M = new Measurer(pointList) ;
      
      //decide how many rounds we want      
      int desiredRounds = 100 ;
      
      //initialize the round
      int round = 1 ;
      
      
      for (int i = 0 ; i <= desiredRounds ; i +=1)
        {
            //Measurer object chooses 3 random metroids
            ArrayList<point> Centroids = M.chooseRandomCentroids(pointList) ;
            //Initialized an ArrayList to use later to hold energies
            ArrayList<Integer> energies = new ArrayList<Integer>() ;
            
            for (int j = 0 ; j <= (pointList.size() - 1) ; j +=1)
            {
                point currentPoint = pointList.get(i) ;
            
                int energy = M.calculateEnergy(currentPoint , Centroids) ;
            
                energies.add(energy) ; 
                
                int aggSum = calcAggEnergy(energies) ;
      
                System.out.println("In round " + round + " our energy was " + aggSum) ;
                
                if (aggSum < lowestEnergy)
                    {
                    lowestEnergy = aggSum ;
                    optimalCentroids = Centroids ;
                    }
                if (aggSum > highestEnergy)
                    {
                    highestEnergy = aggSum ;
                    worstCentroids = Centroids ;
                    
                    round += 1 ;
                    }
            }
        
            
      
      
      
        }
      
            return("The lowest energy was " + lowestEnergy) ;  
      
      
        }
    
    
    
    
    
    
    
    
    
    public static int calcAggEnergy(ArrayList<Integer> AL)
        {      
        int aggSum = 0 ;
        for (int i = 0 ; i <= AL.size() - 1; i += 1)
            {
            aggSum += AL.get(i) ;
            }
        return(aggSum) ;
        }
    
    
    
    public static ArrayList<point> makePoints()   //How do I put this in another class and still have it work?
            
		{
		//create a place to keep points
        ArrayList<point> pointList = new ArrayList<point>();
        
        
        //create some points to put in the list (these will be the regular populatins, normal ascending)
        for (int i = 0; i <= 20 ; i +=1)
            {
            point dronePoint = new point("normal" , i , i) ;
            pointList.add(dronePoint) ;
            }
        
        //create the lottery winners (bunched up in top left corner)
        for (int i = 20 ; i >= 15 ; i -= 1)
            {
            int randomNum = (int) (Math.random() * 5) ;
            point lotteryWinner = new point("lotto winner" , randomNum , i ) ;
            pointList.add(lotteryWinner) ;
            }
        
        //now we create the English professors
        for (int i = 20 ; i >= 15 ; i -= 1)
            {
            int randomNum = (int) (Math.random() * 5) ;
            point lotteryWinner = new point( "English Professor" , i , randomNum ) ;
            pointList.add(lotteryWinner) ;
            }
        
        
                    
                    
                    
    return pointList ;
    
    }
    
    
    
}
