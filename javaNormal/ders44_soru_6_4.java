package javaNormal;

import java.util.Scanner;

public class ders44_soru_6_4 {

	public static void main(String[] args) {
		// Girilen saati yaz�yla yazd�rmak. Saat 24 saat format�nda ve SS:DD  (saat
		// ve dakika) �eklinde girilecek. Yaz� ile yazd�r�ld�ktan sonra; ��leden
		// �nce �� ve ��leden sonra �S �eklinde ek yazd�r�lacak.
		String[] hour = {"oniki","bir","iki","��","d�rt","be�","alt�","yedi","sekiz","dokuz","on","onbir"};
		String[] mo = {"s�f�r","on","yirmi","otuz","k�rk","elli"};
		String[] mb = {"","bir","iki","��","d�rt","be�","alt�","yedi","sekiz","dokuz"};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Saati giriniz:");
		String zaman = scan.next();
		String saat = Character.toString(zaman.charAt(0)) + Character.toString(zaman.charAt(1));
		int s = Integer.parseInt(saat);
		System.out.print(hour[s%12]+ " ");
		int onlar = Integer.parseInt(Character.toString(zaman.charAt(3)));
		System.out.print(mo[onlar]);
		int birler = Integer.parseInt(Character.toString(zaman.charAt(4)));
		System.out.print(mb[birler]+"  ");
		if(s<12) System.out.print("��"); else System.out.print("�S");
		
	}

}
