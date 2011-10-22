/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans4;

import java.util.* ;

public class ResultInterpreter 
{

    public ArrayList<Result> resultList ;
    public double lowestEucEnergy ;
    public double lowestManEnergy ;
    public double lowestSEucEnergy ;
    
    
    public ResultInterpreter(ArrayList<Result> AL)
    {
        this.resultList = AL ;
        this.lowestEucEnergy = 1000000 ;
        this.lowestManEnergy = 1000000 ;
        this.lowestSEucEnergy = 1000000 ;
       
    }
    
    
    
    public String findBestSEuc()
        {
        //double lowestEnergy = 1000000 ; //Setting this absurdly high so it will change with first result
        
        ArrayList<Point> Centroids = new ArrayList<Point>() ;
        
    for (int i = 0 ; i <= (this.resultList.size() - 1) ; i += 1)
            {
            Result currentResult = resultList.get(i) ;
            //System.out.println("The size of the results list is " + resultList.size()) ;
            if (currentResult.name.equals("SE"))
                {
                if(currentResult.lowEnergyScore < this.lowestSEucEnergy)
                    {
                    this.lowestSEucEnergy = currentResult.lowEnergyScore ;
                    Point centroid1 = currentResult.lowEnergyCentroids.get(0) ;
                    Point centroid2 = currentResult.lowEnergyCentroids.get(1) ;
                    Point centroid3 = currentResult.lowEnergyCentroids.get(2) ;
                
                    ArrayList<Point> currentCentroids = new ArrayList<Point>() ;
                    currentCentroids.add(centroid1) ;
                    currentCentroids.add(centroid2) ;
                    currentCentroids.add(centroid3) ;
                
                    Centroids = currentCentroids ;
                
                    }
                }
            }
    return("\nBest Square Euclidean RESULT:  Energy = " + this.lowestSEucEnergy 
            + "\nSquare Euclidean Centroid 1: " + (Centroids.get(0).x) + " , " + (Centroids.get(0).y)  
            + "\nSquare Euclidean Centroid 2: " + (Centroids.get(1).x) + " , " + (Centroids.get(1).y) 
            + "\nSquare Euclidean Centroid 3: " + (Centroids.get(2).x) + " , " + (Centroids.get(2).y) ) ;
    
        }
    
    
    
    
    public String findBestMan()
        {
        //double lowestEnergy = 1000000 ; //Setting this absurdly high so it will change with first result
        
        ArrayList<Point> Centroids = new ArrayList<Point>() ;
        
    for (int i = 0 ; i <= (this.resultList.size() - 1) ; i += 1)
            {
            Result currentResult = resultList.get(i) ;
            //System.out.println("The size of the results list is " + resultList.size()) ;
            if (currentResult.name.equals("M"))
                {
                if(currentResult.lowEnergyScore < this.lowestManEnergy)
                    {
                    this.lowestManEnergy = currentResult.lowEnergyScore ;
                    Point centroid1 = currentResult.lowEnergyCentroids.get(0) ;
                    Point centroid2 = currentResult.lowEnergyCentroids.get(1) ;
                    Point centroid3 = currentResult.lowEnergyCentroids.get(2) ;
                
                    ArrayList<Point> currentCentroids = new ArrayList<Point>() ;
                    currentCentroids.add(centroid1) ;
                    currentCentroids.add(centroid2) ;
                    currentCentroids.add(centroid3) ;
                
                    Centroids = currentCentroids ;
                
                    }
                }
            }
    return("\nBest Manhattan RESULT:  Energy = " + this.lowestManEnergy 
            + "\nManhattan Centroid 1: " + (Centroids.get(0).x) + " , " + (Centroids.get(0).y)  
            + "\nManhattan Centroid 2: " + (Centroids.get(1).x) + " , " + (Centroids.get(1).y) 
            + "\nManhattan Centroid 3: " + (Centroids.get(2).x) + " , " + (Centroids.get(2).y) ) ;
        }
    
    
    
    
    
    
    public String findBestEuc() //Finds our best Euclidean result
    {
        //double lowestEnergy = 1000000 ; //Setting this absurdly high so it will change with first result
        
        ArrayList<Point> Centroids = new ArrayList<Point>() ;
        
    for (int i = 0 ; i <= (this.resultList.size() - 1) ; i += 1)
        {
        Result currentResult = resultList.get(i) ;
        //System.out.println("The size of the results list is " + resultList.size()) ;
        if (currentResult.name.equals("E"))
            {
            if(currentResult.lowEnergyScore < this.lowestEucEnergy)
                {
                this.lowestEucEnergy = currentResult.lowEnergyScore ;
                Point centroid1 = currentResult.lowEnergyCentroids.get(0) ;
                Point centroid2 = currentResult.lowEnergyCentroids.get(1) ;
                Point centroid3 = currentResult.lowEnergyCentroids.get(2) ;
                
                ArrayList<Point> currentCentroids = new ArrayList<Point>() ;
                currentCentroids.add(centroid1) ;
                currentCentroids.add(centroid2) ;
                currentCentroids.add(centroid3) ;
                
                Centroids = currentCentroids ;
                
                }
            }
        }
        
        return("\nBest Regular Euclidean RESULT:  Energy = " + this.lowestEucEnergy 
            + "\nEuclidean Centroid 1: " + (Centroids.get(0).x) + " , " + (Centroids.get(0).y)  
            + "\nEuclidean Centroid 2: " + (Centroids.get(1).x) + " , " + (Centroids.get(1).y) 
            + "\nEuclidean Centroid 3: " + (Centroids.get(2).x) + " , " + (Centroids.get(2).y) ) ;
    }
    
    
    
    
    
}
