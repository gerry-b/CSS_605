/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans;

/**
 *
 * @author gblais1
 */
public class point 

{
    public int x ;
    public int y ;
    public String name ;
    
    public point(String theName , int pointX , int pointY)
        {
        this.x = pointX ;
        this.y = pointY ;
        this.name = theName ;
        } 
    
    public int getX()
    {
    return this.x ;
    }
    
    public int getY() 
    {
    return this.y ;
    }
    
    
            
}
