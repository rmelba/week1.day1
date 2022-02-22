package week1.day2;

public class Calculator {
	public void add() {
		int k=3;
		int l=7;
		int m=2;
		int sum=k+l+m;
		System.out.println("Add numbers:"+sum);
		}
	public void sub() {
		int a=23;
		int b=12;
		int sub=a-b;
		System.out.println("sub numbers:"+sub);
	}
	public void mul() {
		double c=23d;
		double d=12d;
		double mul=c*d;
		System.out.println("mul numbers:"+mul);
	}
	public void div() {
		float f=2.3f;
		float g=1.2f;
		float div=f/g;
		System.out.println("div numbers:"+div);
	}
	public static void main(String[] args) {
		Calculator n=new Calculator();
		n.add();
		n.sub();
		n.mul();
		n.div();
	}

}
