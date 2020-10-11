import java.util.Scanner;

public class Complement {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("2진수를 입력하세요.");
		
		String in = scan.nextLine();
		int len = in.length();
		
		int[] bin = new int[len];
		
		for (int i = len - 1; i >= 0; i--) {
			bin[i] = Integer.parseInt(in.substring(i, i+1));			
		}
		
		System.out.println("\r입력한 2진수");
		print(bin);
				
		OnesComplement.oc(bin);
		TwosComplement.tc(bin);
	}
	
	// 반복되는 출력 작업 함수화
	public static void print(int[] bin) {
		for (int i = 0; i < bin.length; i++) System.out.print(bin[i] + " ");		
	}

}
