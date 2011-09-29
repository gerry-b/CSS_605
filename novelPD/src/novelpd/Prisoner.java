/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package novelpd;

import java.util.* ;

/**
 *
 * @author gblais1
 */
public class Prisoner 
{
public int sentence = 0 ;
public String name = "parent_class, you shouldn't see this" ;
ArrayList<Integer> sentences = new ArrayList<Integer>();  //to keep a record of sentences handed down by judge


    public Prisoner(String name)  //the constructor
    {
        this.name  = name ;    
    }
    
    public int makeMove()
    {
    return 1 ;
    }
    
    
    
    
}
