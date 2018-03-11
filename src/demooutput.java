
import java.io.*;

public class demooutput {
	public static String main(String args[]) {
	String st =new String();
	String oldst="";
	String configFile="C:\\Users\\Abhay\\eclipse-workspace\\firstproject\\src\\config1.txt"; 
    try {
    File file = new File(configFile);
    BufferedReader data = new BufferedReader(new FileReader(file));
    //number of items
   
   while((st = data.readLine())!= null) {
	    
	    oldst=oldst+st;
   }
   System.out.print(oldst);
   System.out.println();
}catch(Exception e) {
System.out.println(e);
}
	return oldst;
	
}
}