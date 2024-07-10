package com.ajwalker.week03.Methods;

import java.util.Arrays;

//method,function, procedure, subprogram, subroutine
//metodlarla genellikle dışarıdan prametreler aracılığıyla değerleri alıp, işlem yapıp, genellikle değer döndürürler
public class Methods {
	public static void main(String[] args) {
		int toplam = topla(3,5);
		System.out.println(topla(3,5));
		System.out.println(max(1,3));
		toplam(3,5);
		System.out.println(Arrays.toString(notlar()));
	}
	public static int topla(int num1, int num2){
		return num1+num2;
	}
	public static int max(int a, int b){ //paramentrelerin scope'u yazıldığı metoddur.
		return (a>b)?a:b;
	}
	public static void toplam(int a, int b){
		System.out.println("void icerisinden merhaba");
		System.out.println(topla(a,b));
	}
	
	public static int[] notlar(){
		int[] notDizisi={5,6,1,3};
		return notDizisi;
	}
}