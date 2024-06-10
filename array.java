import java.util.*;
class array
{
	public static void main(String args[])
	{
	 int a [][] = new int [3][3];
     int b [][] = new int [3][3];
     int c [][] = new int [3][3];
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number of first matrix");
     int i,j;
     for (i=0; i<3; i++)
	 {
        for (j=0;j<3;j++)
		{
			a[i][j] = sc.nextInt();
			
	    } 
	 }	


     System.out.println("Enter number of second matrix");
     
     for (i=0; i<3; i++)
	 {
        for (j=0;j<3;j++)
		{
			b[i][j] = sc.nextInt();
			
	    } 
	 }	
	 
	  for (i=0; i<3; i++)
	 {
        for (j=0;j<3;j++)
		{
			c[i][j] = a[i][j] + b[i][j]; 
			
	    } 
	 }
	  for (i=0; i<3; i++)
	 {
		 System.out.println(c[i]); 
        for (j=0;j<3;j++)
		{
			System.out.println(c[j]);  
			
	    } 
	 }
	 
	}
}