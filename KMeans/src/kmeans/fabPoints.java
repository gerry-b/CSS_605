
package kmeans;

import java.util.* ;

public class fabPoints 
{

    public static ArrayList<point> makePoints()
            
		{
		//create a place to keep points
        ArrayList<point> pointList = new ArrayList<point>();
        
        
        //create some points to put in the list (these will be the regular populatins, normal ascending)
        for (int i = 0; i <= 20 ; i +=1)
            {
            point dronePoint = new point("normal" , i , i) ;
            pointList.add(dronePoint) ;
            }
        
        //create the lottery winners (bunched up in top left corner)
        for (int i = 20 ; i >= 15 ; i -= 1)
            {
            int randomNum = (int) (Math.random() * 5) ;
            point lotteryWinner = new point("lotto winner" , randomNum , i ) ;
            pointList.add(lotteryWinner) ;
            }
        
        //now we create the English professors
        for (int i = 20 ; i >= 15 ; i -= 1)
            {
            int randomNum = (int) (Math.random() * 5) ;
            point lotteryWinner = new point( "English Professor" , i , randomNum ) ;
            pointList.add(lotteryWinner) ;
            }
        
        for (int i = 0 ; i <= (pointList.size() - 1) ; i += 1)
            {
            System.out.println(pointList.get(i).name + " " + pointList.get(i).x + "  " + pointList.get(i).y) ;
            }
                    
                    
                    
    return pointList ;
    
		}
    

    
}
