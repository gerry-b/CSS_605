
package j5_185;

/**
 *
 * @author gblais1
 */
public class Employee 
{
    String name = "Frank " ;
    
    int IDNumber = 666 ;
    
    String Department = "Bomb Squad" ;
    
    String Position = "Karate Expert" ;
    
    
    public Employee()
    {
    
    }
    
    
    
    
    
    public void setName(String newName)
    {
    name = newName ;
    }
    
    public String returnName()
    {
    return name ;
    }
    
    public void setDepartment(String newDepartment)
    {
    Department = newDepartment ;
    }
    
    public String getDepartment()
    {
    return Department ;
    }
    
    public void setIDNumber(int newIDNumber)
    {
    IDNumber = newIDNumber ;
    }
    
    public int getIDNumber()
    {
    return IDNumber ;
    }
    
    public void setPosition(String newPosition)
    {
    Position = newPosition ;
    }
    
    public String getPosition()
    {
    return Position ;
    }
    
    
}
