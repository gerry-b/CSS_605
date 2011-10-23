
package kmeans5;

import java.util.* ;

public class KMeans5 
{

    public static void main(String[] args) 
    {
        //First we make the average Joes
        Point averageJoe1 = new Point(4,5) ;
        Point averageJoe2 = new Point(4,4) ;
        Point averageJoe3 = new Point(5,5) ;
        Point averageJoe4 = new Point(6,6) ;
        Point averageJoe5 = new Point(7,7) ;
        Point averageJoe6 = new Point(8,9) ;
        Point averageJoe7 = new Point(9,9) ;
        
        //Then we make the English Professors
        Point engProf1 = new Point(10,0) ;
        Point engProf2 = new Point(9,0) ;
        Point engProf3 = new Point(9,1) ;
        Point engProf4 = new Point(9,2) ;
        
        //Now we make the Lottery Winners
        Point lotto1 = new Point(0,10) ;
        Point lotto2 = new Point(0,9) ;
        Point lotto3 = new Point(1,9) ;
        Point lotto4 = new Point(2,9) ;
        Point lotto5 = new Point(2,11) ;
        
        
        
        //Now we throw everyone into an ArrayList
        ArrayList<Point> pointList = new ArrayList<Point>() ;
        pointList.add(averageJoe1) ;
        pointList.add(averageJoe2) ;
        pointList.add(averageJoe3) ;
        pointList.add(averageJoe4) ;
        pointList.add(averageJoe5) ;
        pointList.add(averageJoe6) ;
        pointList.add(averageJoe7) ;
        
        pointList.add(engProf1) ;
        pointList.add(engProf2) ;
        pointList.add(engProf3) ;
        pointList.add(engProf4) ;
        
        pointList.add(lotto1) ;
        pointList.add(lotto2) ;
        pointList.add(lotto3) ;
        pointList.add(lotto4) ;
        pointList.add(lotto5) ;
        
        
        
        
        //************************************************
        
        
        //This is our Manhattan Section
        MeasuringDevice testBot = new MeasuringDevice(pointList) ;  //Created a measuring device, gave it the pointList
        
        //pick 3 centroids
        //find nearest centroid for everoy point in the list
        
        int numTrial = 10000 ;
        
       
        ArrayList<Result> results = new ArrayList<Result>() ;   //Make an ArrayList to hold our results
        
        double manSamp = 100000 ;                               //Filler to start our ArrayList
        Result sampleManResult = new Result(pointList , manSamp) ;  //Filler to start our ArrayList
        
        results.add(sampleManResult) ;                              //Filler to start our ArrayList
        
        for (int j = 0 ; j <= numTrial ; j += 1)                    //The loop where everything begins
            {
        
            int finalIndex = (results.size() - 1) ;   //Tells us how long the list is, i.e., where our best answer is
            
            Result currentBestResult = results.get(finalIndex) ;     //the current best answer   
            double currentBestScore = currentBestResult.Score ;     //the current best score
            
            Result trialRun = testBot.testManRun() ;           //this is our exectution of the centroid/energy cycle
        
            if (trialRun.Score < currentBestScore)             //check to see if our new results are an improvement
                {
                                                            
                currentBestResult = trialRun ;
                results.add(currentBestResult) ;                 //if improvement, make that the new best answer
                }
            }
        
        
        int finalIndex = (results.size() - 1) ; 
        Result bestResult = results.get(finalIndex) ;
        double bestScore = bestResult.Score ;
        System.out.println("Best Manhattan Score (Lowest Energy) : " + bestScore) ;
        ArrayList<Point> Centroids = bestResult.Centroids ;
        Point Centroid1 = Centroids.get(0) ;
        Point Centroid2 = Centroids.get(1) ;
        Point Centroid3 = Centroids.get(2) ;
        System.out.println("Manhattan Score Achieved with Centroids: " + 
                "\nCentroid 1:  " + Centroid1.x + "," + Centroid1.y   +
                        "\nCentroid 2:  " + Centroid2.x + "," + Centroid2.y   +
                                "\nCentroid 3:  " + Centroid3.x + "," + Centroid3.y ) ;
        
        
        
        
        
        
        
        
        
        //This is our Euclidean Distance Section
       
        
       
        ArrayList<Result> eucResults = new ArrayList<Result>() ;   //Make an ArrayList to hold our results
        
        double EucSamp = 100000 ;                               //Filler to start our ArrayList
        Result sampleEucResult = new Result(pointList , EucSamp) ;  //Filler to start our ArrayList
        
        eucResults.add(sampleEucResult) ;                              //Filler to start our ArrayList
        
        for (int k = 0 ; k <= numTrial ; k += 1)                    //The loop where everything begins
            {
        
            int eucFinalIndex = (eucResults.size() - 1) ;   //Tells us how long the list is, i.e., where our best answer is
            
            Result eucCurrentBestResult = eucResults.get(eucFinalIndex) ;     //the current best answer   
            double eucCurrentBestScore = eucCurrentBestResult.Score ;     //the current best score
            
            Result eucTrialRun = testBot.testEucRun() ;           //this is our exectution of the centroid/energy cycle
        
            if (eucTrialRun.Score < eucCurrentBestScore)             //check to see if our new results are an improvement
                {
                                                            
                eucCurrentBestResult = eucTrialRun ;
                eucResults.add(eucCurrentBestResult) ;                 //if improvement, make that the new best answer
                }
            }
        
        
        int eucFinalIndex = (eucResults.size() - 1) ; 
        Result bestEucResult = eucResults.get(eucFinalIndex) ;
        double bestEucScore = bestEucResult.Score ;
        System.out.println("\nBest Euclidean Score (Lowest Energy) : " + bestEucScore) ;
        ArrayList<Point> eucCentroids = bestEucResult.Centroids ;
        Point eucCentroid1 = eucCentroids.get(0) ;
        Point eucCentroid2 = eucCentroids.get(1) ;
        Point eucCentroid3 = eucCentroids.get(2) ;
        System.out.println("Euclidean Score Achieved with Centroids: " + 
                "\nCentroid 1:  " + eucCentroid1.x + "," + eucCentroid1.y   +
                        "\nCentroid 2:  " + eucCentroid2.x + "," + eucCentroid2.y   +
                                "\nCentroid 3:  " + eucCentroid3.x + "," + eucCentroid3.y ) ;
        
        
        
        
        
        
        
        //This is the Square Euclidean Section
        
        //This is our Euclidean Distance Section
       
        
       
        ArrayList<Result> squEucResults = new ArrayList<Result>() ;   //Make an ArrayList to hold our results
        
        double squEucSamp = 100000 ;                               //Filler to start our ArrayList
        Result sampleSquEucResult = new Result(pointList , squEucSamp) ;  //Filler to start our ArrayList
        
        squEucResults.add(sampleSquEucResult) ;                              //Filler to start our ArrayList
        
        for (int l = 0 ; l <= numTrial ; l += 1)                    //The loop where everything begins
            {
        
            int squEucFinalIndex = (squEucResults.size() - 1) ;   //Tells us how long the list is, i.e., where our best answer is
            
            Result squEucCurrentBestResult = squEucResults.get(squEucFinalIndex) ;     //the current best answer   
            double squEucCurrentBestScore = squEucCurrentBestResult.Score ;     //the current best score
            
            Result squEucTrialRun = testBot.testSqEucRun() ;           //this is our exectution of the centroid/energy cycle
        
            if (squEucTrialRun.Score < squEucCurrentBestScore)             //check to see if our new results are an improvement
                {
                                                            
                squEucCurrentBestResult = squEucTrialRun ;
                squEucResults.add(squEucCurrentBestResult) ;                 //if improvement, make that the new best answer
                }
            }
        
        
        int squEucFinalIndex = (squEucResults.size() - 1) ; 
        Result bestSquEucResult = squEucResults.get(squEucFinalIndex) ;
        double bestSquEucScore = bestSquEucResult.Score ;
        System.out.println("\nBest Square Euclidean Score (Lowest Energy) : " + bestSquEucScore) ;
        ArrayList<Point> squEucCentroids = bestEucResult.Centroids ;
        Point squEucCentroid1 = squEucCentroids.get(0) ;
        Point squEucCentroid2 = squEucCentroids.get(1) ;
        Point squEucCentroid3 = squEucCentroids.get(2) ;
        System.out.println("Square Euclidean Score Achieved with Centroids: " + 
                "\nCentroid 1:  " + squEucCentroid1.x + "," + squEucCentroid1.y   +
                        "\nCentroid 2:  " + squEucCentroid2.x + "," + squEucCentroid2.y   +
                                "\nCentroid 3:  " + squEucCentroid3.x + "," + squEucCentroid3.y ) ;
        
        
        
        
    }
}
