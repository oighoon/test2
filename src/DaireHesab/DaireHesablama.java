package DaireHesab;

import java.util.Scanner;

public class DaireHesablama {
	
	public static void main(String[] args) {
	double alan ,hacim, pi =3.14;
	int r ;

	
	Scanner input = new Scanner(System.in);
	
	System.out.println("alani giriniz:");
	r =input.nextInt();
	
	alan=2* pi * r;
	hacim = pi *(r*r);
	System.out.println("alan"+alan);
	System.out.print(hacim);
	
	
	
	
	
}
	
}