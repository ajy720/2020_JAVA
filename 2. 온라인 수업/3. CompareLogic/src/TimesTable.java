import java.util.Scanner;

public class TimesTable {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] row = new int[1];
		int[] column = new int[] {1,2,3,4,5,6,7,8,9};
		
		System.out.println("원하시는 곱셈표(구구단)를 입력해주세요.\n");
		System.out.println("숫자 입력 : ");
		
		row[0] = scan.nextInt();
		
		for(int i = 0; i<9; i++) {
			System.out.println(row[0] + " * " + column[i] + " = " + row[0] * column[i]);
		}

	}

}
