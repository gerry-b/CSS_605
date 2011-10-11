/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans2;

import java.util.* ;

public class Answer 
{
ArrayList<point> centroids ;
int energy ;
    
    public Answer(ArrayList AL , int answerEnergy ); 
    {
    this.energy = answerEnergy ;
    this.centroids = AL ;
    }
    
}
