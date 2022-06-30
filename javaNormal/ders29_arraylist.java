package javaNormal;

import java.util.ArrayList;
import java.util.Collections;

public class ders29_arraylist {

	public static void main(String[] args) {
		// ArrayList = geli�mi� diziler
		
		// String, Integer, Character, Boolean, Float
		ArrayList<Integer> liste = new ArrayList<>();
		
		liste.add(3);
		liste.add(0);
		liste.add(1);
		liste.add(8);
		// 3,0,1,8		
		System.out.println(liste);
		//System.out.println(liste.get(0));
		//liste.get(2) -> 1
		//System.out.println(liste.get(4)); hata verir
		
		//araya eleman ekle
		liste.add(0,5); //0. indise 5 yazar
		System.out.println(liste);
		liste.add(2,2);
		System.out.println(liste);
		liste.add(1,9);
		System.out.println(liste);
		liste.add(liste.size()-1,4);
		System.out.println(liste);
		
		//var olan eleman� de�i�tiermek
		liste.set(0, 1);
		System.out.println(liste);
		
		//remove var olan elaman� silme
		liste.remove(0);
		System.out.println(liste);
		
		for(int x : liste) { //listelere �zel for d�ng�s�
			System.out.println(x);
		}
		
		//s�ralama
		Collections.sort(liste);
		System.out.println(liste);
		
		//b�y�kten k����e s�ralama
		Collections.reverse(liste);
		System.out.println(liste);
		
		//liste karma/harmanlama
		Collections.shuffle(liste);
		System.out.println(liste);
		
		//listeyi tamamen silme
		liste.clear();
		System.out.println(liste);
		
	}

}
