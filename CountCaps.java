import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountCaps {
	public static int countCAP(String data)   
	{
		String s_input = data; 
		int count = 0;
        
        char[] gfg = s_input.toCharArray();
        for(int i=0;i < gfg.length;i++){
        	if (gfg[i] >= 'A' && gfg[i] <= 'Z'){
        		count++;
        	}
        	
        }
        return count;
	}
	public static void main(String[] args)throws IOException{
		String s_input = "";
		System.out.println("Enter the string to be checked:");
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));  
        s_input= reader.readLine();
        
        int x = countCAP(s_input);
        System.out.println(x);
		
		
	}
}
