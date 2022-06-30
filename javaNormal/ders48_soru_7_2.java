package javaNormal;

import java.util.Random;

public class ders48_soru_7_2 {

	static String sifreOlustur(int boyut) {
		String s="";
		Random r = new Random();

		while(true) {
			//�retme a�amas�
			s="";
			for(int i=0;i<boyut;i++) {
				s += Integer.toString(r.nextInt(9)+1);
			}
			//kontrol a�amas�
			int sayac=0;
			int a,b;
			for(int i=0;i<boyut-1;i++) {
				a = Integer.parseInt(Character.toString(s.charAt(i)));
				b = Integer.parseInt(Character.toString(s.charAt(i+1)));
				if(a+1==b) sayac++;
			}
			if(sayac==0) break;
		}

		return s;
	}

	public static void main(String[] args) {
		// Bir i�letme kullan�c�lar� i�in 5 haneli ve {1,2,3,4,5,6,7,8,9}
		//rakamlar�ndan olu�acak bir �ifre �retmek istemektedir. Bu �ifre rastgele
		//olu�turulurken a�a��daki �u kurala uymak zorundad�r;

		//-�ifrede ard���k rakam olmayacakt�r. (�rnek 5 ten sonra 6 gelmeyecek)

		System.out.println(sifreOlustur(8));
		
	}

}
