package javaNormal;

public class ders35_asal_method {

	static boolean asalMi(int s) {
		int bolenSayac=0;

		if(s>1) {
			for(int i=2;i<s;i++) {
				if(s%i==0) bolenSayac++;
			}

			if(bolenSayac==0) return true;
			else return false;
		} else return false;

	}

	public static void main(String[] args) {
		// Kendisine g�nderilen say� asal ise true de�erini
		// de�ilse false de�erini g�nderen method
		System.out.println(asalMi(104));

	}

}
