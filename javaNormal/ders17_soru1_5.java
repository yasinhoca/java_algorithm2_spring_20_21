package javaNormal;

import java.util.Scanner;

public class ders17_soru1_5 {

	public static void main(String[] args) {
		// �kinci dereceden denklemin diskriminant ��z�m�n� yaz�n�z?
		int a,b,c;
		float delta,k1,k2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("a say�s� : ");
		a = scan.nextInt();
		System.out.println("b say�s� : ");
		b = scan.nextInt();
		System.out.println("c say�s� : ");
		c = scan.nextInt();
		
		delta = (float) (Math.pow(b, 2) - (4*a*c));
		System.out.println("Delta = "+delta);
		
		if(delta>0) {
			k1 = (float) (-b - Math.sqrt(delta)) / (2*a);
			k2 = (float) (-b + Math.sqrt(delta)) / (2*a);
			System.out.println("�ki k�k vard�r =" + k1 +" , "+ k2 );
		} if(delta==0) {
			k1 = (float) -b/(2*a);
			System.out.println("�ak���k k�k = "+ k1);
		} else {
			System.out.println("K�k yoktur");
		}
		
		
	}

}
