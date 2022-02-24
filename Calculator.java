package week1.day2;

public class Calculator 
{
	static int num1=10,num2=20,num3=40,add,sub,n1,n2,sum,res;
	static double num4=45,num5=55,mul;
	static float num6=24,num7=12,div;
	public void add(int num1,int num2,int num3) 
	{
		add=num1+num2+num3;
		System.out.println("sum of"+add);
		
	}
	public int sum(int num1,int num2) {
		
		res=num1+num2;
		return res;
			
	}
	
	public void sub()
	{
		
		sub=num1-num2;
		System.out.println("sub of"+sub);
	}
	public void mul()
	{
		mul=num4*num5;
		System.out.println("double of"+mul);
	
	}
public void div()
{
	div=num6/num7;
	System.out.println("float of"+div);

}

public static void main(String[] args) 
{
	Calculator calc =new Calculator();
	calc.add(12,13,14);
	calc.sub();
	calc.mul();
	calc.div();
	sum=calc.sum(num1,num2);
	System.out.println("sum of return valueis"+sum);

}
}