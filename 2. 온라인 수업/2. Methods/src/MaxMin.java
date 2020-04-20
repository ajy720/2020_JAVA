import java.util.Scanner;

public class MaxMin {
	static Scanner scan = new Scanner(System.in);
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		System.out.println("최대값, 최소값 판별");
		System.out.println("몇 개의 숫자를 입력하시겠습니까? : ");
		int n = scan.nextInt();
		
		judgeNum(n);		
	}

	private static void judgeNum(int n) {
		for(int i=0; i<n; i++) {
			System.out.println((i+1) + "번째 수를 입력하세요.");
			int number = scan.nextInt();
			
			if(number > max) max = number;
			if(number < min) min = number;
			
			System.out.println("최대값 : " + max + "| 최소값 : " + min);
		}

		
	}

}
