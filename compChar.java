import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class compChar {
	
	public boolean comp(char first,char second)   
	{
		char a = first;
		char b = second;
        if (((a >= 65 && a<=90) || (a>=97 && a<=122))&&( (b >= 65 && b<=90) || (b>=97 && b<=122)) ){
        	if(((a>b) && (a-b == 32)) || ((a<b) && (b-a == 32)) || (a == b)){
        		return true;
        	}
        	else
        		return false;
        		
        }
        else
        	return false;
      
	}
	
	public static void main(String[] args)throws IOException{
		
		compChar obj=new compChar();
		char old;
		char new_char;
		System.out.println("Enter first character:");
		BufferedReader reader1 =  new BufferedReader(new InputStreamReader(System.in));  
        old= (char)reader1.read();
        
        System.out.println("Enter second character:");
		BufferedReader reader2 =  new BufferedReader(new InputStreamReader(System.in));  
        new_char= (char)reader2.read();
        boolean x = obj.comp(old,new_char);
        System.out.println(x);
        
	}
}
