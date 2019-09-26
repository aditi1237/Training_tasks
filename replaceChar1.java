import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class replaceChar1 {
	public String replace(String data,char inp,char rep)   
	{
		String s_input = data;
		String s_output = "";
		char old = inp;
		char new_c=rep;
		int flag = 0;
        
        char[] gfg = s_input.toCharArray();
        for(int i=0;i < gfg.length;i++){
        	if (gfg[i] == old && flag!=1){
        		gfg[i]=new_c;
        		flag =1;
        	}
       
        	s_output += gfg[i];
        }
        
        return s_output;
	}
	public static void main(String[] args)throws IOException{
		replaceChar1 obj=new replaceChar1();
		String s_input = "";
		char old;
		char new_char;
		
		System.out.println("Enter the string to be checked:");
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));  
        s_input= reader.readLine();
        
        System.out.println("Enter the character to be replaced:");
		BufferedReader reader1 =  new BufferedReader(new InputStreamReader(System.in));  
        old= (char)reader1.read();
        
        System.out.println("Enter the character to be replaced with:");
		BufferedReader reader2 =  new BufferedReader(new InputStreamReader(System.in));  
        new_char= (char)reader2.read();
        
      
        
       String x = obj.replace(s_input,old,new_char);
       System.out.println(x);
		
		
	}

}
