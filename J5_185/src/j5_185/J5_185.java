/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package j5_185;

/**
 *
 * @author gblais1
 */
public class J5_185 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    Employee Frank = new Employee() ;
    
    System.out.println(Frank.name) ;
    
    Frank.setName("Hilda") ;
    
    System.out.println(Frank.returnName()) ;
    
    Frank.setDepartment("Mobile Rocket Launchers") ;
    
    System.out.println(Frank.getDepartment()) ;
    
    // TODO code application logic here
    }
}
