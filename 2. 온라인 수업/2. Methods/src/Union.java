import java.util.Scanner;

public class Union {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("10의 자리와 1의 자리를 조합합니다.");
		
		System.out.println("\r10의 자리 숫자를 입력해주세요.");
		int t = TenthDigit.key(scan.nextInt());
		
		System.out.println("\r1의 자리 숫자를 입력해주세요.");
		int u = UnitDigit.key(scan.nextInt());
		
		System.out.println("입력하신 숫자는 " + (t+u) + "입니다.");
	}

}
