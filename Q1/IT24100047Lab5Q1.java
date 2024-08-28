import java.util.Scanner;
public class IT24100047Lab5Q1
{
    public static void main (String [] args ) 
	{
	   // define data type of variable
	      int input1 , input2 , input3 , max , min  ;
		  
       // making scanner object 
	      Scanner sc = new Scanner (System.in);
		  
	   // get the user input
	      System.out.println ("Enter the first integer " );
		  input1 = sc.nextInt();
		  
		  System.out.println ("Enter the second integer " );
		  input2 = sc.nextInt();
		  
		  System.out.println ("Enter the third integer " );
		  input3 = sc.nextInt();
		    		  
	   //check inputvalue 
	    if (input1>input2)
	{
		max = input1;
		min = input2;
	}
    	else
    {		
		max = input2;
        min = input1;
	}
	if (input3 > max) 
    {
	 max = input3; 
    }

    if (input3 < min) 
    {
	 min = input3;
    }	
    
	System.out.println("The smallest number is :" +min);
	System.out.println("The highest  number is :" +max);
	
	

     }
}	 