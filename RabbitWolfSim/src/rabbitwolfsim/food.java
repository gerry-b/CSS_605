/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rabbitwolfsim;

/**
 *
 * @author gblais1
 */
public class food 
{
int xLoc = 5 ;
int yLoc = 5 ;
int metabEnergy = 10 ; 
int eatenInRound = 0 ;
String name = "this should be assigned in the constructor" ;
String color = "green" ;
boolean alive = true ;

public food(int xLocation, int yLocation, String foodName)
    {
        this.xLoc  = xLocation ;
        this.yLoc  = yLocation ;
        this.name = foodName ;
    }


public void agTurn(int currentRound)
    {
    regenerate(currentRound) ;
    statusUpdate() ;
    }

public void statusUpdate()
    {
    System.out.println("PLANT X , Y LOCATION & ALIVE/DEAD STATUS:" + this.xLoc + " , " + this.yLoc + this.alive) ;
    }



public void regenerate(int currentRound)
    {
        if (currentRound > (this.eatenInRound + 5) && this.alive == false)
            {
            this.metabEnergy += 10 ;
            this.color = "green" ; 
            this.alive = true ;
            }
    }


public void getEaten(int round)
    {
    this.color = "brown" ;      //turn to brown
    this.eatenInRound = round ; //record what round I was eaten in
    this.alive = false ;
    }



}











