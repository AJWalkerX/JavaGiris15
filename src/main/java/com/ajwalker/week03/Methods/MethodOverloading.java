package com.ajwalker.week03.Methods;
//Method overloading: Aynı isimde farklı parametre tipinde veya farklı parametre sayılarında metodlar yazmak.
public class MethodOverloading {
	public static void main(String[] args) {
	
	}
	//Dışarından 2 int sayi parametre olarak alan ve toplamlarını int olarak dönen bir sum methodu
	public static int sum(int num, int num1){
		return num +num1;
	}
	//Dışarından 3 int sayi parametre olarak alan ve toplamlarını int olarak dönen bir sum methodu
	public static int sum(int num, int num1, int num2){
		return num +num1+num2;
	}
	//Dışarından 3 double sayi parametre olarak alan ve toplamlarını int olarak dönen bir sum methodu
	public static double sum(double num, double num1, double num2){
		return num +num1+num2;
	}
}