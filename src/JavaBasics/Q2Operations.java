package JavaBasics;

public class Q2Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Q2Operations obj=new Q2Operations();
obj.print();

	}
	public void print() {
	int a=-5 + 8 * 6;
	System.out.println("result of first operation"+a);

	float b= (55+9) % 9;
	System.out.println("result of second operation"+b);
	float c= 20 + -3*5 / 8;
	System.out.println("result of third operation"+c);
	float d= 5 + 15 / 3 * 2 - 8 % 3;
	System.out.println("result of fourth operation"+d);
}
}