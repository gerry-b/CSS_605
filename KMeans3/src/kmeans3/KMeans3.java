
package kmeans3;

import java.util.* ;

public class KMeans3 
{

    public static void main(String[] args) 
    {
       
  
                                        //First we create some points
     Point Point1 = new Point(0,0) ;   //Regular People
     Point Point2 = new Point(1,1) ;
     Point Point3 = new Point(2,2) ;
     Point Point7 = new Point(3,3) ;
     Point Point4 = new Point(4,4) ;
     Point Point5 = new Point(5,5) ;
     Point Point6 = new Point(6,6) ;
     
     Point PointA = new Point(0,10) ;   //Lottery Winners
     Point PointB = new Point(1,11) ;
     Point PointC = new Point(2,12) ;
     
     Point PointZ = new Point(10,0) ;  //English Professors
     Point PointY = new Point(9 ,1) ;
     Point PointX = new Point(8 ,0) ;
     
     ArrayList<Point> pointList = new ArrayList<Point>() ;  //Then we create an ArrayList to hold the points
     
     pointList.add(Point1) ;
     pointList.add(Point2) ;
     pointList.add(Point3) ;
     pointList.add(Point4) ;
     pointList.add(Point5) ;
     pointList.add(Point6) ;
     pointList.add(Point7) ;
     pointList.add(PointA) ;
     pointList.add(PointB) ;
     pointList.add(PointC) ;
     pointList.add(PointZ) ;
     pointList.add(PointY) ;
     pointList.add(PointX) ;                            //ArrayList should hold all points now
     
     
     
     
     
     DistMeasDev testBot = new DistMeasDev(pointList) ;  //We create a DistMeasDev to calc energies
     ArrayList<Result> resultList = new ArrayList<Result>() ;  //Then we create an ArrayList to hold results
     ResultIntepreter RI = new ResultIntepreter(resultList) ;  //We create a Result Interpreter to handle results
     
     int numOfRounds = testBot.findRunTime(pointList) ;        //Decide how many times we'll evaluate diff centroids
     
     
     for (int i = 0 ; i <= numOfRounds ; i += 1)                    //Now we run our centroid/counting cycle i times
     {
     //String firstAnswer = testBot.calcNAddEnergies() ;
     //System.out.println(firstAnswer) ;
        Result thisAnswer = testBot.calcNAddEnergies() ;    //we find the result with whatever centroids were chosen
        RI.Results.add(thisAnswer) ;                        //we put out result into RI's Results ArrayList
     }
     
     Result bestResult = RI.findLowestEnergy() ;            //Find out best result
     String lowestE = RI.deliverResults(bestResult) ;       //Turn our best result into a sentence
     System.out.println(lowestE) ;                          //Print our result
     
     
    }
    
    
}
