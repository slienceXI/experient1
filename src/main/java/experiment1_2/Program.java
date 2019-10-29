package experiment1_2;

import java.util.ArrayList;

import org.apache.commons.lang3.math.NumberUtils;

public class Program {
	public boolean flag(int temp1, int temp2) {
		//注入错误 == 变为 <=
		//if(temp1 == temp2)
		if(temp1 <= temp2)
			return true;
		System.out.println("not a Integer");
		return false;
	}
	//子程序功能：将所有表示整数的字符串转换为整型，最后返回ArrayList
	@SuppressWarnings("deprecation")
	public ArrayList<Integer> function(String str[]) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		int i = 0;
		while(i < str.length) {
			if(NumberUtils.isNumber(str[i])) {
				int temp1, temp2;
				temp1 = NumberUtils.toInt(str[i], -1);
				temp2 = NumberUtils.toInt(str[i]);
				if(flag(temp1, temp2))
					l.add(temp1);
			 }
			 else
				 System.out.println("not a number");
			 i++;
		 }
		 return l;
	 }	 
	 public static void main(String args[]) {
		 String str[] = new String[] {
			"1", "2", "3.1", "ds", "0051"	 
		 };
		 Program p = new Program();
		 ArrayList<Integer> l = p.function(str);
		 System.out.println(l);
	 }
}

