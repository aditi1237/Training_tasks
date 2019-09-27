import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class revCap {
	public String convert(String input){
		String s_out = input;
		int caps = 0;
		int low = 0;
		int flag[];
		flag =  new int[s_out.length()];
		char[] gfg = s_out.toCharArray();
		char[] gfg1 = s_out.toCharArray();
		for(int i=0;i <s_out.length();i++){
			if(gfg1[i] >= 65 && gfg1[i]<=90 )
			{
					flag[i] = 0;
			}
			if(gfg1[i] >= 97 && gfg1[i]<=122 )
			{
				flag[i] = 1;
			}
			if((gfg1[(gfg1.length-1)-i] >= 65 && gfg1[(gfg1.length-1)-i]<=90) && (flag[i] == 1)){
				gfg[i] = (char) (gfg1[(gfg1.length-1) - i] + 32);
			}
			else if((gfg1[(gfg1.length-1)-i] >= 97 && gfg1[(gfg1.length-1)-i]<=122) && (flag[i] == 0)){
				gfg[i] = (char) (gfg1[(gfg1.length-1) - i] - 32);
			}
			else
			{
				gfg[i] = gfg1[(gfg1.length -1)- i];
			}
			
		}
		s_out = "";
		for(int j=0;j<gfg.length;j++){
        	s_out += gfg[j]; 
        }
		return s_out;
	}
	public static void main(String[] args)throws IOException{
		revCap obj=new revCap();
 		String one="";
 	
 		System.out.println("Enter first string:");
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));  
        one = reader.readLine();
        String x = obj.convert(one);
        System.out.println(x);
	}
}
