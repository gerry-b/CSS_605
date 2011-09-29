/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package novelpd;

/**
 *
 * @author gblais1
 */
public class alwaysDef extends Prisoner

{
    
    public alwaysDef(String name)
    {
    super(name) ;
    }
 
    
    public int makeMove()
    {
    return 0 ; //0 is defect
    }
    
}
