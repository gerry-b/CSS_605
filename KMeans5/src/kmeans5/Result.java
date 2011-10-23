
package kmeans5;

import java.util.* ;

public class Result 

{
    
public ArrayList<Point> Centroids ;
public double Score ;



    public Result(ArrayList<Point> CentroidList , Double theScore)
    {
    this.Centroids  = CentroidList  ;
    this.Score      = theScore      ;
    }
    
    
}
