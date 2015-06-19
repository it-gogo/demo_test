package demo_test;

public class TestStatic {
	public static void main(String [] a) {
		int i =0;
		while(i<10){
			i++;
			if(i==5){
				continue;
			}
		}
		System.out.println(i);
	}

}
