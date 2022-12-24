package week1.day1;

public class Calculator {
public void addTwoNum(int a, int b) {
	System.out.println(a+b);
}
public void addThreeNum(int x,int y,int z) {
	System.out.println(x+y+z);
}
public void mulTwoNum(int p,int q) {
	System.out.println(p*q);
}
public void mulNum(int m,double n) {
	System.out.println(m*n);
}
public void subNum(int c, int d) {
	System.out.println(c-d);
}
public void subTwoNum(double l, double k) {
    System.out.println(l-k);
}
public void divNum(int r, int s) {
	System.out.println(r/s);
}
public void divTwoNum(double u, int v) {
	System.out.println(u/v);
}
	public static void main(String[] args) {
		Calculator cl=new Calculator();
		cl.addTwoNum(20,30);
		cl.addThreeNum(20,30,50);
		cl.mulTwoNum(20, 30);
		cl.mulNum(20, 16.5d);
		cl.subNum(50, 30);
		cl.subTwoNum(120.50d, 100.50d);
		cl.divNum(100, 50);
		cl.divTwoNum(200.50d, 50);
	}

}
