/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package novelpd;

/**
 *
 * @author gblais1
 */
public class AlwaysCoo extends Prisoner
{

    public AlwaysCoo(String name)
    {
    super(name) ;   
    }
    
    public int makeMove()
    {
    return 1 ; //1 is cooperate
    }
    
    
}
