package javaNormal;

import java.util.Scanner;

public class ders13_soru1_1 {

	public static void main(String[] args) {
		//  Kullan�c�da 3 say� alarak bunlardan en b�y�k ve en k�����n ortalamas�n� bularak ekrana yazd�r�n�z?

		Scanner scan = new Scanner(System.in);
		int a,b,c;
		System.out.println("a say�s� : ");
		a = scan.nextInt();
		System.out.println("b say�s� : ");
		b = scan.nextInt();
		System.out.println("c say�s� : ");
		c = scan.nextInt();
		
		int eb,ek;
		
		if(a>b && a>c) {
			eb=a;
		} else if(b>a && b>c) {
			eb=b;
		} else {
			eb=c;
		}
		
		if(a<b && a<c) {
			ek=a;
		} else if(b<a && b<c) {
			ek=b;
		} else {
			ek=c;
		}
		
		System.out.println("Toplam ="+ (eb+ek));
		System.out.println("Ortalama ="+ (float)(eb+ek)/2);
	}

}
