
package kmeans4;

import java.lang.Math.* ;
import java.util.* ;

public class DistMeasDev 
{
    
    ArrayList<Point> pointList ;

    public DistMeasDev(ArrayList<Point> AL)
    {
        this.pointList = AL ;
    }
    
    
    
    
    
    
    
    
    public Result calcNAddEnergies(String measureMethod)
    {
        double aggEnergy  = 0 ;  //A sentinel value we'll use later to hold the aggregate energy for these 3 centroids
        
        //first we get 3 centroids
        ArrayList<Point> CentroidList = chooseCentroids() ;
        Point Centroid1 = CentroidList.get(0) ;
        Point Centroid2 = CentroidList.get(1) ;
        Point Centroid3 = CentroidList.get(2) ;
        
        //Now we go through pointList finding Manhattan energies for each point
        for (int i = 0; i <= (pointList.size() - 1) ; i += 1)
            {
            Point currentPoint = pointList.get(i) ;  //looks at energy for point when paired with each centroid
            double Centroid1Energy ;
            double Centroid2Energy ;
            double Centroid3Energy ;
            if (measureMethod.equals("M"))
                {   Centroid1Energy = calcManDis(currentPoint , Centroid1) ;
                    Centroid2Energy = calcManDis(currentPoint , Centroid2) ;
                    Centroid3Energy = calcManDis(currentPoint , Centroid3) ;
                }
            else if (measureMethod.equals("E"))
                {
                    Centroid1Energy = calcEucDis(currentPoint , Centroid1) ;
                    Centroid2Energy = calcEucDis(currentPoint , Centroid2) ;
                    Centroid3Energy = calcEucDis(currentPoint , Centroid3) ;
                }
            else if (measureMethod.equals("SE"))
                {
                    Centroid1Energy = calcSquEucDis(currentPoint , Centroid1) ;
                    Centroid2Energy = calcSquEucDis(currentPoint , Centroid2) ;
                    Centroid3Energy = calcSquEucDis(currentPoint , Centroid3) ;
                }
            else
                {
                    System.out.println("ERROR IN calcNAddEnergies Method in DistMeasDev class") ;
                    Centroid1Energy = calcSquEucDis(currentPoint , Centroid1) ;
                    Centroid2Energy = calcSquEucDis(currentPoint , Centroid2) ;
                    Centroid3Energy = calcSquEucDis(currentPoint , Centroid3) ;
                }
            //Now we put Centroid energies in an AL so we can find lowest Centroid energy
            ArrayList<Double> AL = new ArrayList<Double>() ;
            AL.add(Centroid1Energy) ;
            AL.add(Centroid2Energy) ;
            AL.add(Centroid3Energy) ;
            //Now we find the lowest energy for that point
            double lowestEnergy = determineLowestEnergy(AL) ;
            //Now we add that lowest energy for that point to our aggregate energy
            aggEnergy += lowestEnergy ;
            }
        
        Result theResult  ;
        if (measureMethod.equals("M"))  //"M" is our short hand for Manhattan
                {
                theResult = new Result("M" , aggEnergy , CentroidList ) ;
                }
        else if (measureMethod.equals("E"))  //"E" is our short hand for Euclidean
                {
                theResult = new Result("E" , aggEnergy , CentroidList ) ;
                }
        else 
                {
                theResult = new Result("SE", aggEnergy, CentroidList) ;  //"SE" is short hand for Square Euclidean
                }
        
        return theResult ;
    }
        
    
    
    
    
    
    
    
    public double determineLowestEnergy(ArrayList<Double> AL)
        {
            double lowestEnergy = 0 ;  //this is just to initialize the lowest energy value
            double energy1 = AL.get(0) ;
            double energy2 = AL.get(1) ;
            double energy3 = AL.get(2) ;
            
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
    
    
    
    //get random points from the point list
    public int genRandom()
    {
    int randomNum = (int) (Math.random() * (this.pointList.size() - 1)) ;
    return randomNum ;
    //returns a random index from the point list
    }
    
    
    
    
    //Chooses 3 random points to be Centroids from the point list, returns those points in an ArrayList
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
    
    
    
    
    //BELOW ARE OUR 3 DISTANCE MEASURING METHODS
    
    public double calcManDis(Point point1 , Point point2)   //Calculates Manhattan Distance
    {
    double XDist = point1.x - point2.x ;
    XDist = getAbsVal(XDist) ;
    double YDist = point1.y - point2.y ;
    YDist = getAbsVal(YDist) ;
    
    Double ManDis = XDist + YDist ;
    return ManDis ;
    }
    
    
    public double calcEucDis(Point point1 , Point point2)
    {
        //Square root of ( (Point1 x - Poin2x) + (Point1 y - Point2 y)
        double XDiff = point1.x - point2.x ;     // (1)  Find the differences between X's
        double XDiffSquared = XDiff * XDiff ;    //Square the difference between X's
        double YDiff = point1.y - point2.y ;     //Find the difference between Y's
        double YDiffSquared = YDiff * YDiff ;    //Square the difference between Y's
        double sum = XDiffSquared + YDiffSquared ;   //Add the squared x's and y's
        double sqrt = Math.sqrt(sum) ;               //Find the square root of the sum
        double answer = sqrt ;                       //This square root is our answer
        return answer ;
    
    }
    
    public double calcSquEucDis(Point point1 , Point point2)
    {
    //Just like Euclidean Distance, except we don't take the square root
        double XDiff = point1.x - point2.x ;     // (1)  Find the differences between X's
        double XDiffSquared = XDiff * XDiff ;    //Square the difference between X's
        double YDiff = point1.y - point2.y ;     //Find the difference between Y's
        double YDiffSquared = YDiff * YDiff ;    //Square the difference between Y's
        double sum = XDiffSquared + YDiffSquared ;   //Add the squared x's and y's
        double answer = sum ;                       //This sum is our answer
        return answer ;
    }
    
    
    
    
    
    public double getAbsVal(double x)  //Getting absolute value is required for calcing distances
        {
        if (x < 0)
            {
            x = x * -1 ;
            }
        return x ;
        }
    
}
