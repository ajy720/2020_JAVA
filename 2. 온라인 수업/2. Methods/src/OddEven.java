import java.util.Scanner;

public class OddEven {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("홀짝 판별");
		System.out.println("몇 개의 숫자를 입력하시겠습니까? : ");
		int n = scan.nextInt();
		
		judgeNum(n);

	}

	private static void judgeNum(int n) {
		// TODO Auto-generated method stub
		for(int i=0; i<n; i++) {
			System.out.println((i+1) + "번째 수를 입력하세요. : ");
			int number = scan.nextInt();
			
			if(number % 2 == 0) {
				System.out.println("짝수입니다.\n");
			}
			else {
				System.out.println("홀수입니다.\n");
			}
		}
		
	}

}
