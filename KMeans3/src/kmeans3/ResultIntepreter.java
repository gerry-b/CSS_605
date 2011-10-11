/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans3;

import java.util.* ;

public class ResultIntepreter 
{

    ArrayList<Result> Results ;
    
    public ResultIntepreter(ArrayList<Result> ALResults)
    {
        this.Results = ALResults ;
    }
    
    
    public Result findLowestEnergy()
    {
        Result bestResult = Results.get(0) ;
        
        for (int i = 0 ; i <= (Results.size() -1) ; i += 1 )
            {
            Result currentResult = Results.get(i) ;
            if (currentResult.energy < bestResult.energy)
                {
                bestResult = currentResult ;
                }
        
            }
        return bestResult ;
    }
    
    public String deliverResults(Result result)
        {
        String lowestE = ("The lowest energy was " + result.energy) ;
        //String centroids = ("Centroids of that result were " result.Centoids.get(0))
        return lowestE ;
        }
    
}
