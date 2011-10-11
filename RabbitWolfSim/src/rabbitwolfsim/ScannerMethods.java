/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rabbitwolfsim;

import java.util.* ;
/**
 *
 * @author gblais1
 */
public class ScannerMethods 
{
 
    public static String makeMove(Rabbit rabbit) 
        {
            Scanner in = new Scanner(System.in) ;
            System.out.println("Which direction should " + rabbit.name + " move?") ;
            System.out.println("1 = N, 2 = S, 3 = W, 4 = E") ;
            int move = in.nextInt() ;
            if (move == 1)
                {
                return "N" ;
                } 
            else if (move == 2)
                {
                return "S" ;
                }
            else if (move == 3)
                {
                return "W" ;
                }
            else if (move == 4)
                {
                return "E" ;
                }
            else
                {
                return "ERROR!  SEE 'makeMove' method in ScannerMerhods" ;
                }
            
        }
    
    



}
