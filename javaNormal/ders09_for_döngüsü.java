package javaNormal;

public class ders09_for_d�ng�s� {

	public static void main(String[] args) {
		// for d�ng�s�
		int i;

		for(i=0;i<10;i++) {  // ++ birer art�r�r
			//System.out.print(i+"-");  //println alt alta yazar - print yanyana yazar
		}

		//0 - 250'ye kadar olan ve 7'ye b�l�nen say�lar� yazd�ral�m
		for(int j=0;j<250;j++) {
			if(j%7==0) {
				//System.out.print(j + " - ");
			}
		}

		//tersine d�ng�
		for(i=10;i>0;i--) { //-- birer azalt�r
			//System.out.print(i+" - ");
		}

		//atlamal� d�ng�
		for(i=0;i<500;i+=10) { 
			//System.out.print(i+" - ");
		}

		//tersine atlamal� d�ng�
		for(i=100;i>0;i-=13) { //-- birer azalt�r
			System.out.print(i+" - ");
		}



	}

}
