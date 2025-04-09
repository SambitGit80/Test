package Practice;

import java.util.Scanner;

public class C_F {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter Celcious");
	double C=sc.nextDouble();
	
	double F=C*9/5+32;
	System.out.println(C+"is equal to "+F);
	
}
}
