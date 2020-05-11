import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1 : 회원가입 | 2 : 로그인 | 그 외 : 종료");
        switch (scan.nextInt()){
            case 1:
                MemberJoin.Join();
                break;
            case 2:
                Login.Login();
                break;
            default:
                System.out.println("종료합니다.");
                break;
        }
    }
}
