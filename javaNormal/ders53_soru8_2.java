package javaNormal;

public class ders53_soru8_2 {

	public static void main(String[] args) {
		/*  Kullanıcıdan alınan sayıyı yine kullanıcın istediği tabana dönüştüren Class tasarlayınız?
		Açıklama: Kullanıcıdan alınan sayı 12 olsun dönüştürülecek taban 2'li taban olsun.
		Taban.donustur(12,2) şeklinde girilen sayı 1100 şeklinde return edilsin.
		17 sayısı 5 tabınına dönüştürüleceğinde;
		Taban.donustur(17,5) şeklinde girilen sayı 32 şeklinde 5 tabanında return edilsin. 
		*/
		
		Tabanus t = new Tabanus();
		
		System.out.println(t.tabanBul(17, 3));
	
	}

}
