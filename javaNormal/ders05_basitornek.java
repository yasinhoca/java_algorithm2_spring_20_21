package javaNormal;

import java.util.Scanner;

public class ders05_basitornek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,toplam;
		System.out.println("a say�s�n� giriniz:");
		a = scan.nextInt();
		System.out.println("b say�s�n� giriniz:");
		b = scan.nextInt();
		toplam = a + b;
		System.out.println("Toplam = "+ toplam);
		float ortalama = (float) toplam / 2;
		System.out.println("Ortalama = " + ortalama);
	}

}
