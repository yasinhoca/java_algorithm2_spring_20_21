package javaNormal;

import java.util.Scanner;

public class ders34_method_ornek {
	
	static void harfHarf(String s) {
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+"-");
			}
		System.out.println();
		for(int i=0;i<s.length();i++) {
			System.out.print((int)s.charAt(i)+"-");
			}
	}

	public static void main(String[] args) {
		// kendisine g�nderilen stringi harf harf ay�rarak yazan method
		// ascii kodlar�n� bulan
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir metin giriniz:");
		String s = scan.nextLine();
		harfHarf(s);

	}

}
