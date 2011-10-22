
package kmeans4;

import java.util.* ;

public class Result 

{

    public String name ;
    //public double highEnergyScore ;
    public double lowEnergyScore ;
    //public ArrayList<Point> highEnergyCentroids ;
    public ArrayList<Point> lowEnergyCentroids ;
    
    
    
    
    public Result(String theName ,  double LES, ArrayList<Point> LEC)
    {
        this.name = theName ;
        //this.highEnergyScore = HES ;
        this.lowEnergyScore = LES ;
        //this.highEnergyCentroids = HEC ;
        this.lowEnergyCentroids = LEC ;
    
    }
    
    
    
}
