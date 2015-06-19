package demo_test;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.junit.Test;

public class MathDemo {
	
	@Test
	public void testMath(){
		String str = new DecimalFormat("#.####").format(66.999-50.212); //5.2899
		System.out.println(str);
		int index =  str.indexOf(".");
		if(index == -1){
			
		}
		//System.out.println(str.substring(0, str.indexOf(".")+3));
		
		/*String str = new DecimalFormat("#.####").format(5458989.558910056756-5454.268990000567567567567567); //5.2899
		System.out.println(str);
		System.out.println(str.substring(0, str.indexOf(".")+3));*/

	}
	@Test
	public void testMath2(){
		String  result = "";
		String str =  -1441232.06999999+"";
		String[] strs = str.split("\\.");
		if(strs.length>1){
			String s = strs[1];
			if(s.length()>=2){
				result = strs[0]+"."+s.substring(0, 2);
			}else{
				result = str;
			}
		}else{
			result = str;
		}
		System.out.println(result);
	}
	@Test
	public void testTime(){
		Long haomiao = 2325654654656L; //毫秒值
		//Long haomiao = System.currentTimeMillis(); //当前系统时间毫秒值
		Date d = new Date(haomiao);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:ss:mm").format(d));
	}

	@Test
	public void mathBase(){
		/*System.out.println(7800+504*7);
		System.out.println(15000-7800 - 504*7);*/
	
		Integer s = 2;
		System.out.println("2".equals(s));
		System.out.println("2".equals(2+""));		
		
	}
	@Test
	public void sort(){
		int[] a = {2,5,2,1,3,44,565,22,12,4,56,67,23,313,131,345,345,3};
		int temp=0;
		for(int i=a.length-1;i>0;i--){
			for(int j=0; j<i; j++){
				if(a[j+1] < a[j]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	public int count(String word,char c){
		int count = 0;
		char[] cs = word.toCharArray();
		for (char sign : cs) {
			if(sign == c){
				count++;
			}
		}
		return count;
	}
	@Test
	public void countT(){
		System.out.println(count("asasdasdasd",'a'));
	}
	
	
	
}

