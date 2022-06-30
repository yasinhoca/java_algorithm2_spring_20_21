package javaNormal;

import java.util.ArrayList;
import java.util.Random;

public class ders37_soru_5_2 {
	
	static ArrayList<Character> donustur(int[] dizi){
		ArrayList<Character> liste = new ArrayList<>();
		
		for(int i=0;i<dizi.length;i++) {
			liste.add((char)dizi[i]);
		}
		
		return liste;
	}

	public static void main(String[] args) {
		// Kandisine g�nderilen say� dizisinin Ascii karakter kar��l�klar�
		// bir Arrayliste ekleyip return eden methodu yaz�n�z?
		
		int[] dizi = new int[10];
		Random r = new Random();
		
		for(int i=0;i<dizi.length;i++) {
			dizi[i] = r.nextInt(26)+65;
			System.out.print(dizi[i]+"-");
		}
		
		System.out.println();
		System.out.println(donustur(dizi));
	}

}
