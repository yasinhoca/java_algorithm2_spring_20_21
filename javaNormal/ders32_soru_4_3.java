package javaNormal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ders32_soru_4_3 {

	public static void main(String[] args) {
		// Yirmi elemanl� bir ArrayList'in i�erisini 0-1000 aras�ndaki rastgele se�ilmi� asal say�lar ile doldurunuz?
		Random r = new Random();
		int s,bolenSayac,sayac;
		ArrayList<Integer> liste = new ArrayList<>();
		sayac = 0;

		while(sayac<20) {
			s = r.nextInt(1000);
			bolenSayac=0;
			for(int i=2;i<s;i++) {
				if(s%i==0) bolenSayac++;
			}
			if(bolenSayac==0) {
				liste.add(s);
				sayac++;
			}
		}
		
		Collections.sort(liste);
		System.out.println(liste);

	}

}
