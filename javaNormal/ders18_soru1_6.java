package javaNormal;

import java.util.Scanner;

public class ders18_soru1_6 {

	public static void main(String[] args) {
		// Bir ��gende bir kenar�n uzuznlu�u, di�er iki kenar�n toplam�ndan b�y�k, fark�ndan k���k olamaz. Kullan�c�dan 2 kenar uzunlu�u alarak 3. kenar�n max ve min alabilece�i de�eri hesaplay�n�z.
		int  a,b;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("a say�s� : ");
		a = scan.nextInt();
		System.out.println("b say�s� : ");
		b = scan.nextInt();
		
		int min = Math.abs(a-b);
		int max = Math.abs(a+b);
		
		System.out.println("Min = "+min+ "  Max = "+max);
		
		
	}

}
