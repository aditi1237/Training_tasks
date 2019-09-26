import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
	public static boolean isCapsOnly(String data)   
	{
		String s_input = data; 
		int flag = 0;
        
        char[] gfg = s_input.toCharArray();
        for(int i=0;i < gfg.length;i++){
        	if (gfg[i] >= 'a' && gfg[i] <= 'z'){
        		flag = 1;
        	}        	
        }
        if(flag == 1){
        return false;}
        else{
        	return true;
        }
	}
	public static void main(String[] args)throws IOException{
		String s_input = "";
		System.out.println("Enter the string to be checked:");
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));  
        s_input= reader.readLine();
        
        boolean x = isCapsOnly(s_input);
        System.out.println(x);
		
		
	}
}
