
package rabbitwolfsimulator;

/**
 *
 * @author gblais1
 */
public class Wolf 
{
    public int speed = 1 ;
    public int rabbitsEaten = 0 ;
    public int xLocation = 5 ;
    public int yLocation = 5 ;
    public int scent = 3 ;
    
    public Wolf()
    {
        
    }

    
    
    
    
    public void eatRabbit(Rabbit rabbit)
    {
        int rabbitX = rabbit.returnX() ;
        int rabbitY = rabbit.returnY() ;
        String rabbitLocation = rabbit.reportPosition(rabbitX, rabbitY) ;
        String wolfLocation = reportPosition(xLocation , yLocation) ;
    if (wolfLocation.equals(rabbitLocation)) 
        {
        rabbit.deadOrAlive = "DEAD" ;
        }
    
    }
    
    
    public void fullMove()
    {
    String direction = getRandomDirection() ;  //pick a direction to move
    move(direction) ;                          //move in that direction
    String location = reportPosition(xLocation , yLocation) ;
    }
    
    
    
    public void move(String direction)
        {  
            if (direction.equals("up"))
                {
                    yLocation += speed ; 
                }
            else if (direction.equals("down"))
                {
                    yLocation -= speed ;
                }
            else if (direction.equals("left"))
                {
                    xLocation -= speed ;
                }
            else if (direction.equals("right"))
                {
                    xLocation += speed ;
                }
         }
       
    
    
    
    public String getRandomDirection()
    {
    int randomNum = (int) (Math.random() * 4) ;
    if (randomNum == 0)
        {
        return "up" ;
        } 
    if (randomNum == 1)
        {
        return "down" ;
        }
    if (randomNum == 2)
        {
        return "left" ;
        }
    else
        {
        return "right" ;
        }
    }
    
    
    public String reportPosition(int xLocation , int yLocation)
        {
    String xPos = Integer.toString(xLocation) ;
    String yPos = Integer.toString(yLocation) ;
    String Location = xPos + "-" + yPos ;
    return Location ;
        }
    
    
    
    
    
}
    
    

