package DaireHesab;

import java.util.Scanner;

public class Etkinlik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int sicaklik ;
		
	System.out.println("hava durumu nedir:");
	sicaklik = input.nextInt();
	
	if (sicaklik > 30 ) {
		System.out.println("hava sicak yuzmaya gidebilisin:");
		
	}else if (sicaklik <=30 && sicaklik>=5) {
		
	System.out.println("sinema gitmeni oneririm:");
	
	
	}else   {
		System.out.println("kayanma oneririm");
	}

}
}
