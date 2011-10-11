/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classexp;

import java.util.* ;
 

public class ClassExp 
{

    
    
    static ArrayList<samurai> the_list = new ArrayList<samurai>();
    
    public static void main(String[] args) 
    {
        
   
 
        
        for (int i = 0 ; i <= 10 ; i += 1)
            {
                samurai newSamurai = new samurai(i) ;
                newSamurai.identifier = i ;
                the_list.add(newSamurai) ;
                 
            }
        
        
        for (int i = 0 ; i <= (the_list.size() - 1) ; i += 1)
            {
                samurai currentSam = the_list.get(i) ;
            System.out.println(currentSam.identifier) ;
            }
        
        
    }
    
   
}
