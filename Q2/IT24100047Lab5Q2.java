import java.util.Scanner;
public class IT24100047Lab5Q2
{
    public static void main (String [] args ) 
	{
	   // define data type of variable
	      int members ;
		  
       // making scanner object 
	      Scanner sc = new Scanner (System.in);
		  
	   // get the user input
	      System.out.println ("Enter the new members introduced " );
		  members = sc.nextInt() ;
		  
	   //check the prizes 
	     if (members<0)
		 {
		   System.out.println("Enter a number above 0 ");
		 }  
		 else
    {		 
		 //start switch 
	     switch (members)
		 {
		  case   0 :System.out.println("No prize");
		            break;
		  case   1 :System.out.println("Pen");			
                    break;
		  case   2:System.out.println("Umbrella");			
                    break;
          case   3 :System.out.println("Bag");			
                    break;	
          case   4 :System.out.println("Travelling Chair");			
                    break;
          default  :System.out.println("Headphone");			
                    break;
         }
		   
	
	}
	}	 
	}	    		  