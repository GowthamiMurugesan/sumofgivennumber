package guvi;

import java.util.Scanner;

public class Swap {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int a,b;
	int temp;
	a=in.nextInt();
	b=in.nextInt();
	temp=a;
	a=b;
	b=temp;
	System.out.println(a);
System.out.println(b);
}
}
