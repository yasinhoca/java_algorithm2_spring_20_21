package javaNormal;

import java.util.Scanner;

public class ders08_switch_case {

	public static void main(String[] args) {
		// Switch - case ko�ul yap�s�
		
		int  sayi1,sayi2,islem;
		float sonuc;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�lk say�y� giriniz:");
		sayi1 = scan.nextInt();
		System.out.println("�kinci say�y� giriniz:");
		sayi2 = scan.nextInt();
		System.out.println("Hangi i�lemi yapmak istiyorsunuz? \n1-Toplama 2-��kartma 3-�arpma 4-B�lme");
		islem = scan.nextInt();
		
		switch (islem) {
		case 1:
			sonuc = sayi1 + sayi2;
			System.out.println("�ki say�n�n toplam� = " + sonuc);
			break;
		case 2:
			sonuc = sayi1 - sayi2;
			System.out.println("�ki say�n�n fark� = " + sonuc);
			break;
		case 3:
			sonuc = sayi1 * sayi2;
			System.out.println("�ki say�n�n �arp�m� = " + sonuc);
			break;
		case 4:
			sonuc = (float) sayi1 / sayi2;
			System.out.println("�ki say�n�n b�l�m� = " + sonuc);
			break;
		default:
			System.out.println("1-4 aras� se�im yap�n�z!");
			break;
		}
		
	}

}
