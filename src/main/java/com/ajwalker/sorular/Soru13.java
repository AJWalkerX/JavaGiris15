package com.ajwalker.sorular;

import java.util.Scanner;

/*Kullanıcıdan girilen girdi sonucunda * ile ters üçgen yaptırma*/
public class Soru13 {
	public static void main(String[] args) {
		int yildiz;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ucgen boyutu giriniz: ");
		yildiz = sc.nextInt();
		
		for (int i = yildiz; i > 0; i--){
			for (int j = 0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}