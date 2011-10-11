/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rabbitwolfsim;

import java.util.* ;
/**
 *
 * @author gblais1
 */
public class Rabbit 
{
int xLoc = 0 ;
int yLoc = 0 ;
int metabEnergy = 50 ;
int vision = 1 ;
String name ;
boolean alive = true ;

    //Constructor
    public Rabbit(String nameAssignment)
    {
        this.name = nameAssignment ;
    }
    
  
    public void autoTurn(ArrayList aLFood, int round)
        {
            if (this.alive == true)
            {
                this.randomHop()        ;
                ArrayList<String> foodLoc = lookForFood(aLFood) ;
                if (foodLoc.size() > 0)
                    {
                    String direction = foodLoc.get(0) ;
                    this.hop(direction) ;
                    this.eat(aLFood , round) ;
                    }
                this.statusUpdate(aLFood) ;   
                this.checkAliveOrDead() ;
            }
            else
                {
                System.out.println("Can't do nothin', I'm dead.") ;
                }
        }
                
        
    
    public void agTurn(String hopDirection , ArrayList aLFood, int round)
        {
            if (this.alive == true)
            {
                this.checkAliveOrDead() ;
                    
                this.hop(hopDirection) ;
                this.eat(aLFood , round) ;
                this.statusUpdate(aLFood) ;        
            }
            else
                {
                System.out.println("Can't do nothin', I'm dead.") ;
                }
        }
    
    
    
    
    public void checkAliveOrDead() 
        {
        if (this.metabEnergy <= 0)
            {
            this.alive = false ;
            }
        else
            {
            this.alive = true ;
            }
        }
    
    
    
    
    
    public void die()
        {
        this.alive = false ;
        }
    
    
    public void advanceTowardFood(String direction)
        {
        if (direction.equals("N"))
            {
            this.hop("N") ;
            }
        else if (direction.equals("S")) 
            {
            this.hop("S") ;
            }
        else if (direction.equals("W"))
            {
            this.hop("W") ;
            }
        else if (direction.equals("E"))
            {
            this.hop("E") ;    
            }
        else
            {System.out.println("ERROR in advanceTowardFood method in Rabbit Class") ;}
        }
    
    
    
    public void randomHop()
        {
        int randomNum = (int) (Math.random() * 4) ;
        if (randomNum == 0)
            {
            this.hop("N") ;
            }
        else if (randomNum == 1)
            {
            this.hop("S") ;
            }
        else if (randomNum == 2)
            {
            this.hop("W") ;
            }
        else if (randomNum == 3)
            {
            this.hop("E") ;
            }
        else
            {
            System.out.println("ERROR in randomHop function in Rabbit class!") ;
            }
        
        }
    
    public void hop(String direction)
        {
        this.metabEnergy -= 1 ;
        
        if (direction.equals("N"))
            {
            this.yLoc += 1 ;
            }
        else if (direction.equals("S"))
            {
            this.yLoc -= 1 ;
            }
        else if (direction.equals("W"))
            {
            this.xLoc -= 1 ;
            }
        else if (direction.equals("E"))
            {
            this.xLoc += 1 ;
            }
        else 
            {
            System.out.println("ERROR:  Check 'move' function in Rabbit class.") ;
            }
        
        }
  
    
    
    
    public void eat(ArrayList<food> foodsToBeEaten , int round)
    {
        for (int i = 0 ; i <= (foodsToBeEaten.size() - 1) ; i += 1)
            {
                food currentFood = foodsToBeEaten.get(i) ;
                if (this.xLoc == currentFood.xLoc && currentFood.yLoc == this.yLoc && currentFood.alive == true)
                    {
                        this.metabEnergy += currentFood.metabEnergy ;
                        currentFood.metabEnergy = 0 ;
                        currentFood.getEaten(round) ;
                        String statement = "GET IN MY TUMMY!  THAT TASTED GREAT!!!" ;
                        for (int j = 0 ; j < 10 ; j +=1)
                        {
                        System.out.println(statement) ;
                        }
                    }
            }
    }
    
    
    
    
    
    public void statusUpdate(ArrayList foodList)
        {
        System.out.println(this.name + "'s stats:") ;
        System.out.println("Xloc:  " + this.xLoc) ;
        System.out.println("Yloc:  " + this.yLoc) ;
        System.out.println("Energy:  " + this.metabEnergy) ;
        ArrayList foodLocs = lookForFood(foodList) ;
        System.out.println("Food Locations: " + foodLocs) ;
        }
    

    public ArrayList lookForFood(ArrayList<food> foodList)
        {
        ArrayList<String> foodLocs = new ArrayList<String>();    
        for (int i = 0 ; i <= (foodList.size() - 1) ; i += 1)
            {                
                food currentFood = foodList.get(i) ;
                int distX = currentFood.xLoc - this.xLoc ;  // horizantal distance to food
                int distY = currentFood.yLoc - this.yLoc ;  // vertical distance to food
                
                if (distX > 0 && distX <= vision)  //Positive distX means food is to East
                    {
                    if (currentFood.alive == true)
                        {
                        foodLocs.add("E") ;
                        }
                    }
                if (distX < 0 && distX >= -vision)
                    {
                        if (currentFood.alive == true)
                        {
                    foodLocs.add("W") ;
                        }
                    }
                
                
            }   
        
        return foodLocs ;
        }

    
    
}
