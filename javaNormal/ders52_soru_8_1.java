package javaNormal;

import java.util.ArrayList;
import java.util.Random;

public class ders52_soru_8_1 {

	public static void main(String[] args) {
		// S�f�r ile onbin aras�nda rastgele say�lardan olu�mu� 
		//4 elemanl� bir dizinin Ducci Sekanslar�n� hesaplat�n�z? (Ducci Squence i�in ayr�nt�l� bilgi i�in
		Random r = new Random();
		ArrayList<Integer> eski = new ArrayList<>();
		ArrayList<Integer> yeni = new ArrayList<>();
		int i;
		
		// ilk listeyi olu�tural�m
		for(i=0;i<4;i++) eski.add(r.nextInt(10000));
		System.out.println(eski);
		int toplam = 0;
		
		while(true) {
		for(i=0;i<4;i++) {
			if(i<3) {
				yeni.add(Math.abs(eski.get(i)-eski.get(i+1)));
			} else if(i==3) {
				yeni.add(Math.abs(eski.get(i)-eski.get(0)));
			}
		}
		System.out.println(yeni);
		
		for(i=0;i<4;i++) toplam += yeni.get(i);
		
		if(toplam==0) break;
		else {
			toplam=0;
			eski.clear();
			eski.addAll(yeni);
			yeni.clear();
		}		
		
		}
		
		
		
	}

}
