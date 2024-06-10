package myPack;
import java.util.Scanner;
interface inter
{
    void Add();
}
class BaseClass
{
    int a,b;
    void dismax()
    {
        Scanner sc = new Scanner(Sstem.in);
        System.out.print("Enter fist number : ");
        a= sc.nextInt();
        System.out.print("Enter second number : ");
        b= sc.nextInt();
        System.out.println("greater number"+(a>b?a:b));
        
    }
}
class DerivedClass extends BaseClass implements inter
{
    
    public void Add()
    {
        System.out.print("addition is : "+(a+b));
        
    }
    
}
class main
{
    public static void main(String[] args) {
        DerivedClass d = new DerivedClass();
        d.dismax();
        d.Add();
    }
}

// Write A Program To Create Interface And Void Add();
// base class contain disMax Method 
// to get the two numbers from user 
// derived class display the addition of the numbers 

