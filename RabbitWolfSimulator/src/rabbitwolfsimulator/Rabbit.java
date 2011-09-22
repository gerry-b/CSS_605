
package rabbitwolfsimulator;

import java.util.ArrayList ;


/**
 *
 * @author gblais1
 */
public class Rabbit 
{
public String name ;
public String deadOrAlive = "ALIVE" ;
private int speed = 1 ;
private int vision = 2 ;
public int xLocation = 0 ;
public int yLocation = 0 ;
public int maxX = 0 ;
public int minX = 0 ;
public int maxY = 0 ;
public int minY = 0 ;
public ArrayList<String> Positions = new ArrayList<String>();
//Introduce camouflage trait later

public Rabbit(String name)
{
   this.name = name ;
}

//Create an ArrayList to record positions of Rabbit
//ArrayList<String> Positions = new ArrayList<String>();


//Here we define methods for the Rabbit

public void fullMove()
        {
        //if (deadOrAlive.equals("ALIVE"))
                {
    String direction = getRandomDirection() ;  //pick a direction to move
    //System.out.println("I see the direction and it is " + direction) ;
    move(direction) ;                          //move in that direction
    String location = reportPosition(xLocation , yLocation) ;
    }
        }




public int returnX()
    {
    return xLocation ;
    }




public int returnY()
    {
    return yLocation ;
    }
                


public String reportPosition(int xLocation , int yLocation)
    {
    String xPos = Integer.toString(xLocation) ;
    String yPos = Integer.toString(yLocation) ;
    String Location = xPos + "-" + yPos ;
    return Location ;
    }


public void checkForMax()
    {
        if (xLocation > maxX)
            {
            maxX = xLocation ;
            }
        if (xLocation < minX)
            {
            minX = xLocation ;
            }
        if (yLocation > maxY)
            {
            maxY = yLocation ;
            }
        if (yLocation < minY) 
            {
            minY = yLocation ;
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




public void move(String direction)
    {
        if (deadOrAlive.equals("ALIVE"))
        {
              
            if (direction.equals("up"))
                {yLocation += speed ; }
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
       
    }
    
}



    
    

