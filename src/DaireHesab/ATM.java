package DaireHesab;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		int bakiya = 1000, input=0 ,miktar=0, paraYatir ;
		Scanner scan = new Scanner (System.in);
	
		
		System.out.println("merhaba bankaya hosgeldiniz:");
		System.out.println("guncel bakiya :"+bakiya + "tl");
		
		while (bakiya > 0) {
			System.out.println ("");
			System.out.println("1 - para yatir ");
			System.out.println("2- para cek");
			System.out.println("3- bakiya sorgula  ");
		   System.out.println("4 - cikis yap");
		   System.out.print("yapmak istediniz islem seciniz:");
		   input = scan.nextInt();

   if (input == 1) {
	   System.out.println("yatirmak istediniz para");
		miktar =scan.nextInt();
		bakiya +=miktar;
	
		
		
}else if (input == 2) {
	System.out.println("cikmek istediniz miktar");
	miktar=scan.nextInt();
	if (miktar> bakiya) {
	System.out.println("yetersiz bakiya");
	}else {
	bakiya -=miktar;
	
}
	
}else if (input == 3) {
	System.out.println("guncel bakiya :"+bakiya + "tl");
	
}else if ( input == 4) {
	System.out.println("cikis yapildi ");
	break;

	
}else {
	System.out.println("GECERSIZ ISLEM");
}
	}
System.out.println("bekleriz");
}

}


