import java.util.*;
class invalidexception extends Exception 

 {

 invalidexception (String str)
 
      {
        super( str);
      }
 }
 class Accout
 { 
   public static void main(String args[])
   {
   String name;
   int balance;
   Scanner sc = new Scanner (System.in);
   System.out.println("Enter your name");
   name= sc.nextLine();
   System.out.println("Enter your balance");
   balance = sc.nextInt();
   
   try{
   
       if(balance<1500)
	      {
	       throw new invalidexception("Exception caught: balance is less");
	      }
	   else
	      {
	       System.out.println("Blanace is Ok");
	      }
      }
	   catch(invalidexception e){
    

        System.out.println(e.getMessage());

        }	
	   
    }
 
 }