/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans3;

import java.util.* ;


public class DistMeasDev 
{

    ArrayList<Point> pointList ;
    
    public DistMeasDev(ArrayList<Point> AL)
    {
        this.pointList = AL ;
    }
    
    
    //This is the big method where we put everything together
    
    
    
    public int findRunTime(ArrayList<Point> AL) //Decided appropriate number of rounds to run program
    {                                           //Should put more thought into this later
        int numOfRounds = AL.size() * 100 ;
        return numOfRounds ;
    
    }
    
    
    public Result calcNAddEnergies()
    {
        int aggEnergy  = 0 ;  //A sentinel value we'll use later to hold the aggregate energy for these 3 centroids
        
        //first we get 3 centroids
        ArrayList<Point> CentroidList = chooseCentroids() ;
        Point Centroid1 = CentroidList.get(0) ;
        Point Centroid2 = CentroidList.get(1) ;
        Point Centroid3 = CentroidList.get(2) ;
        
        //Now we go through pointList finding energies for each point
        for (int i = 0; i <= (pointList.size() - 1) ; i += 1)
            {
            Point currentPoint = pointList.get(i) ;
            int centroid1Energy = calcMannyhannyDist(currentPoint , Centroid1) ;
            int centroid2Energy = calcMannyhannyDist(currentPoint , Centroid2) ;
            int centroid3Energy = calcMannyhannyDist(currentPoint , Centroid3) ;
        
            //Now we put Centroid energies in an AL so we can find lowest
            ArrayList<Integer> AL = new ArrayList<Integer>() ;
            AL.add(centroid1Energy) ;
            AL.add(centroid2Energy) ;
            AL.add(centroid3Energy) ;
            //Now we find the lowest energy for that point
            int lowestEnergy = determineLowestEnergy(AL) ;
            //Now we add that lowest energy for that point to our aggregate energy
            aggEnergy += lowestEnergy ;
            }
        
        
        /*  Experimenting with returning a Result object instead of a String.  Not using this stuff for now.
        String energy    = "ENERGY:  " + aggEnergy ;
        String cent1S = ("\nCentroid 1:  " + Centroid1.x + "," + Centroid1.y ) ;
        String cent2S = ("\nCentroid 2:  " + Centroid2.x + "," + Centroid2.y ) ;
        String cent3S = ("\nCentroid 1:  " + Centroid3.x + "," + Centroid3.y ) ;
        String bigString = energy + cent1S + cent2S + cent3S ;
        */
        Result thisResult = new Result(CentroidList , aggEnergy) ;
        
        return thisResult ;
        
        
    }
     
     
    
    public int determineLowestEnergy(ArrayList<Integer> AL)
        {
            int lowestEnergy = 0 ;
            int energy1 = AL.get(0) ;
            int energy2 = AL.get(1) ;
            int energy3 = AL.get(2) ;
            
            if (energy1 < energy2)
                {
                lowestEnergy = energy1 ;
                }
            else
                {
                lowestEnergy = energy2 ;
                }
            if (energy3 < lowestEnergy)
                {
                lowestEnergy = energy3 ;
                }
            return(lowestEnergy) ;
        }
    
    
    
    
    
    
    
    public int getAbsVal(int x)  //Getting absolute value is required for calcing distances
        {
        if (x < 0)
            {
            x = x * -1 ;
            }
        return x ;
        }
    
    
    public int calcMannyhannyDist(Point point1 , Point point2)  //Method to Calc the Manhattan Distance
        {
          int xDist = point1.x - point2.x ;  //first we subtract the two x's
          xDist = getAbsVal(xDist) ;         //then we get their absolute value
          int yDist = point1.y - point2.y ;
          yDist = getAbsVal(yDist) ;
          int MannyHannyDist = xDist + yDist ;
          return MannyHannyDist ;
        }
    
    
    
    
    
    
    //Below is code for picking Centroids and creating an ArrayList of Centroids
    
    public int genRandom()
    {
    int randomNum = (int) (Math.random() * (this.pointList.size() - 1)) ;
    return randomNum ;
    }
    
    public ArrayList<Point> chooseCentroids()
    {
    //choose centroid 1
    int C1Index = genRandom() ;     //First we pick random nums to use as an index to pick centroids
    int C2Index = genRandom() ;
    int C3Index = genRandom() ;
    Point Centroid1 = pointList.get(C1Index) ;  //2nd we get the points as those randomly chosen indexes
    Point Centroid2 = pointList.get(C2Index) ;
    Point Centroid3 = pointList.get(C2Index) ;
    ArrayList<Point> CentroidList = new ArrayList<Point>() ; //3rd we create an ArrayList to put Centroids in
    CentroidList.add(Centroid1) ;
    CentroidList.add(Centroid2) ;
    CentroidList.add(Centroid3) ;                           //4th we put our Centroids in the Centroid List
    return (CentroidList) ;                                 //5th we return the Centoid List    
    }
    
    
}
