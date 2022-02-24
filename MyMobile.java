package week1.day2;

public class MyMobile {
	static boolean ismobileswitchedoff = false;
	static long mobileno=9790740775l;
	static int num=12345;
	static char name='k';
	static float mblversion=10.23f;
	public void makecall() {
		System.out.println("makecall");
				
	}
	public void sendmsg() {
		System.out.println("sendmsg");
		
	}
private void paybills() {
	System.out.println("paybills");
	
}
		
	public static void main(String[] args) {
		MyMobile obj=new MyMobile();
		System.out.println(ismobileswitchedoff)	;
		System.out.println(mobileno);
		System.out.println(num);
		System.out.println(name);
		System.out.println(mblversion);
		obj.makecall();
		obj.sendmsg();
		obj.paybills();
	} 
	
	}

