interface PhoneNumber{
	boolean numberFormat(String num);
}
abstract class Country implements PhoneNumber{
	boolean isNumber(char a){
		if (a >= '0' && a <= '9'){
    		return true;
    	}
		else
			return false;
	}
}
class Brazil extends Country{
	public boolean numberFormat(String num){
		String abc = num;
		char[] gfg = abc.toCharArray();
		int f1=0;
		int f2=0;
		if(abc.length() != 15){
			return false;
		}
		if((gfg[0] == '+')&&(gfg[1]=='5')&&(gfg[2]=='5')&&(gfg[3]=='1')&&(gfg[4]=='5')&&(gfg[10]=='-')){
		f1 = 1;}
		for(int i=5;i<abc.length();i++){
			if(i != 10){
				if(!(super.isNumber(gfg[i]))){
					f2=1;
				}
			}
		}
		if((f1 == 1)&&(f2 == 0)){
			return true;
		}
		else{
			return false;
		}
	}
}
class India extends Country{
	public boolean numberFormat(String num){
		String abc = num;
		char[] gfg = abc.toCharArray();
		int f1=0;
		int f2=0;
		if(abc.length() != 14){
			return false;
		}
		if((gfg[0] == '+')&&(gfg[1]=='9')&&(gfg[2]=='1')&&(gfg[3]=='-')){
		f1 = 1;}
		for(int i=4;i<abc.length();i++){
			
				if(!(super.isNumber(gfg[i]))){
					f2=1;
				}
			
		}
		if((f1 == 1)&&(f2 == 0)){
			return true;
		}
		else{
			return false;
		}

	}
}
class Norway extends Country{
	public boolean numberFormat(String num){
		String abc = num;
		char[] gfg = abc.toCharArray();
		int f1=0;
		int f2=0;
		if(abc.length() != 15){
			return false;
		}
		if((gfg[0] == '+')&&(gfg[1]=='4')&&(gfg[2]=='7')&&(gfg[3]=='-')&&(gfg[6]=='-')&&(gfg[9]=='-')&&(gfg[12]=='-')){
		f1 = 1;}
		for(int i=4;i<abc.length();i++){
			if((i != 6) && (i != 9) && (i != 12)){
				if(!(super.isNumber(gfg[i]))){
					f2=1;
				}}
			
		}
		if((f1 == 1)&&(f2 == 0)){
			return true;
		}
		else{
			return false;
		}
	}
}
class Qatar extends Country{
	public boolean numberFormat(String num){
		String abc = num;
		char[] gfg = abc.toCharArray();
		int f1=0;
		int f2=0;
		if(abc.length() != 13){
			return false;
		}
		if((gfg[0] == '+')&&(gfg[1]=='9')&&(gfg[2]=='7')&&(gfg[3]=='4')&&(gfg[8]=='-')){
		f1 = 1;}
		for(int i=4;i<abc.length();i++){
			if(i != 8){
				if(!(super.isNumber(gfg[i]))){
					f2=1;
				}
			}
		}
		if((f1 == 1)&&(f2 == 0)){
			return true;
		}
		else{
			return false;
		}
	}
}
class Turkey extends Country{
	public boolean numberFormat(String num){
		String abc = num;
		char[] gfg = abc.toCharArray();
		int f1=0;
		int f2=0;
		if(gfg[0] == '+'){
			if(abc.length() != 13){
				return false;
			}
			if((gfg[0] == '+')&&(gfg[1]=='9')&&(gfg[2]=='0')&&(gfg[3]=='5')&&(gfg[4]=='0')&&(gfg[5]=='9')&&(gfg[6]=='-')){
				f1 = 1;}
			for(int i=7;i<abc.length();i++){
				
					if(!(super.isNumber(gfg[i]))){
						f2=1;
					}
			}
			if((f1 == 1)&&(f2 == 0)){
				return true;
			}
			else{
				return false;
			}
			
			
		}
		else if(gfg[0] == '0'){
			if(abc.length() != 12){
				return false;
			}
			if((gfg[0] == '0')&&(gfg[1]=='5')&&(gfg[2]=='0')&&(gfg[3]=='9')&&(gfg[4]=='-')&&(gfg[8]=='-')){
				f1 = 1;}
			for(int i=5;i<abc.length();i++){
				if( i != 8){
					if(!(super.isNumber(gfg[i]))){
						f2=1;
					}}
			}
			if((f1 == 1)&&(f2 == 0)){
				return true;
			}
			else{
				return false;
			}
			
		}
		else
		{
			return false;
		}
	
	}
}
public class CountryServe{
	public static void main(String[] args){
		India i=new India();
		boolean a = i.numberFormat("+911-99999999");
		System.out.println(a);
		Brazil b=new Brazil();
		boolean b1 = b.numberFormat("+551599999-9999");
		System.out.println(b1);
		Norway n=new Norway();
		boolean c = n.numberFormat("+47-49-99-99-99");
		System.out.println(c);
		Qatar q=new Qatar();
		boolean d = q.numberFormat("+9743399-9999");
		System.out.println(d);
		Turkey t=new Turkey();
		boolean e = t.numberFormat("0509-999-999");
		System.out.println(e);

	}
}
