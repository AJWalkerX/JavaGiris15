package com.ajwalker.week03.diziler;

import java.util.Arrays;

/*
	{20,19,20,40,3,40,5,7,3} -> {20,19,40,3,5,7} {20,19,20,40,3,40,5,3,7,3}
**/
public class NoRepeatIndex {
	public static void main(String[] args) {
		int dizi[] = {20,19,20,40,3,40,5,3,7,3};
		int dizi2[];
		int dizi2Uzunluk = dizi.length;
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[i] == dizi[j]) {
					dizi2Uzunluk--;
					break;
				}
			}
		}
		System.out.println("Temp uzunluk: " + dizi2Uzunluk);
		dizi2 = new int[dizi2Uzunluk];
		
		//Dizi2'ye tekrarsız eleman ekleme
		boolean esitMi = false;
		int dizi2Index= 0;
		for (int i = 0; i < dizi.length; i++) {
			esitMi = false;
			for (int j = i + 1; j < dizi.length; j++) {
				if (dizi[i] == dizi[j]) { //tekrar eden deger varsa
					System.out.println(dizi[i]);
					esitMi = true;
					break;
				}
			}
			if (!esitMi){
				dizi2[dizi2Index]=dizi[i]; /* ! Hata */
				dizi2Index++;
			}
		}
		System.out.println(Arrays.toString(dizi2));
	}
}