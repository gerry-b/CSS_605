/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package novelpd;

/**
 *
 * @author gblais1
 */
public class GerryFU extends Prisoner
{
    //super(String style) = "GerryFu" ;

    int counter = 0 ;
    
    public GerryFU(String name)
    {
    super(name) ;   
    }
    
    
    
    public int makeMove()
    {
    this.counter += 1 ;
    if (this.sentence == 0)
        {
        return 0 ;
        }
    else if (counter % 6 == 0)
        {
        return 0 ;
        }
    else
        {
        int randomNum = (int) (Math.random() * 2) ;
        return randomNum ;
        }
    }
}
