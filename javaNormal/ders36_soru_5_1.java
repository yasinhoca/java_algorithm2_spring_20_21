package javaNormal;

import java.util.ArrayList;
import java.util.Scanner;

public class ders36_soru_5_1 {
	
	static ArrayList<Integer> donustur(String s){
		ArrayList<Integer> liste = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			liste.add((int)s.charAt(i));
		}		
		return liste;
	}

	public static void main(String[] args) {
		// Kendisine g�nderilen stringin karakterlerinin Ascii 
		// kodlar�n� bir Arrayliste ekleyip return eden methodu yaz�n�z?
		// (Maine Integer Arraylist d�necek)

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string giriniz:");
		String s = scan.nextLine();
		
		System.out.println(donustur(s));
		
	}

}
