
package kmeans5;

import java.util.* ;

public class MeasuringDevice 
{
    
    ArrayList<Point> pointListMD ;
 
    public MeasuringDevice(ArrayList<Point> AL)
    {
    this.pointListMD = AL ;
    }
            
    
    public Result testManRun()
        {
            double AggEnergy = 0 ;
            
            //Pick 3 centroids
        ArrayList<Point> CentroidList = chooseCentroids() ;
        Point Centroid1 = CentroidList.get(0) ;
        Point Centroid2 = CentroidList.get(1) ;
        Point Centroid3 = CentroidList.get(2) ;
        
            //Calculate aggregate energy using these centroids
        for (int i = 0 ; i <= (pointListMD.size() - 1) ; i += 1)
            {
                //get current point
                Point currentPoint = pointListMD.get(i) ;
                //find energy for this point against all 3 centroids
                double energy1 = calcManDis(Centroid1 , currentPoint) ;
                double energy2 = calcManDis(Centroid2 , currentPoint) ;
                double energy3 = calcManDis(Centroid3 , currentPoint) ;
                
                //compare energy of all 3, get the lowest
                ArrayList<Double> threeEnergies = new ArrayList<Double>() ;
                threeEnergies.add(energy1) ;
                threeEnergies.add(energy2) ;
                threeEnergies.add(energy3) ;
                
                double lowestEnergy = determineLowestEnergy(threeEnergies) ;
                AggEnergy += lowestEnergy ;
            }
        
        Result theResult = new Result(CentroidList , AggEnergy) ;
        return theResult ;
            
            
            
        }
    
    
    
    
    public Result testEucRun()
        {
            double AggEnergy = 0 ;
            
            //Pick 3 centroids
        ArrayList<Point> CentroidList = chooseCentroids() ;
        Point Centroid1 = CentroidList.get(0) ;
        Point Centroid2 = CentroidList.get(1) ;
        Point Centroid3 = CentroidList.get(2) ;
        
            //Calculate aggregate energy using these centroids
        for (int i = 0 ; i <= (pointListMD.size() - 1) ; i += 1)
            {
                //get current point
                Point currentPoint = pointListMD.get(i) ;
                //find energy for this point against all 3 centroids
                double energy1 = calcEucDis(Centroid1 , currentPoint) ;
                double energy2 = calcEucDis(Centroid2 , currentPoint) ;
                double energy3 = calcEucDis(Centroid3 , currentPoint) ;
                
                //compare energy of all 3, get the lowest
                ArrayList<Double> threeEnergies = new ArrayList<Double>() ;
                threeEnergies.add(energy1) ;
                threeEnergies.add(energy2) ;
                threeEnergies.add(energy3) ;
                
                double lowestEnergy = determineLowestEnergy(threeEnergies) ;
                AggEnergy += lowestEnergy ;
            }
        
        Result theResult = new Result(CentroidList , AggEnergy) ;
        return theResult ;
            
            
            
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
    
    
    public Result testSqEucRun()
        {
            double AggEnergy = 0 ;
            
            //Pick 3 centroids
        ArrayList<Point> CentroidList = chooseCentroids() ;
        Point Centroid1 = CentroidList.get(0) ;
        Point Centroid2 = CentroidList.get(1) ;
        Point Centroid3 = CentroidList.get(2) ;
        
            //Calculate aggregate energy using these centroids
        for (int i = 0 ; i <= (pointListMD.size() - 1) ; i += 1)
            {
                //get current point
                Point currentPoint = pointListMD.get(i) ;
                //find energy for this point against all 3 centroids
                double energy1 = calcSquEucDis(Centroid1 , currentPoint) ;
                double energy2 = calcSquEucDis(Centroid2 , currentPoint) ;
                double energy3 = calcSquEucDis(Centroid3 , currentPoint) ;
                
                //compare energy of all 3, get the lowest
                ArrayList<Double> threeEnergies = new ArrayList<Double>() ;
                threeEnergies.add(energy1) ;
                threeEnergies.add(energy2) ;
                threeEnergies.add(energy3) ;
                
                double lowestEnergy = determineLowestEnergy(threeEnergies) ;
                AggEnergy += lowestEnergy ;
            }
        
        Result theResult = new Result(CentroidList , AggEnergy) ;
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
    int randomNum = (int) (Math.random() * (this.pointListMD.size() - 1)) ;
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
    Point Centroid1 = pointListMD.get(C1Index) ;  //2nd we get the points as those randomly chosen indexes
    Point Centroid2 = pointListMD.get(C2Index) ;
    Point Centroid3 = pointListMD.get(C3Index) ;
    ArrayList<Point> CentroidList = new ArrayList<Point>() ; //3rd we create an ArrayList to put Centroids in
    CentroidList.add(Centroid1) ;
    CentroidList.add(Centroid2) ;
    CentroidList.add(Centroid3) ;                           //4th we put our Centroids in the Centroid List
    return (CentroidList) ;                                 //5th we return the Centoid List    
    }
    
    
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
    
    
    
    
    public double getAbsVal(double x)  //Getting absolute value is required for calcing distances
        {
        if (x < 0)
            {
            x = x * -1 ;
            }
        return x ;
        }
    
    
}
