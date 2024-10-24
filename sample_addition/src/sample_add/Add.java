package sample_add;
import java.util.*;
public class Add {
	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a and b values: ");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println("Addition of a="+a+" and b="+b+" is:"+c);
	}

}
