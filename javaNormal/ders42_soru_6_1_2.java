package javaNormal;

import java.util.Random;
import java.util.Scanner;

public class ders42_soru_6_1_2 {
	
	static int[][] matrisYap(int satir,int sutun){
		int[][] m = new int[satir][sutun];
		Random r = new Random();
		for(int i=0;i<satir;i++) {
			for(int j=0;j<sutun;j++) {
				m[i][j] = r.nextInt(40)+10;
			}
		}		
		
		return m;
	}
	
	static void matrisYaz(int[][] m,int satir,int sutun) {
		for(int i=0;i<satir;i++) {
			for(int j=0;j<sutun;j++) {
				System.out.print(m[i][j]+ "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static int[][] matrisTopla(int[][] m1,int[][]m2,int satir,int sutun){
		int[][] mt = new int[satir][sutun];
		for(int i=0;i<satir;i++) {
			for(int j=0;j<sutun;j++) {
				mt[i][j] = m1[i][j]+m2[i][j];
			}
		}
		return mt;
	}

	public static void main(String[] args) {
		//1-Kendisine g�nderilen sat�r ve s�tun bilgilerine g�re rastgele matris �retip return eden methodu yaz�n�z?
	    //2-Kendisine g�nderilen iki matrisi toplay�p sonucu g�nderen matrisi methodu yaz�n�z?
		int satir,sutun;
		Scanner scan = new Scanner(System.in);
		System.out.println("Sat�r say�s�:");
		satir = scan.nextInt();
		System.out.println("S�tun say�s�:");
		sutun = scan.nextInt();
		int[][] m1 = matrisYap(satir, sutun);
		matrisYaz(m1, satir, sutun);
		int[][] m2 = matrisYap(satir, sutun);
		matrisYaz(m2, satir, sutun);
		int[][] mt = matrisTopla(m1, m2, satir, sutun);
		matrisYaz(mt, satir, sutun);
	}

}
