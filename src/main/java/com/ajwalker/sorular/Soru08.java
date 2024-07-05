package com.ajwalker.sorular;

import java.util.Scanner;

/*1'den 10'a kadar olan sayıların faktöriyelleri*/
public class Soru08 {
	public static void main(String[] args) {
		int num, factorial = 1;
		
		for (int i = 1; i <= 10; i++){
			factorial *= i;
			System.out.println(i+"!= " + factorial);
		}
		
	}
}