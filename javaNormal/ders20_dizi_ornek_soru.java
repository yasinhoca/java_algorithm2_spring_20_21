package javaNormal;

import java.util.Random;

public class ders20_dizi_ornek_soru {

	public static void main(String[] args) {
		// 10 tane rastgele say� �retip bir diziye aktaral�m. (0-100 aras� rastgele say�)
		// ka� adet tek say� var? toplamlar�? ortalamalar� ka�?
		// ka� adet �ift say� var? toplamlar�? ortalamalar�?
		
		Random r = new Random(); // rastgele say� �retmek i�in nesne tan�ml�yoruz
		//System.out.println(r.nextInt(100));
		
		int[] dizi = new  int[10];
		int teksayac, ciftsayac, tektoplam, cifttoplam;
		float tekort,ciftort;
		teksayac = tektoplam = ciftsayac = cifttoplam = 0;
		
		for(int i=0;i<dizi.length;i++) {
			dizi[i]= r.nextInt(100);
			System.out.print(dizi[i]+"-");
			if(dizi[i]%2==0) {
				ciftsayac++;
				cifttoplam += dizi[i];
			} else {
				teksayac++;
				tektoplam += dizi[i];
			}
		}
		
		System.out.println();
		System.out.println("�ift say� adeti="+ciftsayac);
		System.out.println("�ift say� toplam�="+cifttoplam);
		ciftort = (float) cifttoplam / ciftsayac;
		System.out.println("�ift say� ortalamas�="+ciftort);
		System.out.println();
		System.out.println("Tek say� adeti="+teksayac);
		System.out.println("Tek say� toplam�="+tektoplam);
		tekort = (float) tektoplam / teksayac;
		System.out.println("Tek say� ortalamas�="+tekort);
	}

}
