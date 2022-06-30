package javaNormal;

import java.util.Random;
import java.util.Scanner;

public class ders27_soru_3_2 {

	public static void main(String[] args) {
		// Kullan�c�dan sat�r ve s�tun say�s�n� ald���n�z 2 matrisi 0-5 aras�ndaki rastgele say�lar ile doldurup, iki matrisi toplay�n�z?
		int satir,sutun;
		Scanner scan = new Scanner(System.in);
		System.out.println("Sat�r=");
		satir = scan.nextInt();
		System.out.println("S�tun=");
		sutun = scan.nextInt();

		int[][] m1 = new int[satir][sutun];
		int[][] m2 = new int[satir][sutun];
		int[][] mt = new int[satir][sutun];

		Random r = new Random();

		int i,j;

		for(i=0;i<satir;i++) {
			for(j=0;j<sutun;j++) {
				m1[i][j]=r.nextInt(5);
				m2[i][j]=r.nextInt(5);
				mt[i][j]=m1[i][j]+m2[i][j];
			}
		}

		System.out.println("\nMatris1");
		for(i=0;i<satir;i++) {
			for(j=0;j<sutun;j++) {
				System.out.print(m1[i][j]+ "  ");
			}
			System.out.println();
		}
		System.out.println("\nMatris2");
		for(i=0;i<satir;i++) {
			for(j=0;j<sutun;j++) {
				System.out.print(m2[i][j]+ "  ");
			}
			System.out.println();
		}
		System.out.println("\nMatris Toplam");
		for(i=0;i<satir;i++) {
			for(j=0;j<sutun;j++) {
				System.out.print(mt[i][j]+ "  ");
			}
			System.out.println();
		}

	}

}
