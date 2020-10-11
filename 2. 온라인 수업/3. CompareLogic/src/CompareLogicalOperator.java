import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class CompareLogicalOperator {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean compareAB;
		System.out.println("첫 번째 값을 입력");
		int a = scan.nextInt();
		System.out.println("두 번째 값을 입력");
		int b = scan.nextInt();
		
		System.out.println("A > B\t" + (a > b));
		System.out.println("A < B\t" + (a < b));
		System.out.println("A == B\t" + (a == b));
		System.out.println("A != B\t" + (a != b));
		
		System.out.println("A > 0 || B++ > 0\t" + (a > 0 || b++ > 0));
		System.out.println("a : " + a + "\t" + "b : " + b + "\r");
		
		System.out.println("A > 0 && B++ > 0\t" + (a > 0 && b++ > 0));
		System.out.println("a : " + a + "\t" + "b : " + b + "\r");
		

	}

}
