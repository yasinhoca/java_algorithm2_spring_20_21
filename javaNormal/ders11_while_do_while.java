package javaNormal;

public class ders11_while_do_while {

	public static void main(String[] args) {
		// while d�ng�s�
		int sayac = 0;
		
		while (sayac<10) {
			//System.out.println("D�ng�n�n " + sayac + ". ad�m�");
			sayac++;
		}
		
		//sonsuz d�ng�
		//while(true) {
			
		//}
		
		//while(1<1) {
			
		//}
		
		//do-while
		int i = 100;
		do {
			System.out.print( i + "-");
			i-=5;
		} while (i>0);

	}

}
