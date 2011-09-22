/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package j5_185;

/**
 *
 * @author gblais1
 */
public class Car 
{
    private int year ;
    private String make ;
    private int speed ;       

    
    public Car(int yearModel, String carMake, int carSpeed) 
    {
    year = yearModel ;
    make = carMake ;
    speed = carSpeed ;
    }
    
    
    //Accessor methods
    public int getYear()
    {
    return year ;
    }
    
    public String getMake()
    {
    return make ;
    }
    
    public int getSpeed()
    {
    return speed ;
    }
    
    //Mutator methods
    
    public void accelerate()
    {
    speed += 5 ;
    }
    
    public void brake()
    {
    speed -= 5 ;
    }
    
    
    
    
    
    
    
    
}
