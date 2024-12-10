package DaireHesab;

import java.util.Scanner;

public class BuyuktenKucuge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner input= new Scanner (System.in);
		
		int sayi1, sayi2, sayi3;
		System.out.println("sayi1 girin:");
		sayi1=input.nextInt();
		System.out.println("sayi2 giriniz:");
		sayi2= input.nextInt();
		System.out.println("sayi3 giriniz:");
		sayi3=input.nextInt();
		
		
		if (sayi1>sayi2 && sayi1>sayi3) {
			if( sayi2 > sayi3) {
				System.out.println(" sayi1 > sayi2 >sayi3");	
			}else {
				System.out.println("sayi1> sayi3 > sayi2");
			}
		}else if (sayi2 >sayi1 && sayi2 >sayi3) {
			if (sayi1 >sayi3) {
				System.out.println("sayi2> sayi1 >sayi3");
			}else {
				System.out.println("sayi2>sayi3>sayi");
			}
		}else {
			if (sayi1 >sayi2) {
			System.out.println("sayi3>sayi1>sayi2");
			
		}else {
			System.out.println("sayi3 >sayi2 >sayi1");
		}
		
	}

}
}