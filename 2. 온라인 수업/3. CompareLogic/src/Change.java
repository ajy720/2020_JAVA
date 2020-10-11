import java.util.Scanner;

public class Change {
	static Scanner scan = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
		System.out.println("10->2진수 : 1 입력");
		System.out.println("2->10진수 : 2 입력");
		System.out.println("선택 : ");
		switch(scan.nextInt()) {
			case 1:
				System.out.println("2진수로 변환할 10진수 입력: ");
				System.out.println(DecimalToBinary.DToB(scan.nextInt()));
				break;
				
			case 2:
				System.out.println("10진수로 변환할 2진수 입력: ");
				System.out.println(BinaryToDecimal.BToD(scan.next()));
				break;
				
		}
	}

}