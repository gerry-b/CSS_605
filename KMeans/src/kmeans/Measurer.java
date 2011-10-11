/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans;

import java.util.* ;

public class Measurer 
{

    public Measurer(ArrayList<point> AL)
    {
    }
    
    public ArrayList<point> chooseRandomCentroids(ArrayList<point> AL)
    {

        //grab the 3 poitns from those indexes
        ArrayList<point> metroids = new ArrayList<point>() ;
        //choose 3 random points from the arrayList of points
        int randomNum1 = (int) (Math.random() * (AL.size() - 1)) ;
        int randomNum2 = (int) (Math.random() * (AL.size() - 1)) ;
        int randomNum3 = (int) (Math.random() * (AL.size() - 1)) ;
        point point1 = AL.get(randomNum1) ;
        point point2 = AL.get(randomNum2) ;
        point point3 = AL.get(randomNum3) ;
        //put those 3 random points in the arrayList
        metroids.add(point1) ;
        metroids.add(point2) ;
        metroids.add(point3) ;
        // return the arrayList
        return metroids ;
        
    }
    
    public int confirmPositive(int number)
    {
    if (number < 0)
        {
        number = number * -1 ;
        }
    return(number) ;
    }
    
    
    public int calcManhattan(point point1 , point point2)
    {
        //find the absolute value for x1 - x2
    int distX = point1.x - point2.x ;
    distX = confirmPositive(distX) ;
       //find the absolute value for y1 - y2
    int distY = point1.y - point2.y ;
    distY = confirmPositive(distY) ;
    //add the x and y distances for a total Manhattan distance
    int totalDist = distX + distY ; 
    return totalDist ;
    }
    
    
    
    
    
    
    
    
    //Calculates the energy between one point and the 3 metroids
    //returns the smallest energy as an int
    public int calculateEnergy(point currentPoint , ArrayList<point> Centroids)
    {
        
            point Centroid1 = Centroids.get(0) ;
            point Centroid2 = Centroids.get(1) ;
            point Centroid3 = Centroids.get(2) ;
            //calculate the distance of that point to the 3 Metroids
            int Centroid1Distance = calcManhattan(currentPoint , Centroid1) ;
            int Centroid2Distance = calcManhattan(currentPoint , Centroid2) ;
            int Centroid3Distance = calcManhattan(currentPoint , Centroid3) ;
            
            //Now we need to figure out which distance is the shortest
            int smallestEnergy ;
            if (Centroid1Distance < Centroid2Distance)  //First we narrow it down between Centroids 1 and 2
                {
                smallestEnergy = Centroid1Distance ;
                }
            else
                {
                smallestEnergy = Centroid2Distance ;
                }
            if (Centroid3Distance < smallestEnergy)  //Then we narrow it down between that and Centroid 3
                {
                smallestEnergy = Centroid3Distance ;
                }
            return (smallestEnergy) ;
            
    }
       
    
    
    
    
    
}
