
package novelpd;
import java.util.* ;
import java.io.* ;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NovelPD 
{

   
    public static void main(String[] args) 
    
    {
        
       int gameType = ScannerMethods.chooseGameType();  //First we have the user choose the game type
       
       if (gameType == 1)
            {
            fabricationMethods.fab2PrisonerMatch() ;
            }
       if (gameType == 2)
            {
            ArrayList<String> Victors = RoundRobin.roundRobin() ;
            System.out.println(Victors.size()) ;
            System.out.println(Victors) ;
            
            
            
           
            File file = new File("test.txt");
            BufferedWriter out = null;
            try {
                out = new BufferedWriter(new FileWriter("test.txt"));
                for(String s : Victors)
                    out.write(s);
            
            } catch (IOException ex) {
                Logger.getLogger(NovelPD.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                if(out!=null)try {
                    out.close();
                } catch (IOException ex) {
                    Logger.getLogger(NovelPD.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            }
       
     
        
    }
    
    
}



