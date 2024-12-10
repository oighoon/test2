package DaireHesab;

import java.util.Scanner;

public class ucakBilit {
 
	public static void main (String[]args) {
		
		Scanner input = new Scanner (System.in);
		
		
		int km, yas , tip;
		System.out.println("masafeyi giriniz:");
		km=input.nextInt();
		System.out.println("yasinizi giriniz:");
		yas=input.nextInt();
		System.out.println("\n yolculuk tipini seceniz(1=tek gidis , 2=gidis/donus):");
		tip=input.nextInt();
	
		double normalFiyat,yasIndirim,tipIndirim;
		if (km >0 && yas >0 && (tip==1 || tip==2)) {
			normalFiyat = km * 0.10;
			if (yas < 12 ) {
				yasIndirim = normalFiyat *0.5;
				
			}else if (yas >= 12 && yas <=24) {
				yasIndirim = normalFiyat * 0.10;
				
			}else if (yas >= 65) {
				yasIndirim = normalFiyat *0.30;
				
			}else {
				yasIndirim =0;
			}
			normalFiyat -=yasIndirim;
			if (tip==2) {
				tipIndirim = normalFiyat *0.20;
				normalFiyat =  (normalFiyat - tipIndirim)*2;
				
			}
			System.out.println("bilit tutar :"+ normalFiyat +"$");
		}else {
			System.out.println("girdiniz degerler eksek veya yanlis:");
		}
	}
	
}












































