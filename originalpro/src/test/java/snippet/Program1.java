package snippet;

public class Program1 {
	
	public static void main(String[] args) {
		int a=12;
		int b=54;
		Program1 p=new Program1();
		System.out.println("addition of two numbers is :"+p.add(a,b));
		System.out.println("multiply of two numbers is :"+p.multiply(a,b));
	}
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public int multiply(int a,int b) {
		int c=a*b;
		return c;
	}
}
