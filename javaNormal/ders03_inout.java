package javaNormal;

import java.util.Scanner;

public class ders03_inout {

	public static void main(String[] args) {
		// D��ardan veri almak ve yazd�rmak
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("�sminizi giriniz:");
		//String isim = scan.next(); //okuma i�lemi 
		//next komutu bo�luk karakterine kadar okur
		//System.out.println("Ho�geldin " + isim);
		
		System.out.println("�sminizi ve soyisminizi giriniz:");
		String isimSoyisim = scan.nextLine();
		System.out.println("Ho�geldin " + isimSoyisim);
	}

}
