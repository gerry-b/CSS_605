/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans3;

import java.util.* ;

public class Result 
{
    
    ArrayList<Point> Centroids ;
    int energy ;
    
    
    public Result(ArrayList<Point> ALCentroids , int aggEnergy)
    {
        this.energy = aggEnergy ;
        this.Centroids = ALCentroids ;
    }
    
    
}
