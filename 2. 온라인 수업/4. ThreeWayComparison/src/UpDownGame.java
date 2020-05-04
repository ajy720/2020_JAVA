import java.util.Scanner;

public class UpDownGame {
	
	static Scanner scan = new Scanner(System.in);
	
    public static void main(String[] args) {
        int rand = (int)(Math.random() * 100) + 1;
        System.out.println("*업다운 게임!! \r 1~100 사이의 숫자를 \r 10번 안에 맞추기");
        
        int guess;
        
        for (int i = 1; i <= 10; i++) {
        	System.out.println("\r숫자를 입력해주세요.");
			guess = scan.nextInt();
			
			if(guess == rand) {
				System.out.println(i+"번 만에 맞추셨습니다.");
				return ;
			}else {
				if(i==10) break;
				
				System.out.println((guess > rand) ? "Down" : "Up");
				System.out.println((10-i)+"번의 기회가 남았습니다.");
			}			
		}
        System.out.println("\r기회를 모두 사용하셨습니다.");
        scan.close();
        
    }
}
