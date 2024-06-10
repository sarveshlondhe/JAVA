import java.io.*;
class simplewrite
{
public static void main(String args[])
{
try
{
FileOutputStream fout=new FileOutputStream("output.txt");
String s="Java is my favorite language";
byte b[]=s.getBytes();
fout.write(b);
fout.close();
System.out.println("Success...");
}catch(Exception e)
 {
System.out.println(e);
 }
}
}