package java101;

import java.util.Scanner;

public class exercise {

	static int UsHesapla(int x, int f) {
		int total2 = 1;
		int p = 1;
		while (p <= f) {
			total2 *= x;
			p++;
		}
		return total2;
	}

	public static void main(String[] args) {

		System.out.println(UsHesapla(2, 3));
		System.out.println(UsHesapla(5, 3));

	}
}
