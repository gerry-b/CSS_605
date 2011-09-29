/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package novelpd;

/**
 *
 * @author gblais1
 */
public class RandomPrisoner extends Prisoner
{
    
    
    public RandomPrisoner(String name)
    {
    super(name) ;
    
    }
    
    public int makeMove()
    {
    int randomNum = (int) (Math.random() * 2 ) ;
    return randomNum ;
    }
    
    
}
