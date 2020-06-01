import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LoginManager {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        File file = new File("memberDB.txt");

        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.close();

            System.out.println("로그인 : 1 | 회원가입 : 2 ");

            switch (scan.nextInt()){
                case 1:
                    Login.MemberLogin();
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
