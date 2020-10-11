import java.io.File;
import java.util.Scanner;

public class LoginManager {
    static Scanner scan = new Scanner(System.in);
    static File memberDB;
    public static void main(String[] args) {
        memberDB = new File("memberDB.txt");

        while(true) {
            System.out.println("1 : 로그인 | 2 : 회원가입 | 3 : 종료");

            switch (scan.nextInt()) {
                case 1:
                    Login.login();
                    break;
                case 2:
                    Register.join();
                    break;
                case 3:
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
