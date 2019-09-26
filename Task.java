import java.util.*;
import java.io.*;
public class Task {
	public static boolean hasUpper(String data)   
	{
		String s_input = data; 
		int flag = 0;
        
        char[] gfg = s_input.toCharArray();
        for(int i=0;i < gfg.length;i++){
        	if (gfg[i] >= 'A' && gfg[i] <= 'Z'){
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
        
        boolean x = hasUpper(s_input);
        System.out.println(x);
		
		
	}
}
