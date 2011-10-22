/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import javax.swing.*; 
import java.awt.* ; //awt knows what a rectangle is

public class RaceTrack extends JFrame 
{
    
    //Constructor
 public RaceTrack()
 {
 super("RADICAL RACING") ;
 setSize(WIDTH , HEIGHT) ;
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
 setVisible(true) ;
 }   
 
 //This will draw the cars and the racetrack
 public void paint(Graphics g) 
 {
 super.paint(g) ;
 //draw the background of the racetrack
 }
    
    
    
    
    
    
    //Set the screen size
    final int WIDTH = 900, HEIGHT = 650 ;
    
    
    //create rectangles that will represent the left, right, top, bottom, //and center
    //Not sure what that means
    Rectangle left = new Rectangle(0,0,WIDTH/9,HEIGHT); 
    Rectangle right = new Rectangle((WIDTH/9)*9,0,WIDTH/9,HEIGHT) ;
    Rectangle top = new Rectangle(0,0,WIDTH, HEIGHT/9); 
    Rectangle bottom = new Rectangle(0,(HEIGHT/9)*9,WIDTH,HEIGHT/9) ;
    Rectangle center = new 
            Rectangle((int)((WIDTH/9)*2.5),(int) ((HEIGHT/9)*2.5), 
            (int)((WIDTH/9)*5),(HEIGHT/9)*4);
    
    //these obstacles will obstruct the path and make navigating harder
    Rectangle obstacle = new
Rectangle(WIDTH/2,(int)((HEIGHT/9)*7),WIDTH/10,HEIGHT/9); Rectangle obstacle2 = new
Rectangle(WIDTH/3,(int)((HEIGHT/9)*5),WIDTH/10,HEIGHT/4); Rectangle obstacle3 = new
Rectangle(2*(WIDTH/3),(int)((HEIGHT/9)*5),WIDTH/10,HEIGHT/4); 
Rectangle obstacle4 = new Rectangle(WIDTH/3,HEIGHT/9,WIDTH/30,HEIGHT/9); 
Rectangle obstacle5 = new Rectangle(WIDTH/2,(int)((HEIGHT/9)*1.5),WIDTH/30,HEIGHT/4);
    
    
//the following rectangle is the finish line for both players 
Rectangle finish = new Rectangle ( (int) WIDTH / 9 , (int) ((HEIGHT/2) - HEIGHT/9) , (int) ((WIDTH / 9) * 1.5) , (int) HEIGHT / 7  ) ;
                
 
//the following rectangle is the start line for the outer player 
Rectangle lineO = new Rectangle(WIDTH/9,HEIGHT/2,(int)((WIDTH/9)*1.5)/2,HEIGHT/140); 

//the following rectangle is the start line for the inner player 
Rectangle lineI = new Rectangle(((WIDTH/9)+((int)((WIDTH/9)*1.5)/2)), (HEIGHT/2)+(HEIGHT/10), (int)((WIDTH/9)*1.5)/2, HEIGHT/140);


}
