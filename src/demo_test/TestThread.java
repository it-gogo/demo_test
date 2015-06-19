package demo_test;

public class TestThread {
	public static void main(String[] args){
		Xc x=new Xc();
		Thread a=new Thread(x);
		a.setName("1");
		a.start();

		Xc C=new Xc();
		Thread b=new Thread(C);
		b.setName("2");
		b.start();
	}
}
class Xc implements Runnable{
	static int CP=100;
	String a=new String("1");
	public void run(){
		while(true){
			synchronized(Xc.class){
				if(CP>0){
					System.out.println("第"+Thread.currentThread().getName()+"个车站正在售出第"+(101-CP)+"张车票");
					--CP;
				}else{
					break;
				}
			}

		}
	}

}

