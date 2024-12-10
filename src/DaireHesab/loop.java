package DaireHesab;

import java.util.Scanner;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	
		int temp , birler , onlar,yuzler,toplam;
		for (int i = 100; i<=999 ; i++) {
			temp = i;
			
			birler = temp % 10;
			temp /= 10;
			
			onlar= temp %10;
			temp /=10;
			
			yuzler =temp %10;
			temp /=10;
			
			toplam =(birler *birler * birler)+(yuzler *yuzler*yuzler)+(onlar * onlar*onlar);
			
			if (toplam == i) {
				System.out.println(i+"bir armstrong sayidir");
				*/
		
		
		/*
		
		Scanner scan = new Scanner(System.in);
        int input =scan.nextInt();
        
		int s1=0,s2=1,toplam;
		System.out.println(" fibonacci:");
		
		for(int i= 1 ; i <=input;i++) {
			System.out.println(""+s1);
		  toplam = s1+s2;
		  s1=s2;
		  s2=toplam;
		*/
		
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.println("bir sayi giriniz:");
		int f;
		f = scan.nextInt();
		int sonuc=1;
		for (int i = 1 ; i<=f; i++) {
			sonuc *= i;
			System.out.println(""+sonuc);
		*/
		
		
		Scanner  scan =new Scanner (System.in);
		int s1 ,s2 ,ebob =1 ,ekok;
		System.out.println("iki sayi giriniz:");
		s1 = scan.nextInt();
		s2 =scan.nextInt();
		
		
		int min = (s1 <s2)? s1 : s2 ;
		
		for(int i = min ; i> 0 ;i--) {
			
			if ((s1 % i ==0)&&(s2 %i == 0)) {
				
				ebob = i;
				break;
			}
		}
		
		
	ekok = (s1 *s2)/ebob;
	System.out.println(s1+"ve"+s2+ "sayilar ekoku"+ekok);
	System.out.println(s1+"ve"+s2+"sayilari ebobu"+ebob);
	}
}
		
		
		
		
			
		
		
		
		
	


