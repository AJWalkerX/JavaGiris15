package com.ajwalker.assignments.week02.day05;
/*
artarak giden üçgenler(önce aşağıdakinin aynısı sonra kullanıcıdan alınan değer ile)
*
*
**
*
**
***
*
**
***
****

*/
public class Triangle03 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++){
			for (int j = 1; j <= i; j++){
				for (int k = 0; k<j; k++){
					System.out.print("*");
				}
				System.out.println();
			}
			
			
		}
	}
}