package com.ajwalker.strings;

public class StringClasses {
	public static void main(String[] args) {
//		String sınıfından constructer ile nesne oluşturma
		String ad = new String("Alexander");
//		"" işaretleri ile String nesnesi oluşturma:
		String soyad = "Walker";
		
		/*
		- StringBuilder mutable özelliği taşır fakat String immutable'dır.
		- Mutable özelliği yeni nesleler oluşturmadan değişiklikleri sağlar.
		- Fakat String her seferinde değişiklik esnasında yeni nesne oluşturur. Yani değiştirilemez.
		*/
		System.out.println("StringBuilder islemleri: ");
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Alexander J. Walker");
		System.out.println(strBuilder);
		System.out.println(strBuilder.replace(0,12, "Joseph"));
		System.out.println(strBuilder.insert(13," Awesome"));
		System.out.println(strBuilder.delete(0,14));
	}
}