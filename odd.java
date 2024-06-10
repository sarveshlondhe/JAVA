import java.util.*;
class odd 

{
// 	 public void run(){
// 		 Scanner sc = new Scanner (System.in);
// 		 int num;
// 		 System.out.print("enter number");
// 		 num= sc.nextInt();
	
	 
// 		 if(num%2==0)
// 		 {
// 			 System.out.print("NUmber is even");
// 		 }
		 
// 		 else
// 		 {
// 			 System.out.println("number is odd");
// 		 }
	 
// 	}
// 	public static void main(String args[])
// 	{ 
// 	odd  n= new odd();
// 	n.run();
	
// 	}
// }
public static void main(String args[])
{
	odd1 n= new odd1();
	n.run();
	odd2 r= new odd2();
	r.run();


}
}
class odd1 extends Thread
{
  public void run(){

  
	for(int i=0; i<10;i++)
	{
		System.out.println(i);
		try {
			sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
 }
}
class odd2 extends Thread
{
  public void run(){

  
	for(int i=10; i>0;i--)
	{
		System.out.println(i);
		try {
			sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
 }
}