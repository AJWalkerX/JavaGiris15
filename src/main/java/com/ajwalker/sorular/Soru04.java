package com.ajwalker.sorular;

import java.util.Scanner;

/*
* Kullanıcının girdiği not bilgisine göre harf notu hesaplayan bir program yazmanız gerekiyor.
 90 ve üzeri AA,
 80-89 arası BA,
 70-79 arası BB,
 60-69 arası CB,
 50-59 arası CC,
 40-49 arası DC,
 30-39 arası DD,
 0-29 arası FF olarak belirlenmiştir.
 */
public class Soru04 {
	public static void main(String[] args) {
		int not;
		Scanner sc = new Scanner(System.in);
		System.out.print("Notunuzu giriniz: ");
		not = sc.nextInt();
		if(not >100){
			System.out.println("Not 100'den buyuk olamaz.");
		}
		else if (not >= 90){
			System.out.println("Notunuz: AA");
		}
		else if (not >= 80) {
			System.out.println("Notunuz: BA");
		}
		else if (not >= 70) {
			System.out.println("Notunuz: BB");
		}
		else if (not >= 60) {
			System.out.println("Notunuz: CB");
		}
		else if (not >= 50) {
			System.out.println("Notunuz: CC");
		}
		else if (not >= 40) {
			System.out.println("Notunuz: DC");
		}
		else if (not >= 30) {
			System.out.println("Notunuz: DD");
		}
		else {
			System.out.println("Hatali giris!");
		}
	}
}