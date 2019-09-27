import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class compString {
	public boolean comp(String first,String second)   
	{
		String one = first;
		String two = second;
		int flag = 0;
		char[] gfg = one.toCharArray();
		char[] gfg1 = two.toCharArray();
		if(one.length() != two.length()){
			return false;
		}
		else
		{
			for(int i=0;i<one.length();i++){
				if(((gfg[i]>gfg1[i]) && (gfg[i]-gfg1[i] == 32)) || ((gfg1[i]<gfg[i]) && (gfg1[i]-gfg[i] == 32)) || (gfg[i] == gfg1[i]))
				{
					continue;
				}
				else
				{
					flag =1;
				}
			}
		}
		if(flag == 1)
			return false;
		else
			return true;
	}
	public static void main(String[] args)throws IOException{
		compString obj=new compString();
 		String one="";
 		String two="";
 		System.out.println("Enter first string:");
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));  
        one = reader.readLine();
 		
        System.out.println("Enter second string:");
		BufferedReader reader1 =  new BufferedReader(new InputStreamReader(System.in));  
        two = reader1.readLine();
        
        boolean x = obj.comp(one,two);
        System.out.println(x);
 		
	}
}
