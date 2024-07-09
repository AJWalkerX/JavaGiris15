package com.ajwalker.week03;
//method,function, procedure, subprogram, subroutine
//metodlarla genellikle dışarıdan prametreler aracılığıyla değerleri alıp, işlem yapıp, genellikle değer döndürürler
public class Methods {
	public static void main(String[] args) {
		int toplam = topla(3,5);
		System.out.println(toplam);
		System.out.println(max(1,3));
	}
	public static int topla(int num1, int num2){
		return num1+num2;
	}
	public static int max(int a, int b){
		return (a>b)?a:b;
	}
}