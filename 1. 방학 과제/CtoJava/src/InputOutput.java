import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		System.out.println("수원정보과학고등학교");
		
		String message;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. : ");
		
		message = sc.nextLine();
		
		System.out.println("입력한 문자열 : " + message);
	}

}
