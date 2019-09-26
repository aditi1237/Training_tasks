import java.util.*;
import java.io.*;
public class Task2 {
	public static boolean hasDigit(String data)   
	{
		String s_input = data; 
        
        char[] gfg = s_input.toCharArray();
        for(int i=0;i < gfg.length;i++){
        	if (gfg[i] >= '0' && gfg[i] <= '9'){
        		return true;
        	}
        	
        }
        return false;
	}
	public static void main(String[] args)throws IOException{
		String s_input = "";
		System.out.println("Enter the string to be checked:");
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));  
        s_input= reader.readLine();
        
        boolean x = hasDigit(s_input);
        System.out.println(x);
		
		
	}
}
