import java.io.*;
class filecopy 
{
	public static void main(String args[]) throws  IOException 
	
	{
		FileInputStream ifile = null;
		FileOutputStream ofile = null;
		byte byRead;
		try
		{
			
	  ifile = new FileInputStream("first.txt");
	  ofile = new FileOutputStream("second.txt");
	  do 
	  {
		  byRead = (byte) ifile.read();
		  ofile.write(byRead);
	  }while(byRead!=-1);
	  
	}catch (IOException  e)
	{
		System.out.println(e.getMessage());
	}
	finally 
	{
		ifile.close();
		ofile.close();
	}
	
	}
	
}