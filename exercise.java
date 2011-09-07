import java.util.Scanner ;
import java.lang.* ;
import java.io.* ;

//GOAL:  To take a string and then create a new string that is the old string with a space 
//       between each character.  So, the string "henry" would result in the new string "h e n r y"


class exercise 
{
	public static void main(String args[]) throws Exception
	{
		
	String the_string = "Henry" ;  //This is the unchanged string we're starting off with
		
	String new_string = "" ;  //Starts off blank since we haven't added anything to it yet
	
	for (int i = 0; i < the_string.length() ; i += 1)
		{
		char currentChar = the_string.charAt(i);    //get current char from first string
		String currentCharString = Character.toString(currentChar) ; //turn that char to string
		//System.out.println(currentCharString + "  check, we got " + currentCharString) ;  //check to see if we're getting the char at all
		new_string = new_string.concat(currentCharString) ; //concat that char to the new string
		//System.out.println(new_string + "if not preceded by a char, concat didn't work") ;  //Check to see if we're successfully concatenating
		new_string = new_string.concat(" ");                //concat a blank space to the new string
		}
	
	System.out.println(new_string);
	
	
	}
}